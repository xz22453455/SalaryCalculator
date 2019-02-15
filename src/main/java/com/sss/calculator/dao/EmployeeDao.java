package com.sss.calculator.dao;

import com.sss.calculator.model.Employee;
import com.sss.calculator.model.EmployeeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
//dsf
public interface EmployeeDao {

    int countByExample(EmployeeExample example);

    int deleteByExample(EmployeeExample example);

    int insert(Employee record);

    int insertSelective(Employee record);

    List<Employee> selectByExample(EmployeeExample example);

    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

}
