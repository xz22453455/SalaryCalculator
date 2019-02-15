/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: MeritSalaryServiceImpl
 * Author:   wangcm
 * Date:     2019/1/16 0016 9:32
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sss.calculator.service.serviceimpl;

import com.sss.calculator.dao.MeritSalaryDao;
import com.sss.calculator.model.MeritSalary;
import com.sss.calculator.service.MeritSalaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 〈插入计算结果〉<br>
 * 〈〉
 *
 * @author wangcm
 * @create 2019/1/16 0016
 * @since 1.0.0
 */
@Service
public class MeritSalaryServiceImpl implements MeritSalaryService {
    @Resource
    private MeritSalaryDao meritSalaryMapper;
    @Override
    public int insert(MeritSalary meritSalary) {
        return meritSalaryMapper.insert(meritSalary);
    }
}
