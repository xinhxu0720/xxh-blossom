package com.blossom.backend.thirdparty;

import com.blossom.backend.thirdparty.hefeng.stock.StockResp;
import lombok.Data;

import java.util.List;

@Data
public class BaseResp {
    private Integer error_code;
    private String error_description;
    private DataInfo data;

    @Data
    public static class DataInfo {
        private List<StockResp> list;
    }
}
