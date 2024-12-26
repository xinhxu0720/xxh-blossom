import com.alibaba.fastjson.JSONArray;
import com.blossom.backend.APP;
import com.blossom.backend.repository.mapper.StockCompanyMapper;
import com.blossom.backend.repository.mapper.StockPriceMapper;
import com.blossom.backend.repository.mapper.UserStockMapper;
import com.blossom.backend.repository.model.*;
import com.blossom.backend.thirdparty.StockNewsScheduled;
import com.blossom.backend.thirdparty.TushareApi;
import com.blossom.backend.thirdparty.model.StockPriceBaseResp;
import com.blossom.backend.util.HttpUtils;
import com.blossom.backend.util.SendEmail;
import com.blossom.common.base.util.json.JsonUtil;
import com.blossom.common.base.util.okhttp.HttpUtil;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = APP.class)
@Slf4j
public class Stock {

    @Resource
    private StockCompanyMapper stockCompanyMapper;
    @Resource
    private StockPriceMapper stockPriceMapper;
    @Resource
    private UserStockMapper userStockMapper;

    @Resource
    private StockNewsScheduled stockNewsScheduled;

    private static final double THRESHOLD = 1.5; // 阈值：1%

    @Test
    public void test4() throws Exception {
       stockNewsScheduled.updateStockTradeData();
        //R<?> r = stockNewsScheduled.updateStockCompany();
    }

    @Test
    public void test3() throws MessagingException {

        UserStockExample example = new UserStockExample();
        example.createCriteria().andTalEqualTo("17600639720");
        List<UserStock> userStocks = userStockMapper.selectByExample(example);
        if (Objects.isNull(userStocks) || userStocks.isEmpty()) {
            return;
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

            double startPrice = Math.abs(Double.parseDouble(stockPrices.get(0).getPercent()));
            double endPrice = Math.abs(Double.parseDouble(stockPrices.get(stockPrices.size() - 1).getPercent()));

            double difference = endPrice - startPrice;


            //涨幅
            if (Math.abs(difference) >= THRESHOLD) {
                SendEmail.sendEmail(s + "：大幅波动波动" + s.getCodeName());
            }
        }
        System.out.println("结束时间：" + System.currentTimeMillis());
    }

    @Test
    public void test2() {
        long l = System.currentTimeMillis();

        StockCompanyExample example = new StockCompanyExample();
        example.createCriteria().andMarketEqualTo("主板")
                .andListStatusEqualTo("L");
        List<StockCompany> userStocks = stockCompanyMapper.selectByExample(example);
        if (Objects.isNull(userStocks) || userStocks.isEmpty()) {
            return;
        }
        Map<String, StockCompany> userStockMap = userStocks.stream().collect(Collectors.toMap(StockCompany::getTsCod, v -> v));
        List<List<StockCompany>> partitionedLists = Lists.partition(userStocks, 5);

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
    }

    @Test
    public void test() {

        System.out.println(System.currentTimeMillis());
        JSONArray rows = TushareApi.getStockCodeList();
        List<StockCodeInfo> list = new ArrayList<StockCodeInfo>();
        for (int i = 0; i < rows.size(); i++) {
            list.add(new StockCodeInfo(rows.getJSONArray(i)));
        }
        List<StockCompany> stockCompanyList = Lists.newArrayList();
        for (StockCodeInfo stockCodeInfo : list) {
            stockCompanyList.add(
                    StockCompany.builder().tsCod(stockCodeInfo.getType().toUpperCase() + stockCodeInfo.getCode())
                            .area(stockCodeInfo.getArea())
                            .symbol(stockCodeInfo.getType().toUpperCase())
                            .name(stockCodeInfo.getName())
                            .industry(stockCodeInfo.getIndustry())
                            .fullname(stockCodeInfo.getFullname())
                            .market(stockCodeInfo.getMarket())
                            .listStatus(stockCodeInfo.getList_status())
                            .listDate(null == stockCodeInfo.getList_date() ? "" : stockCodeInfo.getList_date().toString()).build()
            );
        }

        for (StockCompany stockCompany : stockCompanyList) {
            stockCompanyMapper.insertSelective(stockCompany);
        }

        System.out.println(list);
        System.out.println(System.currentTimeMillis());
    }

    public static String transformString(String input) {
        // 检查输入是否为空或null
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be null or empty");
        }

        // 查找点号的位置
        int dotIndex = input.indexOf('.');

        // 如果找不到点号，则直接返回原字符串（或者你可以抛出异常）
        if (dotIndex == -1) {
            return input;
            //throw new IllegalArgumentException("Input string must contain exactly one dot");
        }

        // 提取点号前后的部分
        String beforeDot = input.substring(0, dotIndex);
        String afterDot = input.substring(dotIndex + 1);

        // 组合新的字符串
        return afterDot + beforeDot;
    }

    public static void main(String[] args) throws IOException {
        String s = HttpUtil.get("https://stock.xueqiu.com/v5/stock/realtime/quotec.json?symbol=" + "SH603551");
        System.out.println(s);


        String str = HttpUtils.sendHttp("https://xueqiu.com/v4/stock/quote.json?code=SZ002510,SZ002511,SZ002512,SZ002513,SZ002514,SZ002515,SZ002516,SZ002517,SZ002518,SZ002519");
        // String str = HttpUtils.sendHttp("https://stock.xueqiu.com/v5/stock/finance/cn/indicator.json?symbol=SH603551");


        System.out.println(JsonUtil.toJson(str));

    }
}
