package com.blossom.backend.thirdparty.model;

import com.blossom.backend.repository.model.StockPrice;
import lombok.Data;

import java.util.List;

@Data
public class StockPriceBaseResp {
   private Integer status_code;
    private String status_msg;
    private List<StockPrice> data;


}
