package com.sss.calculator.service;

import com.sss.calculator.model.Employee;
import com.sss.calculator.model.SaleInfo;
import com.sss.calculator.model.SaleInfoExample;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈说明〉<br>
 * 〈〉
 *
 * @author
 * @Date: 2019/1/15 0015
 * @Description:
 * @since 1.0.0
 */
public interface SaleInfoService {
    ArrayList<SaleInfo> selectSaleInfo(SaleInfoExample example);

    List<Employee> getAllEmployee();

    void findSaleInfo();

    List<SaleInfo> selectByExample(SaleInfoExample example);

    void timeUpdateOrInsert(List<SaleInfo> saleInfos);

    void historySaleInfo();


}
