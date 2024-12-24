package com.blossom.backend.thirdparty;

import com.blossom.backend.repository.mapper.*;
import com.blossom.backend.repository.model.*;
import com.blossom.backend.thirdparty.ai.kimi;
import com.blossom.backend.thirdparty.hefeng.stock.StockResp;
import com.blossom.backend.util.HttpUtils;
import com.blossom.backend.util.SendEmail;
import com.blossom.common.base.pojo.R;
import com.blossom.common.base.util.BeanUtil;
import com.blossom.common.base.util.json.JsonUtil;
import com.blossom.common.base.util.okhttp.HttpUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 三方接口定时任务
 *
 * @author : xzzz
 */
@RestController
@RequestMapping("/thirdparty/stockNews")
@Slf4j
public class StockNewsScheduled {

    @Resource
    private StockNewsArticlesMapper stockNewsArticlesMapper;

    @Resource
    private StockPriceMapper stockPriceMapper;

    @Resource
    private UserStockMapper userStockMapper;

    @Resource
    private StockCompanyMapper stockCompanyMapper;

    @Resource
    private StockReportsMapper stockReportsMapper;

    /**
     * 刷新天气缓存
     *
     * @apiNote 每30分钟刷新, 请求会立即刷新
     */
    //@TrackerStart
    @GetMapping("/updateStockNews")
    @Scheduled(cron = "0 0/5 * * * ?")
    public R<?> updateStockNews() throws IOException, InterruptedException {
        log.info("定时任务开启");
        String s = HttpUtil.get("https://news.10jqka.com.cn/app/flash/flashnews/v1/list?seq=0&tagId=62857");

        BaseResp baseResp = JsonUtil.toObj(s, BaseResp.class);

        BaseResp.DataInfo data = baseResp.getData();
        List<StockResp> list = data.getList();
        for (StockResp stockResp : list) {
            log.info("定时任务查询到结果 result={}", JsonUtil.toJson(stockResp));

            if (Objects.isNull(stockNewsArticlesMapper.selectByPrimaryKey(stockResp.getId()))) {
                StockNewsArticles articles = new StockNewsArticles();
                BeanUtil.copyProperties(stockResp, articles);
                articles.setSeq((long) stockResp.getSeq());
                articles.setStocks(JsonUtil.toJson(stockResp.getStocks()));
                articles.setFields(JsonUtil.toJson(stockResp.getFields()));
                String result = kimi.getResult(stockResp.getSummary(), stockNewsArticlesMapper, articles);
            }
        }
        log.info("定时任务结束");

        return R.ok();
    }

