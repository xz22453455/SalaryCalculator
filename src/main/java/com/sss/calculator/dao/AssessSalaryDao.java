package com.sss.calculator.dao;


import com.sss.calculator.model.AssessSalary;
import com.sss.calculator.model.AssessSalaryExample;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

public interface AssessSalaryDao {
    int countByExample(AssessSalaryExample example);

    int deleteByExample(AssessSalaryExample example);

    int deleteByPrimaryKey(@Param("jobgrade") String jobgrade, @Param("starLevel") String starLevel, @Param("year") String year, @Param("examinationItem") String examinationItem);

    int insert(AssessSalary record);

    int insertSelective(AssessSalary record);

    List<AssessSalary> selectByExample(AssessSalaryExample example);

    ArrayList<AssessSalary> selectByPrimaryKey(@Param("jobgrade") String jobgrade, @Param("starLevel") String starLevel, @Param("year") String year);

    int updateByExampleSelective(@Param("record") AssessSalary record, @Param("example") AssessSalaryExample example);

    int updateByExample(@Param("record") AssessSalary record, @Param("example") AssessSalaryExample example);

    int updateByPrimaryKeySelective(AssessSalary record);

    int updateByPrimaryKey(AssessSalary record);
}