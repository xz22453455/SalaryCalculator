package com.sss.calculator.dao;

import com.sss.calculator.model.MeritSalary;
import com.sss.calculator.model.MeritSalaryExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MeritSalaryDao {
    long countByExample(MeritSalaryExample example);

    int deleteByExample(MeritSalaryExample example);

    int insert(MeritSalary record);

    int insertSelective(MeritSalary record);

    List<MeritSalary> selectByExample(MeritSalaryExample example);

    int updateByExampleSelective(@Param("record") MeritSalary record, @Param("example") MeritSalaryExample example);

    int updateByExample(@Param("record") MeritSalary record, @Param("example") MeritSalaryExample example);
}