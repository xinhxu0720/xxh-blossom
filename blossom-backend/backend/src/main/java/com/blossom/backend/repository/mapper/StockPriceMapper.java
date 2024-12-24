package com.blossom.backend.repository.mapper;

import com.blossom.backend.repository.model.StockPrice;
import com.blossom.backend.repository.model.StockPriceExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StockPriceMapper {
    int countByExample(StockPriceExample example);

    int deleteByExample(StockPriceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StockPrice record);

    int insertSelective(StockPrice record);

    List<StockPrice> selectByExample(StockPriceExample example);

    StockPrice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StockPrice record, @Param("example") StockPriceExample example);

    int updateByExample(@Param("record") StockPrice record, @Param("example") StockPriceExample example);

    int updateByPrimaryKeySelective(StockPrice record);

    int updateByPrimaryKey(StockPrice record);
}