package com.blossom.backend.repository.mapper;

import com.blossom.backend.repository.model.StockReports;
import com.blossom.backend.repository.model.StockReportsExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StockReportsMapper {
    int countByExample(StockReportsExample example);

    int deleteByExample(StockReportsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StockReports record);

    int insertSelective(StockReports record);

    List<StockReports> selectByExample(StockReportsExample example);

    StockReports selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StockReports record, @Param("example") StockReportsExample example);

    int updateByExample(@Param("record") StockReports record, @Param("example") StockReportsExample example);

    int updateByPrimaryKeySelective(StockReports record);

    int updateByPrimaryKey(StockReports record);
}