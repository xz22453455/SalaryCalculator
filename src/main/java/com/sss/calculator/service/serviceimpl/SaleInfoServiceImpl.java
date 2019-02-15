/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: SaleInfoServiceImpl
 * Author:   wangcm
 * Date:     2019/1/15 0015 15:19
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sss.calculator.service.serviceimpl;

import com.sss.calculator.dao.EmployeeDao;
import com.sss.calculator.dao.SaleInfoDao;
import com.sss.calculator.model.*;
import com.sss.calculator.service.PostRankService;
import com.sss.calculator.service.SaleInfoService;
import com.sss.calculator.utils.LoggerUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.*;

/**
 * 〈获取员工信息〉<br>
 *
 * @author wangcm
 * @create 2019/1/16 0016
 * @since 1.0.0
 */
@Service
public class SaleInfoServiceImpl implements SaleInfoService {
    @Resource
    private SaleInfoDao saleInfoDao;
    @Autowired
    PostRankService postRankService;
    @Resource
    EmployeeDao employeeDao;
    @Autowired
    ExecutorService executorService;
    private LoggerUtils logger = LoggerUtils.getLogger(SaleInfoServiceImpl.class);

    @Override
    public ArrayList<SaleInfo> selectSaleInfo(SaleInfoExample example) {
        return saleInfoDao.selectByExample(example);
    }

    @Override
    public List<Employee> getAllEmployee() {
        EmployeeExample example = new EmployeeExample();
        example.createCriteria().andDepartmentLike("%销%").andWorkingStateEqualTo("在职");
        return employeeDao.selectByExample(example);
    }

    List<SaleInfo> saleInfos = new ArrayList<>();
    LocalDate yesterday = LocalDate.now().minusDays(1);
    int year = yesterday.getYear();
    int mathMonth = yesterday.getMonthValue();
    String month;

    String getMonth() {
        int months = 10;
        if (mathMonth < months) {
            month = "0" + mathMonth;
        } else {
            month = String.valueOf(mathMonth);
        }
        return month;
    }

    @Override
    public void findSaleInfo() {
        getMonth();
        List<Employee> employees = getAllEmployee();
        PostRankExample postRankExample = new PostRankExample();
        List<PostRank> postrank = postRankService.selectByPostRankExample(postRankExample);
        ExecutorService service = Executors.newFixedThreadPool(10);
        long startTime = System.currentTimeMillis();
        //等级个数
        int i;
        for (i = 3; i > 0; i--) {
            int count = 0;
            CompletionService<String> completionService = new ExecutorCompletionService(service);
            for (int j = 0; j < employees.size() - 1; j++) {
                Employee employee = employees.get(j);
                if (i == 3) {
                    count++;
                    logger.debug("------------********创建普通员工Task*********--------------");
                    GetContentTask getContentTask = new SaleInfoServiceImpl.GetContentTask(employee, i, year, month);

                    logger.debug("------------********提交Callable类型的普通task任务*********--------------");
                    completionService.submit(getContentTask);
                }
                if (i == 2) {
                    PostRank postRank = postrank.get(i - 1);
                    logger.debug("------------********进行" + postRank.getPost() + "计算*********--------------");
                    if (employee.getPost().equals(postRank.getPost())) {
                        count++;
                        logger.debug("------------********创建中级员工Task*********--------------");
                        GetContentTask getContentTask = new SaleInfoServiceImpl.GetContentTask(employee, i, year, month);
                        logger.debug("------------********提交Callable类型的中级task任务*********--------------");
                        completionService.submit(getContentTask);
                    }
                }
                if (i == 1) {
                    PostRank postRank = postrank.get(i - 1);
                    logger.debug("------------********进行" + postRank.getPost() + "计算*********--------------");
                    if (employee.getPost().equals(postRank.getPost())) {
                        count++;
                        logger.debug("------------********创建高级员工Task*********--------------");
                        GetContentTask getContentTask = new SaleInfoServiceImpl.GetContentTask(employee, i, year, month);
                        logger.debug("------------********提交Callable类型的高级task任务*********--------------");
                        completionService.submit(getContentTask);
                    }
                }
            }
            try {
                for (int k = 0; k < count; k++) {
                    logger.debug("------------********获取并移除已完成状态的task，如果目前不存在这样的task，则等待*********--------------");
                    Future<String> result = completionService.take();
                    logger.debug(result.get());
                }
            } catch (Exception ex) {
                logger.error(ex.getMessage());
            }
            timeUpdateOrInsert(saleInfos);
            saleInfos.clear();
        }
        long endTime = System.currentTimeMillis();
        logger.info("查询耗时 : " + (endTime - startTime));
    }

