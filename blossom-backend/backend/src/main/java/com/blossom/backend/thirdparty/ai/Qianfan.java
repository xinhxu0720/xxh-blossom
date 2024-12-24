package com.blossom.backend.thirdparty.ai;

import com.blossom.common.base.util.json.JsonUtil;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import shade.okhttp3.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Slf4j
public class Qianfan {

    public static final String API_KEY = "hXe1Lt4kr4ZhSWxbvsENMKMt";
    public static final String SECRET_KEY = "eELBi4Y3G5KhS104vJSWVcVa49XfE9lH";

    static final OkHttpClient HTTP_CLIENT = new OkHttpClient().newBuilder()
            .connectTimeout(60, TimeUnit.SECONDS) // 连接超时时间
            .readTimeout(60, TimeUnit.SECONDS)    // 读取超时时间
            .writeTimeout(60, TimeUnit.SECONDS)   // 写入超时时间
            .build();


    public static void main(String[] args) throws IOException {
        String result = getResult("沪镍主力合约日内涨幅达2.00%，现报12.72万元/吨");
        System.out.println(JsonUtil.toJson(result));
    }

    public static String getResult(String content) throws IOException {


        MediaType mediaType = MediaType.parse("application/json");
        RequestParam param = new RequestParam();


        List<MessagesItem> list = new ArrayList<>();
        list.add(MessagesItem.builder().role("user").content(content).build());
        param.setMessages(list);

        String requestJson = JsonUtil.toJson(param);

        System.out.println(requestJson);

        log.info("请求千帆开始 ============ requestJson={}", requestJson);
        RequestBody body = RequestBody.create(mediaType, requestJson);

        Request request = new Request.Builder()
                .url("https://aip.baidubce.com/rpc/2.0/ai_custom/v1/wenxinworkshop/chat/completions_pro?access_token=" + getAccessToken())
                .method("POST", body)
                .addHeader("Content-Type", "application/json")
                .build();
        Response response = HTTP_CLIENT.newCall(request).execute();

        String responseBody = response.body().string();
        log.info("请求千帆结束 ============ responseBody={}", responseBody);

        Map map = JsonUtil.toMap(responseBody);
        return map.get("result").toString();
    }


    /**
     * 从用户的AK，SK生成鉴权签名（Access Token）
     *
     * @return 鉴权签名（Access Token）
     * @throws IOException IO异常
     */
    static String getAccessToken() throws IOException {
        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody body = RequestBody.create(mediaType, "grant_type=client_credentials&client_id=" + API_KEY
                + "&client_secret=" + SECRET_KEY);
        Request request = new Request.Builder()
                .url("https://aip.baidubce.com/oauth/2.0/token")
                .method("POST", body)
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .build();
        Response response = HTTP_CLIENT.newCall(request).execute();
        String string = response.body().string();
        Map map = JsonUtil.toMap(string);
        return map.get("access_token").toString();
    }

    @Data
    public static class RequestParam {

        /**
         * 是否开启上角标返回，说明：
         * （1）开启后，有概率触发搜索溯源信息search_info，search_info内容见响应参数介绍
         * （2）默认false，不开启
         * （3）注意：本字段不控制是否关闭实时搜索功能，该功能请参见disable_search字段。如果设置了disable_search=true，那么本字段无效
         */
        private Boolean enable_citation = false;
        /**
         * 是否强制关闭实时搜索功能，可选值：
         * · true：关闭
         * · false：表示不关闭，默认false
         */
        private Boolean disable_search = false;

        /**
         * 人设
         */
        private String system = "你是一位专业的A股股票交易员，我会把当天的新闻提供给你，你通过新闻以及当下的局势来分析一下，这个消息是利好，还是利空？利好的话哪些股票会涨呢？推荐几只会涨的龙头股给我,必须是明显利好的才给我推荐,并且在返回的结果里必须包含 -这是利好的消息- 这5个连续字体，如果不是很明显无须推荐，利空的话，哪些股票会跌呢？";

        /**
         * 消息
         */
        private List<MessagesItem> messages;

        /**
         * 是否开启系统记忆，说明：
         * （1）false：未开启，默认false
         * （2）true：表示开启，开启后，system_memory_id字段必填
         */
        private Boolean enable_system_memory = false;


    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class MessagesItem {
        private String role;
        private String content;
    }
}