    @GetMapping("/updateStockPriceV2")
    @Scheduled(cron = "0/20 * * * * ? ")
    public R<?> updateStockPriceV2() throws IOException, InterruptedException {
        // 检查当前时间是否在范围内
        if (isTradingTime()) {
            long l = System.currentTimeMillis();

            StockCompanyExample example = new StockCompanyExample();
            example.createCriteria().andMarketEqualTo("主板")
                    .andListStatusEqualTo("L").andPeTtmNotEqualTo("");
            List<StockCompany> userStocks = stockCompanyMapper.selectByExample(example);
            if (Objects.isNull(userStocks) || userStocks.isEmpty()) {
                return R.ok();
            }
            log.info("查询总条数==============" + userStocks.size());

            Map<String, StockCompany> userStockMap = userStocks.stream().collect(Collectors.toMap(StockCompany::getTsCod, v -> v));
            List<List<StockCompany>> partitionedLists = Lists.partition(userStocks, 10);

            log.info("拆分成了多个列表==============" + partitionedLists.size());

            partitionedLists.stream().parallel().forEach(x -> {
                String commaSeparatedCodes = x.stream()
                        .map(StockCompany::getTsCod)
                        .collect(Collectors.joining(","));

                String str = HttpUtils.sendHttp("https://stock.xueqiu.com/v5/stock/batch/quote.json?extend=detail&symbol=" + commaSeparatedCodes);
                JsonNode resultNode = null;
                try {
                    resultNode = new ObjectMapper().readTree(str);
                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
                JsonNode items = resultNode.get("data").get("items");
                for (JsonNode node : items) {
                    JsonNode jsonNode = node.get("quote");
                    StockCompany stockCompany = userStockMap.get(jsonNode.get("symbol").asText());
                    StockPrice stockPrice = StockPrice.builder()
                            .codeName(stockCompany.getName())
                            .market(stockCompany.getMarket())
                            .createTime(new Date())
                            .code(jsonNode.get("symbol").asText())
                            .symbol(jsonNode.get("symbol").asText())
                            .current(jsonNode.get("current").asText())
                            .percent(jsonNode.get("percent").asText())
                            .chg(jsonNode.get("chg").asText())
                            .high(jsonNode.get("high").asText())
                            .low(jsonNode.get("low").asText())
                            .open(jsonNode.get("open").asText())
                            .lastClose(jsonNode.get("last_close").asText())
                            .volume(jsonNode.get("volume").asLong())
                            .amount(jsonNode.get("amount").asText())
                            .marketCapital(jsonNode.get("market_capital").asText())
                            .floatMarketCapital(jsonNode.get("float_market_capital").asText())
                            .turnoverRate(jsonNode.get("turnover_rate").asText())
                            .amplitude(jsonNode.get("amplitude").asText())
                            .avgPrice(jsonNode.get("avg_price").asText())
                            .tradeVolume(jsonNode.get("volume").asLong())
                            .currentYearPercent(jsonNode.get("current_year_percent").asText())
                            .peTtm(jsonNode.get("pe_ttm").asText())
                            .volumeRatio(jsonNode.get("volume_ratio").asText())
                            .symbol(jsonNode.get("symbol").asText()).build();

                    stockPriceMapper.insertSelective(stockPrice);
                    System.out.println("完成一组" + x.size());
                }
            });
            System.out.println("开始时间：" + l);
            System.out.println("结束时间：" + System.currentTimeMillis());

            log.info("定时任务结束");
        } else {
            log.info("当前时间不在早上的九点到下午的15点之间。");
            System.out.println("");
        }

        return R.ok();
    }

    @GetMapping("/updateStockPrice")
    public R<?> updateStockPrice() throws IOException, InterruptedException {
        // 检查当前时间是否在范围内
        if (isTradingTime()) {
            long l = System.currentTimeMillis();

            StockCompanyExample example = new StockCompanyExample();
            example.createCriteria().andMarketEqualTo("主板")
                    .andListStatusEqualTo("L");
            List<StockCompany> userStocks = stockCompanyMapper.selectByExample(example);
            if (Objects.isNull(userStocks) || userStocks.isEmpty()) {
                return R.ok();
            }
            Map<String, StockCompany> userStockMap = userStocks.stream().collect(Collectors.toMap(StockCompany::getTsCod, v -> v));
            List<List<StockCompany>> partitionedLists = Lists.partition(userStocks, 10);

            log.info("拆分成了多个列表==============" + partitionedLists.size());

            partitionedLists.stream().parallel().forEach(x -> {
                String commaSeparatedCodes = x.stream()
                        .map(StockCompany::getTsCod)
                        .collect(Collectors.joining(","));

                String s = HttpUtil.get("https://stock.xueqiu.com/v5/stock/realtime/quotec.json?symbol=" + commaSeparatedCodes);

                StockPriceBaseResp baseResp = JsonUtil.toObj(s, StockPriceBaseResp.class);

                List<StockPrice> list = baseResp.getData();

                for (StockPrice stockPrice : list) {
                    StockCompany stockCompany = userStockMap.get(stockPrice.getSymbol());
                    stockPrice.setCreateTime(new Date());
                    stockPrice.setLastClose(stockPrice.getLast_close());
                    stockPrice.setCode(stockPrice.getSymbol());
                    stockPrice.setCodeName(stockCompany.getName());
                    stockPrice.setMarket(stockCompany.getMarket());
                    stockPrice.setMarketCapital(stockPrice.getMarket_capital());
                    stockPrice.setFloatMarketCapital(stockPrice.getFloat_market_capital());
                    stockPrice.setTurnoverRate(stockPrice.getTurnover_rate());
                    stockPrice.setAvgPrice(stockPrice.getAvg_price());
                    stockPrice.setTradeVolume(stockPrice.getTrade_volume());
                    stockPrice.setCurrentYearPercent(stockPrice.getCurrent_year_percent());
                    stockPriceMapper.insertSelective(stockPrice);
                }
                System.out.println("完成一组" + x.size());
            });
            System.out.println("开始时间：" + l);
            System.out.println("结束时间：" + System.currentTimeMillis());

            log.info("定时任务结束");
        } else {
            System.out.println("当前时间不在早上的九点到下午的15点之间。");
        }

        return R.ok();
    }


    @GetMapping(value = "/updateStockCompany", name = "更新公司信息")
    @Scheduled(cron = "0 0 0,0,0,0 * * ? ")
    public R<?> updateStockCompany() throws Exception {
        log.info("更新公司定时任务开启");

        long l = System.currentTimeMillis();

        StockCompanyExample example = new StockCompanyExample();
        example.createCriteria().andMarketEqualTo("主板")
                .andListStatusEqualTo("L");
        List<StockCompany> userStocks = stockCompanyMapper.selectByExample(example);
        if (Objects.isNull(userStocks) || userStocks.isEmpty()) {
            return R.ok();
        }
        List<List<StockCompany>> partitionedLists = Lists.partition(userStocks, 10);

        log.info("拆分成了多个列表==============" + partitionedLists.size());

        partitionedLists.stream().parallel().forEach(x -> {
            String commaSeparatedCodes = x.stream()
                    .map(StockCompany::getTsCod)
                    .collect(Collectors.joining(","));

            String result = HttpUtils.sendHttp("https://xueqiu.com/v4/stock/quote.json?code=" + commaSeparatedCodes);

            JsonNode node = null;
            try {
                node = new ObjectMapper().readTree(result);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            for (StockCompany stockCompany : x) {
                JsonNode jsonNode = node.get(stockCompany.getTsCod());
                if (Objects.nonNull(jsonNode)) {
                    StockCompany update = new StockCompany();
                    update.setId(stockCompany.getId());
                    update.setPeTtm(jsonNode.get("pe_ttm").asText());
                    update.setHigh52Week(jsonNode.get("high52week").asText());
                    update.setLow52Week(jsonNode.get("low52week").asText());
                    update.setTotalShares(jsonNode.get("totalShares").asText());
                    update.setUpdateTime(new Date());
                    stockCompanyMapper.updateByPrimaryKeySelective(update);
                }
            }

            System.out.println("完成一组" + x.size());
        });
        System.out.println("开始时间：" + l);
        System.out.println("结束时间：" + System.currentTimeMillis());

        log.info("更新公司定时任务结束");

        return R.ok();
    }

    private static final double THRESHOLD = 1.5; // 阈值：1%
    private static final double NEGATIVE_THRESHOLD = -1.5; // 阈值：1%

    @GetMapping(value = "/stockAlarm", name = "涨幅阈值波动告警")
    @Scheduled(cron = "*/5 * * * * ?")
    public R<?> stockAlarm() throws Exception {
        if (isTradingTime()) {
            UserStockExample example = new UserStockExample();
            example.createCriteria().andTalEqualTo("17600639720");
            List<UserStock> userStocks = userStockMapper.selectByExample(example);
            if (Objects.isNull(userStocks) || userStocks.isEmpty()) {
                return R.ok();
            }
            List<String> codeList = userStocks.stream().map(UserStock::getCode).collect(Collectors.toList());
            long endTime = System.currentTimeMillis();
            long startTime = endTime - 5 * 60 * 1000; // 过去5分钟
            log.info("开始计算涨幅情况 startTime={} endTime={} codeList={}", startTime, endTime, codeList);

            for (UserStock s : userStocks) {

                StockPriceExample priceExample = new StockPriceExample();
                priceExample.createCriteria().andCodeEqualTo(s.getCode())
                        .andCreateTimeBetween(new Date(startTime), new Date(endTime));
                List<StockPrice> stockPrices = stockPriceMapper.selectByExample(priceExample);
                if (Objects.isNull(stockPrices) || stockPrices.isEmpty()) {
                    return R.ok();
                }
                double startPrice = Math.abs(Double.parseDouble(stockPrices.get(0).getPercent()));
                double endPrice = Math.abs(Double.parseDouble(stockPrices.get(stockPrices.size() - 1).getPercent()));

                double difference = endPrice - startPrice;


                //涨幅
                if (Math.abs(difference) >= THRESHOLD) {
                    sendNotification(s + "：大幅波动波动" + s.getCodeName());
                }
            }
            System.out.println("结束时间：" + System.currentTimeMillis());
        }
        return R.ok();
    }


    @GetMapping(value = "/updateStockCompanyReport", name = "更新公司信息财报信息")
    @Scheduled(cron = "0 0 0,0,0,0 * * ? ")
    public R<?> updateStockCompanyReport() throws Exception {
        log.info("更新==============公司报告=========================定时任务开启");

        long l = System.currentTimeMillis();

        StockCompanyExample example = new StockCompanyExample();
        example.createCriteria().andMarketEqualTo("主板")
                .andListStatusEqualTo("L");
        List<StockCompany> userStocks = stockCompanyMapper.selectByExample(example);
        if (Objects.isNull(userStocks) || userStocks.isEmpty()) {
            return R.ok();
        }
        userStocks.stream().parallel().forEach(userStock -> {
            String result = HttpUtils.sendHttp("https://stock.xueqiu.com/v5/stock/finance/cn/indicator.json?is_detail=1&symbol=" + userStock.getTsCod());

            JsonNode resultNode = null;
            try {
                resultNode = new ObjectMapper().readTree(result);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }

            JsonNode jsonNode = resultNode.get("data").get("list");

            for (JsonNode node : jsonNode) {
                StockReports build = StockReports.builder().avgRoe(node.get("avg_roe").get(0).asText())
                        .reportDate(node.get("report_date").asText())
                        .reportName(node.get("report_name").asText())
                        .totalRevenue(node.get("total_revenue").get(0).asText())
                        .npPerShare(node.get("np_per_share").get(0).asText())
                        .operateCashFlowPs(node.get("operate_cash_flow_ps").get(0).asText())
                        .basicEps(node.get("basic_eps").get(0).asText())
                        .operatingIncomeYoy(node.get("operating_income_yoy").get(0).asText())
                        .assetLiabRatio(node.get("asset_liab_ratio").get(0).asText())
                        .rop(node.get("rop").get(0).asText())
                        .netSellingRate(node.get("net_selling_rate").get(0).asText())
                        .netInterestOfTotalAssets(node.get("net_interest_of_total_assets").get(0).asText())
                        .grossSellingRate(node.get("gross_selling_rate").get(0).asText())
                        .ctime(node.get("ctime").asText())
                        .code(userStock.getTsCod())
                        .name(userStock.getName())
                        .createTime(new Date())
                        .updateTime(new Date()).build();
                StockReportsExample reportsExample = new StockReportsExample();
                reportsExample.createCriteria().andCodeEqualTo(userStock.getTsCod())
                        .andReportNameEqualTo(build.getReportName());
                List<StockReports> stockReports = stockReportsMapper.selectByExample(reportsExample);
                if (Objects.nonNull(stockReports) && !stockReports.isEmpty()) {
                    continue;
                  /*  StockReports reports = stockReports.get(0);
                    build.setId(reports.getId());
                    build.setCreateTime(null);
                    stockReportsMapper.updateByPrimaryKeySelective(build);*/
                } else {
                    stockReportsMapper.insertSelective(build);
                }
            }
            log.info("更新==============公司报告=========================单个完成：" + userStock.getName());
        });
        for (StockCompany userStock : userStocks) {

        }


        System.out.println("开始时间：" + l);
        System.out.println("结束时间：" + System.currentTimeMillis());

        log.info("更新==============公司报告=========================定时任务结束");

        return R.ok();
    }


    private static void sendNotification(String str) throws MessagingException {
        log.info("有大幅波动波动=================================================");
        SendEmail.sendEmail(str);
    }

    public static boolean isTradingTime() {
        // 获取当前时间（使用系统默认时区，这里使用上海时区作为示例）
        ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        LocalTime currentTime = now.toLocalTime();
        DayOfWeek currentDay = now.getDayOfWeek();

        // 定义交易时间范围
        LocalTime morningStartTime = LocalTime.of(9, 15);
        LocalTime morningEndTime = LocalTime.of(11, 30);
        LocalTime afternoonStartTime = LocalTime.of(13, 0);
        LocalTime afternoonEndTime = LocalTime.of(15, 0);

        // 检查当天是否是周末
        boolean isWeekend = currentDay == DayOfWeek.SATURDAY || currentDay == DayOfWeek.SUNDAY;

        // 检查当前时间是否在交易时间段内
        boolean isMorning = currentTime.isAfter(morningStartTime) && currentTime.isBefore(morningEndTime);
        boolean isAfternoon = currentTime.isAfter(afternoonStartTime) && currentTime.isBefore(afternoonEndTime);

        // 返回结果：不是周末且在交易时间段内
        return !isWeekend && (isMorning || isAfternoon);
    }

    public static void main(String[] args) {
        // 测试方法
        if (isTradingTime()) {
            System.out.println("当前是股票交易时间。");
        } else {
            System.out.println("当前不是股票交易时间。");
        }

        double startPrice = -2.0;
        double endPrice = 5.0;

        System.out.println(startPrice - endPrice);
    }

}
