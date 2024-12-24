package com.blossom.backend.repository.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class StockCompany {
    private Integer id;

    private String tsCod;

    private String symbol;

    private String name;

    private String area;

    private String industry;

    private String fullname;

    private String market;

    private String listStatus;

    private String listDate;

    private String peTtm;

    private String high52Week;

    private String low52Week;

    private String totalShares;

    private Date createTime;

    private Date updateTime;
}