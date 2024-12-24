package com.blossom.backend.repository.mapper;

import com.blossom.backend.repository.model.StockNewsArticles;
import com.blossom.backend.repository.model.StockNewsArticlesExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StockNewsArticlesMapper {
    int countByExample(StockNewsArticlesExample example);

    int deleteByExample(StockNewsArticlesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StockNewsArticles record);

    int insertSelective(StockNewsArticles record);

    List<StockNewsArticles> selectByExampleWithBLOBs(StockNewsArticlesExample example);

    List<StockNewsArticles> selectByExample(StockNewsArticlesExample example);

    StockNewsArticles selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StockNewsArticles record, @Param("example") StockNewsArticlesExample example);

    int updateByExampleWithBLOBs(@Param("record") StockNewsArticles record, @Param("example") StockNewsArticlesExample example);

    int updateByExample(@Param("record") StockNewsArticles record, @Param("example") StockNewsArticlesExample example);

    int updateByPrimaryKeySelective(StockNewsArticles record);

    int updateByPrimaryKeyWithBLOBs(StockNewsArticles record);

    int updateByPrimaryKey(StockNewsArticles record);
}