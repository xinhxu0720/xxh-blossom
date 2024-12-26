package com.blossom.backend.thirdparty.model;

import lombok.Data;

import java.util.List;

@Data
public class StockItemInfo {
    private List<StockItemInfoList> items;
    private String items_size;
}
