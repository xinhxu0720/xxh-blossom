package com.blossom.backend.repository.mapper;

import com.blossom.backend.repository.model.StockCompany;
import com.blossom.backend.repository.model.StockCompanyExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StockCompanyMapper {
    int countByExample(StockCompanyExample example);

    int deleteByExample(StockCompanyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StockCompany record);

    int insertSelective(StockCompany record);

    List<StockCompany> selectByExample(StockCompanyExample example);

    StockCompany selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StockCompany record, @Param("example") StockCompanyExample example);

    int updateByExample(@Param("record") StockCompany record, @Param("example") StockCompanyExample example);

    int updateByPrimaryKeySelective(StockCompany record);

    int updateByPrimaryKey(StockCompany record);
}