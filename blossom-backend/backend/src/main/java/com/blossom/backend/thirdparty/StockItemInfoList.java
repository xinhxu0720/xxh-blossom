package com.blossom.backend.thirdparty;

import com.blossom.backend.repository.model.StockPrice;
import lombok.Data;

@Data
public class StockItemInfoList {
    private Object market;
    private StockPrice quote;
    private Object others;
}