    @Override
    public List<SaleInfo> selectByExample(SaleInfoExample example) {
        return null;
    }

    @Override
    public void timeUpdateOrInsert(List<SaleInfo> saleInfos) {
        //获取前一天日期
        LocalDate yesterday = LocalDate.now().minusDays(1);
        for (SaleInfo saleInfo : saleInfos) {
            saleInfoDao.timeUpdateOrInsert(saleInfo);
            logger.debug("------------------------工号: " + saleInfo.getEmployeeNo() + "  截止到" + yesterday + " 数据更新成功------------------------");
        }
        logger.debug("------------------------" + yesterday + "全部数据更新完成------------------------");
    }

    //Callable接口代表一段可以调用并返回结果的代码;Future接口表示异步任务，
    // 是还没有完成的任务给出的未来结果。所以说Callable用于产生结果，Future用于获取结果。
    class GetContentTask implements Callable<String> {
        private Employee employee;
        private String month;
        private Integer year;
        private Integer num;

        public GetContentTask(Employee employee, int num, Integer year, String month) {
            this.employee = employee;
            this.num = num;
            this.year = year;
            this.month = month;
        }

        @Override
        public String call() {
            if (num == 3) {
                logger.debug("------------********计算最小职位*********--------------");
                calcuBase(employee);
            } else if (num == 2) {
                ArrayList<HashMap<String, Object>> findall = saleInfoDao.findall(year, month, employee.getEmployeeNo());
                logger.debug("------------********计算中间职位*********--------------");
                calcuMid(employee, findall);
            } else if (num == 1) {
                ArrayList<HashMap<String, Object>> findall = saleInfoDao.findall(year, month, employee.getEmployeeNo());
                logger.debug("------------********计算最大职位*********--------------");
                calcuTop(employee, findall);
            }
            return "当前线程:" + Thread.currentThread().getName() + "this is content : hello " + employee.getName() + "获取完毕";
        }

        public void calcuBase(Employee employee) {
            logger.debug("------------********实际计算" + employee.getPost() + "*********--------------");
            SaleInfo saleInfo = new SaleInfo();
            saleInfo.setEmployeeNo(employee.getEmployeeNo());
            saleInfo.setYear(String.valueOf(year));
            saleInfo.setMonth(month);
            saleInfo.setDepartment(employee.getDepartment());
            saleInfo.setPost(employee.getPost());
            saleInfo.setPostLevel(String.valueOf(employee.getPostLevel()));
            String employeeNo = employee.getEmployeeNo();
            //累计订单量
            String totalOrderSize = saleInfoDao.findTotalOrderSize(year, employeeNo);
            saleInfo.setTotalOrderSize(new BigDecimal(totalOrderSize == null ? "0" : totalOrderSize));
            //累计订单额
            String totalOrderMoney = saleInfoDao.findTotalOrderMoney(year, employeeNo);
            saleInfo.setTotalOrderMoney(new BigDecimal(totalOrderMoney == null ? "0" : totalOrderMoney));
            //当月订单量
            String currentMonthSize = saleInfoDao.findCurrentMonthSize(year, month, employeeNo);
            saleInfo.setCurrentMonthSize(new BigDecimal(currentMonthSize == null ? "0" : currentMonthSize));
            //当月订单额
            String currentMonthMoney = saleInfoDao.findCurrentMonthMoney(year, month, employeeNo);
            saleInfo.setCurrentMonthMoney(new BigDecimal(currentMonthMoney == null ? "0" : currentMonthMoney));
            //累计出库量
            String totalOutputSize = saleInfoDao.findTotalOutputSize(year, employeeNo);
            saleInfo.setTotalOutputSize(new BigDecimal(totalOutputSize == null ? "0" : totalOutputSize));
            //吨钢加价
            String totalPrice = saleInfoDao.findTotalPrice(year, employeeNo);
            saleInfo.setPricePerTon(new BigDecimal(totalPrice == null ? "0" : totalPrice));
            //累计出库额
            String totalOutputMoney = saleInfoDao.findTotalOutputMoney(year, employeeNo);
            saleInfo.setTotalOutputMoney(new BigDecimal(totalOutputMoney == null ? "0" : totalOutputMoney));
            //当月出库量
            String currentMonthOutputSize = saleInfoDao.findCurrentMonthOutputSize(year, month, employeeNo);
            saleInfo.setCurrentMonthOutputSize(new BigDecimal(currentMonthOutputSize == null ? "0" : currentMonthOutputSize));
            //当月出库额
            String currentMonthOutputMoney = saleInfoDao.findCurrentMonthOutputMoney(year, month, employeeNo);
            saleInfo.setCurrentMonthOutputMoney(new BigDecimal(currentMonthOutputMoney == null ? "0" : currentMonthOutputMoney));
            //年度目标量
            String yearTargetSize = saleInfoDao.findYearTargetSize(year, employeeNo);
            saleInfo.setYearTargetSize(new BigDecimal(yearTargetSize == null ? "0" : yearTargetSize));
            //年度目标额
            String yearTargetMoney = saleInfoDao.findYearTargetMoney(year, employeeNo);
            saleInfo.setYearTargetMoney(new BigDecimal(yearTargetMoney == null ? "0" : yearTargetMoney));
            //月度目标量
            String monthTargetSize = saleInfoDao.findMonthTargetSize(year, month, employeeNo);
            saleInfo.setMonthTargetSize(new BigDecimal(monthTargetSize == null ? "0" : monthTargetSize));
            //月度目标额
            String monthTargetMoney = saleInfoDao.findMonthTargetMoney(year, month, employeeNo);
            saleInfo.setMonthTargetMoney(new BigDecimal(monthTargetMoney == null ? "0" : monthTargetMoney));
            //累计回款
            String totalReturnMoney = saleInfoDao.findTotalReturnMoney(year, employeeNo);
            saleInfo.setTotalReturnMoney(new BigDecimal(totalReturnMoney == null ? "0" : totalReturnMoney));
            saleInfos.add(saleInfo);
        }

