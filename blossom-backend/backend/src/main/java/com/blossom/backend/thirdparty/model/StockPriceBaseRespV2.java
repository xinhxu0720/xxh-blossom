package com.blossom.backend.thirdparty.model;

import com.blossom.backend.thirdparty.model.StockItemInfo;
import lombok.Data;

@Data
public class StockPriceBaseRespV2 {
    private Integer status_code;
    private String error_description;
    private StockItemInfo data;

}