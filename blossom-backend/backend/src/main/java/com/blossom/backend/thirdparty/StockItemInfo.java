package com.blossom.backend.thirdparty;

import lombok.Data;

import java.util.List;

@Data
public class StockItemInfo {
    private List<StockItemInfoList> items;
    private String items_size;
}
