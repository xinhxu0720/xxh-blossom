package com.blossom.backend.thirdparty;

import lombok.Data;

@Data
public class StockPriceBaseRespV2 {
    private Integer status_code;
    private String error_description;
    private StockItemInfo data;

}