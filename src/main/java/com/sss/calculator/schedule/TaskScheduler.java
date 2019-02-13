package com.sss.calculator.schedule;

import com.sss.calculator.model.*;
import com.sss.calculator.service.*;
import com.sss.calculator.utils.CalculationEngine;
import com.sss.calculator.utils.LoggerUtils;
import org.hibernate.validator.internal.util.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

/**
 * 〈quartz定时任务执行类〉<br>
 *
 * @author
 * @since 1.0.0
 */
@Component
public class TaskScheduler {
    @Autowired
    AssessSalaryService assessSalaryService;
    @Autowired
    SaleInfoService saleInfoService;
    @Autowired
    MeritSalaryService meritSalaryService;
    @Autowired
    FieldVariableRefService fieldVariableRefService;

    public Logger logger = LoggerFactory.getLogger(TaskScheduler.class);

    //@Scheduled(cron = "0 0 1 * * ?")   //每天凌晨1点执行一次
    @Scheduled(cron = "*/5 * * * * ?")   //每隔5秒执行一次
    //@Scheduled(cron = "0 */1 * * * ?")   //每隔1分钟执行一次
    //@Scheduled(cron="0 0 0 * * ?")     //每天凌晨0点执行一次
    public void tableScheduled() {
        LocalDate yesterday = LocalDate.now().minusDays(1);
        //获取员工信息集合
        saleInfoService.findSaleInfo();
        final ArrayList<SaleInfo> saleInfos = saleInfoService.selectSaleInfo(new SaleInfoExample());
        //遍历员工对象
        long startTime = System.currentTimeMillis();
        Map<String, String> hashMap = new HashMap<>(30);
        MeritSalary meritSalary = new MeritSalary();
        for (SaleInfo saleInfo : saleInfos) {
            //封装计算所需参数
            FieldVariableRef fieldVariableRef = fieldVariableRefService.selectByYear(saleInfo.getYear());
            hashMap.put(fieldVariableRef.getTotalOrderSize(), saleInfo.getTotalOrderSize().toString());
            hashMap.put(fieldVariableRef.getYearTargetSize(), saleInfo.getYearTargetSize().toString());
            hashMap.put(fieldVariableRef.getTotalOrderMoney(), saleInfo.getTotalOrderMoney().toString());
            hashMap.put(fieldVariableRef.getYearTargetMoney(), saleInfo.getYearTargetMoney().toString());
            hashMap.put(fieldVariableRef.getCurrentMonthMoney(), saleInfo.getCurrentMonthSize().toString());
            hashMap.put(fieldVariableRef.getMonthTargetSize(), saleInfo.getMonthTargetSize().toString());
            hashMap.put(fieldVariableRef.getCurrentMonthMoney(), saleInfo.getCurrentMonthMoney().toString());
            hashMap.put(fieldVariableRef.getMonthTargetMoney(), saleInfo.getMonthTargetMoney().toString());
            hashMap.put(fieldVariableRef.getTotalOutputSize(), saleInfo.getTotalOutputSize().toString());
            hashMap.put(fieldVariableRef.getPricePerTon(), saleInfo.getPricePerTon().toString());
            hashMap.put(fieldVariableRef.getTotalOutputMoney(), saleInfo.getTotalOutputMoney().toString());
            hashMap.put(fieldVariableRef.getTotalReturnMoney(), saleInfo.getTotalReturnMoney().toString());
            hashMap.put(fieldVariableRef.getCurrentMonthOutputSize(), saleInfo.getCurrentMonthOutputSize().toString());
            hashMap.put(fieldVariableRef.getCurrentMonthOutputMoney(), saleInfo.getCurrentMonthOutputMoney().toString());
            hashMap.put(fieldVariableRef.getCurrentMonthSize(), saleInfo.getCurrentMonthSize().toString());
            //当月累计绩效
            int sala = 0;
            //获取对应员工信息
            final ArrayList<AssessSalary> assessSalary = assessSalaryService.selectByJobStar(saleInfo.getPost(), saleInfo.getPostLevel(), saleInfo.getYear());
            for (AssessSalary salary : assessSalary) {
                String s = "";
                hashMap.put(fieldVariableRef.getOrderAppraisalSalary(), salary.getAssessmentSalary());
                hashMap.put(fieldVariableRef.getReturnPay(), salary.getAssessmentSalary());
                hashMap.put(fieldVariableRef.getProfitAppraisalSalary(), salary.getAssessmentSalary());
                hashMap.put(fieldVariableRef.getDeliveryPay(), salary.getAssessmentSalary());
                try {
                    s = CalculationEngine.getInstance().callPythonScript(salary.getAlgorithm(), hashMap);
                } catch (Exception e) {
                    logger.error("调用python脚本异常：{}", e.getMessage(), e);
                }
                BigDecimal b = new BigDecimal("".equals(s) ? "0" : s);
                sala += b.intValue();
            }
            hashMap.clear();
            BigDecimal bigDecimal = new BigDecimal(String.valueOf(sala));
            meritSalary.setYear(saleInfo.getYear());
            meritSalary.setMonth(saleInfo.getMonth());
            meritSalary.setJobNumber(saleInfo.getEmployeeNo());
            meritSalary.setPerformanceSalary(bigDecimal);
            int insert = meritSalaryService.insert(meritSalary);
            if (insert == 1) {
                logger.debug("工号:{}——级别{}——星级{}级——{}年{}月累计薪资截止到{}计算完毕。", saleInfo.getEmployeeNo(), saleInfo.getPost(), saleInfo.getPostLevel(), saleInfo.getYear(), saleInfo.getMonth(), yesterday);
            } else {
                logger.info("插入薪资失败,异常信息为：{}", insert);
            }
        }
        saleInfos.clear();
        long endTime = System.currentTimeMillis();
        logger.info("封装计算插入耗时 : {}", (endTime - startTime));
        logger.info("本月截止到:{},全部数据计算更新完成，薪资计算时间为:{}", yesterday, LocalDateTime.now());
    }
}