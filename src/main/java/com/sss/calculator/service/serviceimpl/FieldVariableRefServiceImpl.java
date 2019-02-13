/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: FieldVariableRefServiceImpl
 * Author:   Administrator
 * Date:     2019/1/17 0017 11:17
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sss.calculator.service.serviceimpl;

import com.sss.calculator.dao.FieldVariableRefDao;
import com.sss.calculator.model.FieldVariableRef;
import com.sss.calculator.service.FieldVariableRefService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 〈获取字段对应算法变量〉<br>
 * 〈〉
 *
 * @author Administrator
 * @create 2019/1/17 0017
 * @since 1.0.0
 */
@Service
public class FieldVariableRefServiceImpl implements FieldVariableRefService {
    @Resource
    FieldVariableRefDao fieldVariableRefDao;
    @Override
    public FieldVariableRef selectByYear(String year) {
        return fieldVariableRefDao.selectByYear(year);
    }
}
