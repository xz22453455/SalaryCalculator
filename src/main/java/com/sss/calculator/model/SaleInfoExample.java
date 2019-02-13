package com.sss.calculator.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SaleInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("YEAR is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("YEAR =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("YEAR <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("YEAR >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("YEAR >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("YEAR <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("YEAR <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("YEAR like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("YEAR not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("YEAR in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("YEAR not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("YEAR between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("YEAR not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("MONTH is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(String value) {
            addCriterion("MONTH =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(String value) {
            addCriterion("MONTH <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(String value) {
            addCriterion("MONTH >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(String value) {
            addCriterion("MONTH >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(String value) {
            addCriterion("MONTH <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(String value) {
            addCriterion("MONTH <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLike(String value) {
            addCriterion("MONTH like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotLike(String value) {
            addCriterion("MONTH not like", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<String> values) {
            addCriterion("MONTH in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<String> values) {
            addCriterion("MONTH not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(String value1, String value2) {
            addCriterion("MONTH between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(String value1, String value2) {
            addCriterion("MONTH not between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoIsNull() {
            addCriterion("EMPLOYEE_NO is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoIsNotNull() {
            addCriterion("EMPLOYEE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoEqualTo(String value) {
            addCriterion("EMPLOYEE_NO =", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoNotEqualTo(String value) {
            addCriterion("EMPLOYEE_NO <>", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoGreaterThan(String value) {
            addCriterion("EMPLOYEE_NO >", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_NO >=", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoLessThan(String value) {
            addCriterion("EMPLOYEE_NO <", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_NO <=", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoLike(String value) {
            addCriterion("EMPLOYEE_NO like", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoNotLike(String value) {
            addCriterion("EMPLOYEE_NO not like", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoIn(List<String> values) {
            addCriterion("EMPLOYEE_NO in", values, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoNotIn(List<String> values) {
            addCriterion("EMPLOYEE_NO not in", values, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_NO between", value1, value2, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_NO not between", value1, value2, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("DEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("DEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("DEPARTMENT =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("DEPARTMENT <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("DEPARTMENT >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("DEPARTMENT <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("DEPARTMENT like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("DEPARTMENT not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("DEPARTMENT in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("DEPARTMENT not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("DEPARTMENT between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andPostIsNull() {
            addCriterion("POST is null");
            return (Criteria) this;
        }

        public Criteria andPostIsNotNull() {
            addCriterion("POST is not null");
            return (Criteria) this;
        }

        public Criteria andPostEqualTo(String value) {
            addCriterion("POST =", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotEqualTo(String value) {
            addCriterion("POST <>", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThan(String value) {
            addCriterion("POST >", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThanOrEqualTo(String value) {
            addCriterion("POST >=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThan(String value) {
            addCriterion("POST <", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThanOrEqualTo(String value) {
            addCriterion("POST <=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLike(String value) {
            addCriterion("POST like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotLike(String value) {
            addCriterion("POST not like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostIn(List<String> values) {
            addCriterion("POST in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotIn(List<String> values) {
            addCriterion("POST not in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostBetween(String value1, String value2) {
            addCriterion("POST between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotBetween(String value1, String value2) {
            addCriterion("POST not between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andPostLevelIsNull() {
            addCriterion("POST_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andPostLevelIsNotNull() {
            addCriterion("POST_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andPostLevelEqualTo(String value) {
            addCriterion("POST_LEVEL =", value, "postLevel");
            return (Criteria) this;
        }

        public Criteria andPostLevelNotEqualTo(String value) {
            addCriterion("POST_LEVEL <>", value, "postLevel");
            return (Criteria) this;
        }

        public Criteria andPostLevelGreaterThan(String value) {
            addCriterion("POST_LEVEL >", value, "postLevel");
            return (Criteria) this;
        }

        public Criteria andPostLevelGreaterThanOrEqualTo(String value) {
            addCriterion("POST_LEVEL >=", value, "postLevel");
            return (Criteria) this;
        }

        public Criteria andPostLevelLessThan(String value) {
            addCriterion("POST_LEVEL <", value, "postLevel");
            return (Criteria) this;
        }

        public Criteria andPostLevelLessThanOrEqualTo(String value) {
            addCriterion("POST_LEVEL <=", value, "postLevel");
            return (Criteria) this;
        }

        public Criteria andPostLevelLike(String value) {
            addCriterion("POST_LEVEL like", value, "postLevel");
            return (Criteria) this;
        }

        public Criteria andPostLevelNotLike(String value) {
            addCriterion("POST_LEVEL not like", value, "postLevel");
            return (Criteria) this;
        }

        public Criteria andPostLevelIn(List<String> values) {
            addCriterion("POST_LEVEL in", values, "postLevel");
            return (Criteria) this;
        }

        public Criteria andPostLevelNotIn(List<String> values) {
            addCriterion("POST_LEVEL not in", values, "postLevel");
            return (Criteria) this;
        }

        public Criteria andPostLevelBetween(String value1, String value2) {
            addCriterion("POST_LEVEL between", value1, value2, "postLevel");
            return (Criteria) this;
        }

        public Criteria andPostLevelNotBetween(String value1, String value2) {
            addCriterion("POST_LEVEL not between", value1, value2, "postLevel");
            return (Criteria) this;
        }

        public Criteria andTotalOrderSizeIsNull() {
            addCriterion("TOTAL_ORDER_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andTotalOrderSizeIsNotNull() {
            addCriterion("TOTAL_ORDER_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andTotalOrderSizeEqualTo(BigDecimal value) {
            addCriterion("TOTAL_ORDER_SIZE =", value, "totalOrderSize");
            return (Criteria) this;
        }

        public Criteria andTotalOrderSizeNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_ORDER_SIZE <>", value, "totalOrderSize");
            return (Criteria) this;
        }

        public Criteria andTotalOrderSizeGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_ORDER_SIZE >", value, "totalOrderSize");
            return (Criteria) this;
        }

        public Criteria andTotalOrderSizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_ORDER_SIZE >=", value, "totalOrderSize");
            return (Criteria) this;
        }

        public Criteria andTotalOrderSizeLessThan(BigDecimal value) {
            addCriterion("TOTAL_ORDER_SIZE <", value, "totalOrderSize");
            return (Criteria) this;
        }

        public Criteria andTotalOrderSizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_ORDER_SIZE <=", value, "totalOrderSize");
            return (Criteria) this;
        }

        public Criteria andTotalOrderSizeIn(List<BigDecimal> values) {
            addCriterion("TOTAL_ORDER_SIZE in", values, "totalOrderSize");
            return (Criteria) this;
        }

        public Criteria andTotalOrderSizeNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_ORDER_SIZE not in", values, "totalOrderSize");
            return (Criteria) this;
        }

        public Criteria andTotalOrderSizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_ORDER_SIZE between", value1, value2, "totalOrderSize");
            return (Criteria) this;
        }

        public Criteria andTotalOrderSizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_ORDER_SIZE not between", value1, value2, "totalOrderSize");
            return (Criteria) this;
        }

        public Criteria andYearTargetSizeIsNull() {
            addCriterion("YEAR_TARGET_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andYearTargetSizeIsNotNull() {
            addCriterion("YEAR_TARGET_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andYearTargetSizeEqualTo(BigDecimal value) {
            addCriterion("YEAR_TARGET_SIZE =", value, "yearTargetSize");
            return (Criteria) this;
        }

        public Criteria andYearTargetSizeNotEqualTo(BigDecimal value) {
            addCriterion("YEAR_TARGET_SIZE <>", value, "yearTargetSize");
            return (Criteria) this;
        }

        public Criteria andYearTargetSizeGreaterThan(BigDecimal value) {
            addCriterion("YEAR_TARGET_SIZE >", value, "yearTargetSize");
            return (Criteria) this;
        }

        public Criteria andYearTargetSizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YEAR_TARGET_SIZE >=", value, "yearTargetSize");
            return (Criteria) this;
        }

        public Criteria andYearTargetSizeLessThan(BigDecimal value) {
            addCriterion("YEAR_TARGET_SIZE <", value, "yearTargetSize");
            return (Criteria) this;
        }

        public Criteria andYearTargetSizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YEAR_TARGET_SIZE <=", value, "yearTargetSize");
            return (Criteria) this;
        }

        public Criteria andYearTargetSizeIn(List<BigDecimal> values) {
            addCriterion("YEAR_TARGET_SIZE in", values, "yearTargetSize");
            return (Criteria) this;
        }

        public Criteria andYearTargetSizeNotIn(List<BigDecimal> values) {
            addCriterion("YEAR_TARGET_SIZE not in", values, "yearTargetSize");
            return (Criteria) this;
        }

        public Criteria andYearTargetSizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YEAR_TARGET_SIZE between", value1, value2, "yearTargetSize");
            return (Criteria) this;
        }

        public Criteria andYearTargetSizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YEAR_TARGET_SIZE not between", value1, value2, "yearTargetSize");
            return (Criteria) this;
        }

        public Criteria andTotalOrderMoneyIsNull() {
            addCriterion("TOTAL_ORDER_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andTotalOrderMoneyIsNotNull() {
            addCriterion("TOTAL_ORDER_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andTotalOrderMoneyEqualTo(BigDecimal value) {
            addCriterion("TOTAL_ORDER_MONEY =", value, "totalOrderMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOrderMoneyNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_ORDER_MONEY <>", value, "totalOrderMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOrderMoneyGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_ORDER_MONEY >", value, "totalOrderMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOrderMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_ORDER_MONEY >=", value, "totalOrderMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOrderMoneyLessThan(BigDecimal value) {
            addCriterion("TOTAL_ORDER_MONEY <", value, "totalOrderMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOrderMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_ORDER_MONEY <=", value, "totalOrderMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOrderMoneyIn(List<BigDecimal> values) {
            addCriterion("TOTAL_ORDER_MONEY in", values, "totalOrderMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOrderMoneyNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_ORDER_MONEY not in", values, "totalOrderMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOrderMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_ORDER_MONEY between", value1, value2, "totalOrderMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOrderMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_ORDER_MONEY not between", value1, value2, "totalOrderMoney");
            return (Criteria) this;
        }

        public Criteria andYearTargetMoneyIsNull() {
            addCriterion("YEAR_TARGET_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andYearTargetMoneyIsNotNull() {
            addCriterion("YEAR_TARGET_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andYearTargetMoneyEqualTo(BigDecimal value) {
            addCriterion("YEAR_TARGET_MONEY =", value, "yearTargetMoney");
            return (Criteria) this;
        }

        public Criteria andYearTargetMoneyNotEqualTo(BigDecimal value) {
            addCriterion("YEAR_TARGET_MONEY <>", value, "yearTargetMoney");
            return (Criteria) this;
        }

        public Criteria andYearTargetMoneyGreaterThan(BigDecimal value) {
            addCriterion("YEAR_TARGET_MONEY >", value, "yearTargetMoney");
            return (Criteria) this;
        }

        public Criteria andYearTargetMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YEAR_TARGET_MONEY >=", value, "yearTargetMoney");
            return (Criteria) this;
        }

        public Criteria andYearTargetMoneyLessThan(BigDecimal value) {
            addCriterion("YEAR_TARGET_MONEY <", value, "yearTargetMoney");
            return (Criteria) this;
        }

        public Criteria andYearTargetMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YEAR_TARGET_MONEY <=", value, "yearTargetMoney");
            return (Criteria) this;
        }

        public Criteria andYearTargetMoneyIn(List<BigDecimal> values) {
            addCriterion("YEAR_TARGET_MONEY in", values, "yearTargetMoney");
            return (Criteria) this;
        }

        public Criteria andYearTargetMoneyNotIn(List<BigDecimal> values) {
            addCriterion("YEAR_TARGET_MONEY not in", values, "yearTargetMoney");
            return (Criteria) this;
        }

        public Criteria andYearTargetMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YEAR_TARGET_MONEY between", value1, value2, "yearTargetMoney");
            return (Criteria) this;
        }

        public Criteria andYearTargetMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YEAR_TARGET_MONEY not between", value1, value2, "yearTargetMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthSizeIsNull() {
            addCriterion("CURRENT_MONTH_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthSizeIsNotNull() {
            addCriterion("CURRENT_MONTH_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthSizeEqualTo(BigDecimal value) {
            addCriterion("CURRENT_MONTH_SIZE =", value, "currentMonthSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthSizeNotEqualTo(BigDecimal value) {
            addCriterion("CURRENT_MONTH_SIZE <>", value, "currentMonthSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthSizeGreaterThan(BigDecimal value) {
            addCriterion("CURRENT_MONTH_SIZE >", value, "currentMonthSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthSizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CURRENT_MONTH_SIZE >=", value, "currentMonthSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthSizeLessThan(BigDecimal value) {
            addCriterion("CURRENT_MONTH_SIZE <", value, "currentMonthSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthSizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CURRENT_MONTH_SIZE <=", value, "currentMonthSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthSizeIn(List<BigDecimal> values) {
            addCriterion("CURRENT_MONTH_SIZE in", values, "currentMonthSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthSizeNotIn(List<BigDecimal> values) {
            addCriterion("CURRENT_MONTH_SIZE not in", values, "currentMonthSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthSizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CURRENT_MONTH_SIZE between", value1, value2, "currentMonthSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthSizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CURRENT_MONTH_SIZE not between", value1, value2, "currentMonthSize");
            return (Criteria) this;
        }

        public Criteria andMonthTargetSizeIsNull() {
            addCriterion("MONTH_TARGET_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andMonthTargetSizeIsNotNull() {
            addCriterion("MONTH_TARGET_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andMonthTargetSizeEqualTo(BigDecimal value) {
            addCriterion("MONTH_TARGET_SIZE =", value, "monthTargetSize");
            return (Criteria) this;
        }

        public Criteria andMonthTargetSizeNotEqualTo(BigDecimal value) {
            addCriterion("MONTH_TARGET_SIZE <>", value, "monthTargetSize");
            return (Criteria) this;
        }

        public Criteria andMonthTargetSizeGreaterThan(BigDecimal value) {
            addCriterion("MONTH_TARGET_SIZE >", value, "monthTargetSize");
            return (Criteria) this;
        }

        public Criteria andMonthTargetSizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTH_TARGET_SIZE >=", value, "monthTargetSize");
            return (Criteria) this;
        }

        public Criteria andMonthTargetSizeLessThan(BigDecimal value) {
            addCriterion("MONTH_TARGET_SIZE <", value, "monthTargetSize");
            return (Criteria) this;
        }

        public Criteria andMonthTargetSizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTH_TARGET_SIZE <=", value, "monthTargetSize");
            return (Criteria) this;
        }

        public Criteria andMonthTargetSizeIn(List<BigDecimal> values) {
            addCriterion("MONTH_TARGET_SIZE in", values, "monthTargetSize");
            return (Criteria) this;
        }

        public Criteria andMonthTargetSizeNotIn(List<BigDecimal> values) {
            addCriterion("MONTH_TARGET_SIZE not in", values, "monthTargetSize");
            return (Criteria) this;
        }

        public Criteria andMonthTargetSizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTH_TARGET_SIZE between", value1, value2, "monthTargetSize");
            return (Criteria) this;
        }

        public Criteria andMonthTargetSizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTH_TARGET_SIZE not between", value1, value2, "monthTargetSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthMoneyIsNull() {
            addCriterion("CURRENT_MONTH_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthMoneyIsNotNull() {
            addCriterion("CURRENT_MONTH_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthMoneyEqualTo(BigDecimal value) {
            addCriterion("CURRENT_MONTH_MONEY =", value, "currentMonthMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthMoneyNotEqualTo(BigDecimal value) {
            addCriterion("CURRENT_MONTH_MONEY <>", value, "currentMonthMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthMoneyGreaterThan(BigDecimal value) {
            addCriterion("CURRENT_MONTH_MONEY >", value, "currentMonthMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CURRENT_MONTH_MONEY >=", value, "currentMonthMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthMoneyLessThan(BigDecimal value) {
            addCriterion("CURRENT_MONTH_MONEY <", value, "currentMonthMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CURRENT_MONTH_MONEY <=", value, "currentMonthMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthMoneyIn(List<BigDecimal> values) {
            addCriterion("CURRENT_MONTH_MONEY in", values, "currentMonthMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthMoneyNotIn(List<BigDecimal> values) {
            addCriterion("CURRENT_MONTH_MONEY not in", values, "currentMonthMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CURRENT_MONTH_MONEY between", value1, value2, "currentMonthMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CURRENT_MONTH_MONEY not between", value1, value2, "currentMonthMoney");
            return (Criteria) this;
        }

        public Criteria andMonthTargetMoneyIsNull() {
            addCriterion("MONTH_TARGET_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andMonthTargetMoneyIsNotNull() {
            addCriterion("MONTH_TARGET_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andMonthTargetMoneyEqualTo(BigDecimal value) {
            addCriterion("MONTH_TARGET_MONEY =", value, "monthTargetMoney");
            return (Criteria) this;
        }

        public Criteria andMonthTargetMoneyNotEqualTo(BigDecimal value) {
            addCriterion("MONTH_TARGET_MONEY <>", value, "monthTargetMoney");
            return (Criteria) this;
        }

        public Criteria andMonthTargetMoneyGreaterThan(BigDecimal value) {
            addCriterion("MONTH_TARGET_MONEY >", value, "monthTargetMoney");
            return (Criteria) this;
        }

        public Criteria andMonthTargetMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTH_TARGET_MONEY >=", value, "monthTargetMoney");
            return (Criteria) this;
        }

        public Criteria andMonthTargetMoneyLessThan(BigDecimal value) {
            addCriterion("MONTH_TARGET_MONEY <", value, "monthTargetMoney");
            return (Criteria) this;
        }

        public Criteria andMonthTargetMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTH_TARGET_MONEY <=", value, "monthTargetMoney");
            return (Criteria) this;
        }

        public Criteria andMonthTargetMoneyIn(List<BigDecimal> values) {
            addCriterion("MONTH_TARGET_MONEY in", values, "monthTargetMoney");
            return (Criteria) this;
        }

        public Criteria andMonthTargetMoneyNotIn(List<BigDecimal> values) {
            addCriterion("MONTH_TARGET_MONEY not in", values, "monthTargetMoney");
            return (Criteria) this;
        }

        public Criteria andMonthTargetMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTH_TARGET_MONEY between", value1, value2, "monthTargetMoney");
            return (Criteria) this;
        }

        public Criteria andMonthTargetMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTH_TARGET_MONEY not between", value1, value2, "monthTargetMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOutputSizeIsNull() {
            addCriterion("TOTAL_OUTPUT_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andTotalOutputSizeIsNotNull() {
            addCriterion("TOTAL_OUTPUT_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andTotalOutputSizeEqualTo(BigDecimal value) {
            addCriterion("TOTAL_OUTPUT_SIZE =", value, "totalOutputSize");
            return (Criteria) this;
        }

        public Criteria andTotalOutputSizeNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_OUTPUT_SIZE <>", value, "totalOutputSize");
            return (Criteria) this;
        }

        public Criteria andTotalOutputSizeGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_OUTPUT_SIZE >", value, "totalOutputSize");
            return (Criteria) this;
        }

        public Criteria andTotalOutputSizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_OUTPUT_SIZE >=", value, "totalOutputSize");
            return (Criteria) this;
        }

        public Criteria andTotalOutputSizeLessThan(BigDecimal value) {
            addCriterion("TOTAL_OUTPUT_SIZE <", value, "totalOutputSize");
            return (Criteria) this;
        }

        public Criteria andTotalOutputSizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_OUTPUT_SIZE <=", value, "totalOutputSize");
            return (Criteria) this;
        }

        public Criteria andTotalOutputSizeIn(List<BigDecimal> values) {
            addCriterion("TOTAL_OUTPUT_SIZE in", values, "totalOutputSize");
            return (Criteria) this;
        }

        public Criteria andTotalOutputSizeNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_OUTPUT_SIZE not in", values, "totalOutputSize");
            return (Criteria) this;
        }

        public Criteria andTotalOutputSizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_OUTPUT_SIZE between", value1, value2, "totalOutputSize");
            return (Criteria) this;
        }

        public Criteria andTotalOutputSizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_OUTPUT_SIZE not between", value1, value2, "totalOutputSize");
            return (Criteria) this;
        }

        public Criteria andPricePerTonIsNull() {
            addCriterion("PRICE_PER_TON is null");
            return (Criteria) this;
        }

        public Criteria andPricePerTonIsNotNull() {
            addCriterion("PRICE_PER_TON is not null");
            return (Criteria) this;
        }

        public Criteria andPricePerTonEqualTo(BigDecimal value) {
            addCriterion("PRICE_PER_TON =", value, "pricePerTon");
            return (Criteria) this;
        }

        public Criteria andPricePerTonNotEqualTo(BigDecimal value) {
            addCriterion("PRICE_PER_TON <>", value, "pricePerTon");
            return (Criteria) this;
        }

        public Criteria andPricePerTonGreaterThan(BigDecimal value) {
            addCriterion("PRICE_PER_TON >", value, "pricePerTon");
            return (Criteria) this;
        }

        public Criteria andPricePerTonGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE_PER_TON >=", value, "pricePerTon");
            return (Criteria) this;
        }

        public Criteria andPricePerTonLessThan(BigDecimal value) {
            addCriterion("PRICE_PER_TON <", value, "pricePerTon");
            return (Criteria) this;
        }

        public Criteria andPricePerTonLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE_PER_TON <=", value, "pricePerTon");
            return (Criteria) this;
        }

        public Criteria andPricePerTonIn(List<BigDecimal> values) {
            addCriterion("PRICE_PER_TON in", values, "pricePerTon");
            return (Criteria) this;
        }

        public Criteria andPricePerTonNotIn(List<BigDecimal> values) {
            addCriterion("PRICE_PER_TON not in", values, "pricePerTon");
            return (Criteria) this;
        }

        public Criteria andPricePerTonBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE_PER_TON between", value1, value2, "pricePerTon");
            return (Criteria) this;
        }

        public Criteria andPricePerTonNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE_PER_TON not between", value1, value2, "pricePerTon");
            return (Criteria) this;
        }

        public Criteria andTotalOutputMoneyIsNull() {
            addCriterion("TOTAL_OUTPUT_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andTotalOutputMoneyIsNotNull() {
            addCriterion("TOTAL_OUTPUT_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andTotalOutputMoneyEqualTo(BigDecimal value) {
            addCriterion("TOTAL_OUTPUT_MONEY =", value, "totalOutputMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOutputMoneyNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_OUTPUT_MONEY <>", value, "totalOutputMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOutputMoneyGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_OUTPUT_MONEY >", value, "totalOutputMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOutputMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_OUTPUT_MONEY >=", value, "totalOutputMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOutputMoneyLessThan(BigDecimal value) {
            addCriterion("TOTAL_OUTPUT_MONEY <", value, "totalOutputMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOutputMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_OUTPUT_MONEY <=", value, "totalOutputMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOutputMoneyIn(List<BigDecimal> values) {
            addCriterion("TOTAL_OUTPUT_MONEY in", values, "totalOutputMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOutputMoneyNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_OUTPUT_MONEY not in", values, "totalOutputMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOutputMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_OUTPUT_MONEY between", value1, value2, "totalOutputMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOutputMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_OUTPUT_MONEY not between", value1, value2, "totalOutputMoney");
            return (Criteria) this;
        }

        public Criteria andTotalReturnMoneyIsNull() {
            addCriterion("TOTAL_RETURN_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andTotalReturnMoneyIsNotNull() {
            addCriterion("TOTAL_RETURN_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andTotalReturnMoneyEqualTo(BigDecimal value) {
            addCriterion("TOTAL_RETURN_MONEY =", value, "totalReturnMoney");
            return (Criteria) this;
        }

        public Criteria andTotalReturnMoneyNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_RETURN_MONEY <>", value, "totalReturnMoney");
            return (Criteria) this;
        }

        public Criteria andTotalReturnMoneyGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_RETURN_MONEY >", value, "totalReturnMoney");
            return (Criteria) this;
        }

        public Criteria andTotalReturnMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_RETURN_MONEY >=", value, "totalReturnMoney");
            return (Criteria) this;
        }

        public Criteria andTotalReturnMoneyLessThan(BigDecimal value) {
            addCriterion("TOTAL_RETURN_MONEY <", value, "totalReturnMoney");
            return (Criteria) this;
        }

        public Criteria andTotalReturnMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_RETURN_MONEY <=", value, "totalReturnMoney");
            return (Criteria) this;
        }

        public Criteria andTotalReturnMoneyIn(List<BigDecimal> values) {
            addCriterion("TOTAL_RETURN_MONEY in", values, "totalReturnMoney");
            return (Criteria) this;
        }

        public Criteria andTotalReturnMoneyNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_RETURN_MONEY not in", values, "totalReturnMoney");
            return (Criteria) this;
        }

        public Criteria andTotalReturnMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_RETURN_MONEY between", value1, value2, "totalReturnMoney");
            return (Criteria) this;
        }

        public Criteria andTotalReturnMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_RETURN_MONEY not between", value1, value2, "totalReturnMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputSizeIsNull() {
            addCriterion("CURRENT_MONTH_OUTPUT_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputSizeIsNotNull() {
            addCriterion("CURRENT_MONTH_OUTPUT_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputSizeEqualTo(BigDecimal value) {
            addCriterion("CURRENT_MONTH_OUTPUT_SIZE =", value, "currentMonthOutputSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputSizeNotEqualTo(BigDecimal value) {
            addCriterion("CURRENT_MONTH_OUTPUT_SIZE <>", value, "currentMonthOutputSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputSizeGreaterThan(BigDecimal value) {
            addCriterion("CURRENT_MONTH_OUTPUT_SIZE >", value, "currentMonthOutputSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputSizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CURRENT_MONTH_OUTPUT_SIZE >=", value, "currentMonthOutputSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputSizeLessThan(BigDecimal value) {
            addCriterion("CURRENT_MONTH_OUTPUT_SIZE <", value, "currentMonthOutputSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputSizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CURRENT_MONTH_OUTPUT_SIZE <=", value, "currentMonthOutputSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputSizeIn(List<BigDecimal> values) {
            addCriterion("CURRENT_MONTH_OUTPUT_SIZE in", values, "currentMonthOutputSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputSizeNotIn(List<BigDecimal> values) {
            addCriterion("CURRENT_MONTH_OUTPUT_SIZE not in", values, "currentMonthOutputSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputSizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CURRENT_MONTH_OUTPUT_SIZE between", value1, value2, "currentMonthOutputSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputSizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CURRENT_MONTH_OUTPUT_SIZE not between", value1, value2, "currentMonthOutputSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputMoneyIsNull() {
            addCriterion("CURRENT_MONTH_OUTPUT_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputMoneyIsNotNull() {
            addCriterion("CURRENT_MONTH_OUTPUT_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputMoneyEqualTo(BigDecimal value) {
            addCriterion("CURRENT_MONTH_OUTPUT_MONEY =", value, "currentMonthOutputMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputMoneyNotEqualTo(BigDecimal value) {
            addCriterion("CURRENT_MONTH_OUTPUT_MONEY <>", value, "currentMonthOutputMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputMoneyGreaterThan(BigDecimal value) {
            addCriterion("CURRENT_MONTH_OUTPUT_MONEY >", value, "currentMonthOutputMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CURRENT_MONTH_OUTPUT_MONEY >=", value, "currentMonthOutputMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputMoneyLessThan(BigDecimal value) {
            addCriterion("CURRENT_MONTH_OUTPUT_MONEY <", value, "currentMonthOutputMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CURRENT_MONTH_OUTPUT_MONEY <=", value, "currentMonthOutputMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputMoneyIn(List<BigDecimal> values) {
            addCriterion("CURRENT_MONTH_OUTPUT_MONEY in", values, "currentMonthOutputMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputMoneyNotIn(List<BigDecimal> values) {
            addCriterion("CURRENT_MONTH_OUTPUT_MONEY not in", values, "currentMonthOutputMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CURRENT_MONTH_OUTPUT_MONEY between", value1, value2, "currentMonthOutputMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CURRENT_MONTH_OUTPUT_MONEY not between", value1, value2, "currentMonthOutputMoney");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}