        public void calcuMid(Employee employee, ArrayList<HashMap<String, Object>> findall) {
            SaleInfo saleInfo = new SaleInfo();
            HashMap<String, Object> hashMap = findall.get(0);
            saleInfo.setEmployeeNo(employee.getEmployeeNo());
            saleInfo.setYear(String.valueOf(year));
            saleInfo.setMonth(month);
            saleInfo.setDepartment(employee.getDepartment());
            saleInfo.setPost(employee.getPost());
            saleInfo.setPostLevel(String.valueOf(employee.getPostLevel()));
            Iterator<Map.Entry<String, Object>> it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, Object> entry = it.next();
                //累计订单量
                if ("TOTAL_ORDER_SIZE".equals(entry.getKey())) {
                    logger.debug(String.valueOf(String.valueOf(entry.getValue())));
                    saleInfo.setTotalOrderSize(new BigDecimal(String.valueOf(String.valueOf(entry.getValue())) == null ? "0" : String.valueOf(String.valueOf(entry.getValue()))));
                }
                //年目标量
                if ("YEAR_TARGET_SIZE".equals(entry.getKey())) {
                    logger.debug(String.valueOf(String.valueOf(entry.getValue())));
                    saleInfo.setYearTargetSize(new BigDecimal(String.valueOf(String.valueOf(entry.getValue())) == null ? "0" : String.valueOf(String.valueOf(entry.getValue()))));
                }
                //年订单额
                if ("TOTAL_ORDER_MONEY".equals(entry.getKey())) {
                    logger.debug(String.valueOf(String.valueOf(entry.getValue())));
                    saleInfo.setTotalOrderMoney(new BigDecimal(String.valueOf(String.valueOf(entry.getValue())) == null ? "0" : String.valueOf(String.valueOf(entry.getValue()))));
                }
                //年目标额
                if ("YEAR_TARGET_MONEY".equals(entry.getKey())) {
                    logger.debug(String.valueOf(String.valueOf(entry.getValue())));
                    saleInfo.setYearTargetMoney(new BigDecimal(String.valueOf(String.valueOf(entry.getValue())) == null ? "0" : String.valueOf(entry.getValue())));
                }
                //当月订单量
                if ("CURRENT_MONTH_SIZE".equals(entry.getKey())) {
                    logger.debug(String.valueOf(entry.getValue()));
                    saleInfo.setCurrentMonthSize(new BigDecimal(String.valueOf(entry.getValue()) == null ? "0" : String.valueOf(entry.getValue())));
                }
                //当月目标量
                if ("MONTH_TARGET_SIZE".equals(entry.getKey())) {
                    logger.debug(String.valueOf(entry.getValue()));
                    saleInfo.setMonthTargetSize(new BigDecimal(String.valueOf(entry.getValue()) == null ? "0" : String.valueOf(entry.getValue())));
                }
                //当月订单额
                if ("CURRENT_MONTH_MONEY".equals(entry.getKey())) {
                    logger.debug(String.valueOf(entry.getValue()));
                    String.valueOf(entry.getValue());
                    String value = String.valueOf(entry.getValue());
                    if (value == null) {
                        value = "0";
                    }
                    BigDecimal bigDecimal = new BigDecimal(value);
                    saleInfo.setCurrentMonthMoney(bigDecimal);
                    logger.debug(String.valueOf(entry.getValue()));
                }
                //月目标额
                if ("MONTH_TARGET_MONEY".equals(entry.getKey())) {
                    logger.debug(String.valueOf(entry.getValue()));
                    saleInfo.setMonthTargetMoney(new BigDecimal(String.valueOf(entry.getValue()) == null ? "0" : String.valueOf(entry.getValue())));
                }
                //累计出库量
                if ("TOTAL_OUTPUT_SIZE".equals(entry.getKey())) {
                    logger.debug(String.valueOf(entry.getValue()));
                    saleInfo.setTotalOutputSize(new BigDecimal(String.valueOf(entry.getValue()) == null ? "0" : String.valueOf(entry.getValue())));
                }
                //吨钢加价
                if ("PRICE_PER_TON".equals(entry.getKey())) {
                    logger.debug(String.valueOf(entry.getValue()));
                    saleInfo.setPricePerTon(new BigDecimal(String.valueOf(entry.getValue()) == null ? "0" : String.valueOf(entry.getValue())));
                }
                //累计出库额
                if ("TOTAL_OUTPUT_MONEY".equals(entry.getKey())) {
                    logger.debug(String.valueOf(entry.getValue()));
                    saleInfo.setTotalOutputMoney(new BigDecimal(String.valueOf(entry.getValue()) == null ? "0" : String.valueOf(entry.getValue())));
                }
                //累计回款额
                if ("TOTAL_RETURN_MONEY".equals(entry.getKey())) {
                    logger.debug(String.valueOf(entry.getValue()));
                    saleInfo.setTotalReturnMoney(new BigDecimal(String.valueOf(entry.getValue()) == null ? "0" : String.valueOf(entry.getValue())));
                }
                //当月出库量
                if ("CURRENT_MONTH_OUTPUT_SIZE".equals(entry.getKey())) {
                    logger.debug(String.valueOf(entry.getValue()));
                    saleInfo.setCurrentMonthOutputSize(new BigDecimal(String.valueOf(entry.getValue()) == null ? "0" : String.valueOf(entry.getValue())));
                }
                //当月出库额
                if ("CURRENT_MONTH_OUTPUT_MONEY".equals(entry.getKey())) {
                    logger.debug(String.valueOf(entry.getValue()));
                    saleInfo.setCurrentMonthOutputMoney(new BigDecimal(String.valueOf(entry.getValue()) == null ? "0" : String.valueOf(entry.getValue())));
                }
            }
            saleInfos.add(saleInfo);
        }

