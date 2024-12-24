package com.blossom.backend.thirdparty;

import lombok.Data;

import java.util.List;

public class StockPriceRespV2 {


    /**
     * data : {"items":[{"market":{"status_id":1,"region":"CN","status":"未开盘","time_zone":"Asia/Shanghai","time_zone_desc":null,"delay_tag":0},"quote":{"symbol":"SH603551","code":"603551","exchange":"SH","name":"奥普科技","type":11,"sub_type":"ASH","status":1,"current":11.29,"currency":"CNY","percent":0.18,"chg":0.02,"timestamp":1734678000000,"time":1734678000000,"lot_size":100,"tick_size":0.01,"open":11.27,"last_close":11.27,"high":11.43,"low":11.18,"avg_price":11.288,"volume":1638977,"amount":18501079,"turnover_rate":0.41,"amplitude":2.22,"market_capital":4531094730,"float_market_capital":4514058120,"total_shares":401337000,"float_shares":399828000,"issue_date":1579017600000,"lock_set":null,"current_year_percent":17.51,"high52w":12.27,"low52w":6.9677,"limit_up":12.4,"limit_down":10.14,"volume_ratio":0.6,"eps":0.73,"pe_ttm":15.544,"pe_forecast":18.226,"pe_lyr":14.649,"navps":3.3628,"pb":3.357,"dividend":1.1,"dividend_yield":9.743,"profit":3.0931997734E8,"profit_four":2.9150957379E8,"profit_forecast":248607785,"pledge_ratio":null,"goodwill_in_net_assets":null,"timestamp_ext":null,"current_ext":null,"volume_ext":null,"traded_amount_ext":null,"no_profit":null,"no_profit_desc":null,"weighted_voting_rights":null,"weighted_voting_rights_desc":null,"is_registration":"N","is_registration_desc":"否","is_vie":null,"is_vie_desc":null,"security_status":null},"others":{"cyb_switch":true},"tags":[]}],"items_size":1}
     * error_code : 0
     * error_description :
     */

    private DataBean data;
    private int error_code;
    private String error_description;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getError_description() {
        return error_description;
    }

    public void setError_description(String error_description) {
        this.error_description = error_description;
    }

    public static class DataBean {

        private int items_size;
        private List<ItemsBean> items;

        public int getItems_size() {
            return items_size;
        }

        public void setItems_size(int items_size) {
            this.items_size = items_size;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        @Data
        public static class ItemsBean {


            private MarketBean market;
            private QuoteBean quote;

            @Data
            public static class MarketBean {
                private int status_id;
                private String region;
                private String status;
                private String time_zone;
                private Object time_zone_desc;
                private int delay_tag;
            }

            @Data
            public static class QuoteBean {

                private String symbol;
                private String code;
                private String exchange;
                private String name;
                private int type;
                private String sub_type;
                private int status;
                private double current;
                private String currency;
                private double percent;
                private double chg;
                private long timestamp;
                private long time;
                private int lot_size;
                private double tick_size;
                private double open;
                private double last_close;
                private double high;
                private double low;
                private double avg_price;
                private int volume;
                private int amount;
                private double turnover_rate;
                private double amplitude;
                private long market_capital;
                private long float_market_capital;
                private int total_shares;
                private int float_shares;
                private long issue_date;
                private Object lock_set;
                private double current_year_percent;
                private double high52w;
                private double low52w;
                private double limit_up;
                private double limit_down;
                private double volume_ratio;
                private double eps;
                private double pe_ttm;
                private double pe_forecast;
                private double pe_lyr;
                private double navps;
                private double pb;
                private double dividend;
                private double dividend_yield;
                private double profit;
                private double profit_four;
                private int profit_forecast;
                private Object pledge_ratio;
                private Object goodwill_in_net_assets;
                private Object timestamp_ext;
                private Object current_ext;
                private Object volume_ext;
                private Object traded_amount_ext;
                private Object no_profit;
                private Object no_profit_desc;
                private Object weighted_voting_rights;
                private Object weighted_voting_rights_desc;
                private String is_registration;
                private String is_registration_desc;
                private Object is_vie;
                private Object is_vie_desc;
                private Object security_status;
            }
        }
    }
}