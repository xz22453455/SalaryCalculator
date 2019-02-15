/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: AssessSalaryService
 * Author:   wangcm
 * Date:     2019/1/15 0015 14:26
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sss.calculator.service;

import com.sss.calculator.model.AssessSalary;

import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author wangcm
 * @create 2019/1/15 0015
 * @since 1.0.0
 */
public interface AssessSalaryService {
    ArrayList<AssessSalary> selectByJobStar(String jobgrade, String starLevel, String year);
}