        public void calcuTop(Employee employee, ArrayList<HashMap<String, Object>> findall) {
            SaleInfo saleInfo = new SaleInfo();
            HashMap<String, Object> hashMap = findall.get(0);
            SaleInfoExample saleInfoExample = new SaleInfoExample();
            saleInfoExample.createCriteria().andEmployeeNoEqualTo(employee.getEmployeeNo()).andYearEqualTo(hashMap.get("YEAR").toString()).andMonthEqualTo(hashMap.get("MONTH").toString());
            ArrayList<SaleInfo> saleInfos = saleInfoDao.selectByExample(saleInfoExample);
            SaleInfo saleInfo2 = saleInfos.get(0);
            saleInfo.setEmployeeNo(employee.getEmployeeNo());
            saleInfo.setYear(String.valueOf(year));
            saleInfo.setMonth(month);
            saleInfo.setDepartment(employee.getDepartment());
            saleInfo.setPost(employee.getPost());
            saleInfo.setPostLevel(String.valueOf(employee.getPostLevel()));
            //年目标量
            saleInfo.setYearTargetSize(saleInfo2.getYearTargetSize());
            //年目标额
            saleInfo.setYearTargetMoney(saleInfo2.getYearTargetMoney());
            //月目标额
            saleInfo.setMonthTargetMoney(saleInfo2.getMonthTargetMoney());
            //当月目标量
            saleInfo.setMonthTargetSize(saleInfo2.getMonthTargetSize());
            Iterator<Map.Entry<String, Object>> it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, Object> entry = it.next();

                if ("TOTAL_ORDER_SIZE".equals(entry.getKey())) {
                    logger.debug(String.valueOf(String.valueOf(entry.getValue())));
                    saleInfo.setTotalOrderSize(new BigDecimal(String.valueOf(String.valueOf(entry.getValue())) == null ? "0" : String.valueOf(String.valueOf(entry.getValue()))));
                }
                if ("TOTAL_ORDER_MONEY".equals(entry.getKey())) {
                    logger.debug(String.valueOf(String.valueOf(entry.getValue())));
                    //当月订单量
                    saleInfo.setTotalOrderMoney(new BigDecimal(String.valueOf(String.valueOf(entry.getValue())) == null ? "0" : String.valueOf(String.valueOf(entry.getValue()))));
                }
                if ("CURRENT_MONTH_SIZE".equals(entry.getKey())) {
                    logger.debug(String.valueOf(entry.getValue()));
                    saleInfo.setCurrentMonthSize(new BigDecimal(String.valueOf(entry.getValue()) == null ? "0" : String.valueOf(entry.getValue())));
                }
                if ("CURRENT_MONTH_MONEY".equals(entry.getKey())) {
                    logger.debug(String.valueOf(entry.getValue()));
                    String.valueOf(entry.getValue());
                    String value = String.valueOf(entry.getValue());
                    if (value == null) {
                        value = "0";
                    }
                    BigDecimal bigDecimal = new BigDecimal(value);
                    saleInfo.setCurrentMonthMoney(bigDecimal);
                    logger.debug(String.valueOf(entry.getValue()));
                }
                if ("TOTAL_OUTPUT_SIZE".equals(entry.getKey())) {
                    logger.debug(String.valueOf(entry.getValue()));
                    saleInfo.setTotalOutputSize(new BigDecimal(String.valueOf(entry.getValue()) == null ? "0" : String.valueOf(entry.getValue())));
                }
                if ("PRICE_PER_TON".equals(entry.getKey())) {
                    logger.debug(String.valueOf(entry.getValue()));
                    saleInfo.setPricePerTon(new BigDecimal(String.valueOf(entry.getValue()) == null ? "0" : String.valueOf(entry.getValue())));
                }
                if (("TOTAL_OUTPUT_MONEY").equals(entry.getKey())) {
                    logger.debug(String.valueOf(entry.getValue()));
                    //当月订单量
                    saleInfo.setTotalOutputMoney(new BigDecimal(String.valueOf(entry.getValue()) == null ? "0" : String.valueOf(entry.getValue())));
                }
                if ("TOTAL_RETURN_MONEY".equals(entry.getKey())) {
                    logger.debug(String.valueOf(entry.getValue()));
                    saleInfo.setTotalReturnMoney(new BigDecimal(String.valueOf(entry.getValue()) == null ? "0" : String.valueOf(entry.getValue())));
                }
                if ("CURRENT_MONTH_OUTPUT_SIZE".equals(entry.getKey())) {
                    logger.debug(String.valueOf(entry.getValue()));
                    saleInfo.setCurrentMonthOutputSize(new BigDecimal(String.valueOf(entry.getValue()) == null ? "0" : String.valueOf(entry.getValue())));
                }
                if ("CURRENT_MONTH_OUTPUT_MONEY".equals(entry.getKey())) {
                    logger.debug(String.valueOf(entry.getValue()));
                    saleInfo.setCurrentMonthOutputMoney(new BigDecimal(String.valueOf(entry.getValue()) == null ? "0" : String.valueOf(entry.getValue())));
                }
            }
            SaleInfoServiceImpl.this.saleInfos.add(saleInfo);
        }
    }
}


