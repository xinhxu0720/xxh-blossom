package com.blossom.backend.repository.mapper;

import com.blossom.backend.repository.model.UserStock;
import com.blossom.backend.repository.model.UserStockExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserStockMapper {
    int countByExample(UserStockExample example);

    int deleteByExample(UserStockExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserStock record);

    int insertSelective(UserStock record);

    List<UserStock> selectByExample(UserStockExample example);

    UserStock selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserStock record, @Param("example") UserStockExample example);

    int updateByExample(@Param("record") UserStock record, @Param("example") UserStockExample example);

    int updateByPrimaryKeySelective(UserStock record);

    int updateByPrimaryKey(UserStock record);
}