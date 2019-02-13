/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: AssessSalaryServiceImpl
 * Author:   Administrator
 * Date:     2019/1/15 0015 14:28
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sss.calculator.service.serviceimpl;


import com.sss.calculator.dao.AssessSalaryDao;
import com.sss.calculator.model.AssessSalary;
import com.sss.calculator.service.AssessSalaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * 〈获取职位等级对应岗位薪资〉<br>
 * 〈〉
 *
 * @author Administrator
 * @create 2019/1/15 0015
 * @since 1.0.0
 */
@Service
public class AssessSalaryServiceImpl implements AssessSalaryService {
    @Resource
    private AssessSalaryDao assessSalaryDao;

    @Override
    public ArrayList<AssessSalary> selectByJobStar(String jobgrade, String starLevel, String year) {
        return assessSalaryDao.selectByPrimaryKey(jobgrade,starLevel,year);
    }
}
