package com.blossom.backend.repository.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
@Builder
public class StockTradeData {
    private Integer id;

    private String code;

    private Long timestamp;

    private Integer volume;

    private BigDecimal current;

    private BigDecimal avgPrice;

    private BigDecimal chg;

    private BigDecimal percent;

    private Long amount;

    private Integer buyVolume;

    private Integer sellVolume;

    private Date createTime;
}