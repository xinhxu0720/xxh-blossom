package com.blossom.backend.thirdparty.hefeng.stock;

import lombok.Data;

import java.util.List;

@Data
public class StockResp {
    private String summary;
    private String appUrl;
    private int updateTime;
    private String title;
    private int type;
    private int shareAmount;
    private String url;
    private List<StocksItem> stocks;
    private String picUrl;
    private int createTime;
    private String shareUrl;
    private int readAmount;
    private int id;
    private List<FieldsItem> fields;
    private int seq;


}