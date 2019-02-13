package com.sss.calculator.dao;

import com.sss.calculator.model.FieldVariableRef;
import com.sss.calculator.model.FieldVariableRefExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FieldVariableRefDao {
    long countByExample(FieldVariableRefExample example);

    int deleteByExample(FieldVariableRefExample example);

    int insert(FieldVariableRef record);

    int insertSelective(FieldVariableRef record);

    List<FieldVariableRef> selectByExample(FieldVariableRefExample example);

    FieldVariableRef selectByYear(@Param("year") String year);


    int updateByExampleSelective(@Param("record") FieldVariableRef record, @Param("example") FieldVariableRefExample example);

    int updateByExample(@Param("record") FieldVariableRef record, @Param("example") FieldVariableRefExample example);
}