package com.blossom.backend.repository.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class StockPrice {
    private Integer id;

    private String code;
    private String symbol;
    private String codeName;

    private String current;

    private String percent;

    private String chg;

    private String high;

    private String low;

    private String open;

    private String lastClose;
    private String last_close;

    private Date createTime;

    private Long volume;

    private String amount;

    private String marketCapital;
    private String market_capital;

    private String floatMarketCapital;
    private String float_market_capital;

    private String turnoverRate;
    private String turnover_rate;

    private String amplitude;

    private String avgPrice;
    private String avg_price;

    private Long tradeVolume;
    private Long trade_volume;

    private String currentYearPercent;
    private String current_year_percent;

    private String market;

    private String peTtm;
    private String pe_ttm;
    private String volumeRatio;
    private String volume_ratio;
}