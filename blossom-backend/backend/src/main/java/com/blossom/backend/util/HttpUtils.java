package com.blossom.backend.util;

import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/*
* https://stock.xueqiu.com/v5/stock/finance/cn/indicator.json?symbol=SH600690&type=Q4&is_detail=true&count=5&timestamp=
* */
public class HttpUtils {

    public static void main(String[] args) {
        String s = sendHttp("https://stock.xueqiu.com/v5/stock/finance/cn/indicator.json?symbol=SH600690&type=Q4&is_detail=true&count=5&timestamp=");
        System.out.println(s);
    }

    public static String sendHttp(String url){
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            // 创建httpget.
            HttpGet httpget = new HttpGet(url);
            httpget.addHeader("cookie",
                    "xq_a_token=e4d199a6f32569bc4985439de6ff30901a2bcb96;" +
                            "xqat=e4d199a6f32569bc4985439de6ff30901a2bcb96;" +
                            "xq_r_token=f90a29eb6817e929c45d7c68b9df37cbc7777d3d;" +
                            "xq_id_token=eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJ1aWQiOjQyMzA5NzQ2MDIsImlzcyI6InVjIiwiZXhwIjoxNzM2ODM2NTI4LCJjdG0iOjE3MzQyNDQ1Mjg0MDgsImNpZCI6ImQ5ZDBuNEFadXAifQ.Jv-Jp3q1ftq5csqBL3n2_-YY-JHsbjTe-LqDe4isltDHfARwzQZdO2ip2lGIwFS7W3B2J3tdCeo0SbFthE4gJXJQj7_h1LLJCUEKHrpoSXc1OCMJ8yF3UxVHmPRDtJulWoTHBXc29RIP_mgw2dtvkFkZlrUoveSKva0z4z7ND9JZLJwnQy7pCN-mKIKR6b6XmZQuhkNKiLvqTG7pLJ8ybDS9FBFjuWI4mgyzsjv3t2LNySwyj5kH2adl7yKqbSKRha6YPwZpiLKdNZr3WavEs63kvWHmlfqgf7VyoE9bfDV8H7znHShuF1hjBaUtYZaivAmOOpsFsP4kcfHZYPcC_w; " +
                            "u=4230974602;" +
                            "Hm_lvt_1db88642e346389874251b5a1eded6e3=1734193636,1735090638;" +
                            "device_id=db4f11ccdb5ab5620448eba443476969;" +
                            "s=bj151oi3os; is_overseas=0;" +
                            "Hm_lpvt_1db88642e346389874251b5a1eded6e3=1735090648");
            // 执行get请求.
            CloseableHttpResponse response = httpclient.execute(httpget);
            try {
                // 获取响应实体
                HttpEntity entity = response.getEntity();
                // 打印响应状态
                if (entity != null) {
                    return EntityUtils.toString(entity);
                }
            } finally {
                response.close();
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭连接,释放资源
            try {
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "";
    }
}
