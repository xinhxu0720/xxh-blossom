package com.blossom.backend.repository.mapper;

import com.blossom.backend.repository.model.StockTradeData;
import com.blossom.backend.repository.model.StockTradeDataExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StockTradeDataMapper {
    int countByExample(StockTradeDataExample example);

    int deleteByExample(StockTradeDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StockTradeData record);

    int insertSelective(StockTradeData record);

    List<StockTradeData> selectByExample(StockTradeDataExample example);

    StockTradeData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StockTradeData record, @Param("example") StockTradeDataExample example);

    int updateByExample(@Param("record") StockTradeData record, @Param("example") StockTradeDataExample example);

    int updateByPrimaryKeySelective(StockTradeData record);

    int updateByPrimaryKey(StockTradeData record);

    List<StockTradeData> getLastTradList();

}