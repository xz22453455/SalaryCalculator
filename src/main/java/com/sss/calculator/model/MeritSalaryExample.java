package com.sss.calculator.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MeritSalaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MeritSalaryExample() {
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

        public Criteria andJobNumberIsNull() {
            addCriterion("JOB_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andJobNumberIsNotNull() {
            addCriterion("JOB_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andJobNumberEqualTo(BigDecimal value) {
            addCriterion("JOB_NUMBER =", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberNotEqualTo(BigDecimal value) {
            addCriterion("JOB_NUMBER <>", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberGreaterThan(BigDecimal value) {
            addCriterion("JOB_NUMBER >", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JOB_NUMBER >=", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberLessThan(BigDecimal value) {
            addCriterion("JOB_NUMBER <", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JOB_NUMBER <=", value, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberIn(List<BigDecimal> values) {
            addCriterion("JOB_NUMBER in", values, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberNotIn(List<BigDecimal> values) {
            addCriterion("JOB_NUMBER not in", values, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JOB_NUMBER between", value1, value2, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andJobNumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JOB_NUMBER not between", value1, value2, "jobNumber");
            return (Criteria) this;
        }

        public Criteria andPerformanceSalaryIsNull() {
            addCriterion("PERFORMANCE_SALARY is null");
            return (Criteria) this;
        }

        public Criteria andPerformanceSalaryIsNotNull() {
            addCriterion("PERFORMANCE_SALARY is not null");
            return (Criteria) this;
        }

        public Criteria andPerformanceSalaryEqualTo(BigDecimal value) {
            addCriterion("PERFORMANCE_SALARY =", value, "performanceSalary");
            return (Criteria) this;
        }

        public Criteria andPerformanceSalaryNotEqualTo(BigDecimal value) {
            addCriterion("PERFORMANCE_SALARY <>", value, "performanceSalary");
            return (Criteria) this;
        }

        public Criteria andPerformanceSalaryGreaterThan(BigDecimal value) {
            addCriterion("PERFORMANCE_SALARY >", value, "performanceSalary");
            return (Criteria) this;
        }

        public Criteria andPerformanceSalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PERFORMANCE_SALARY >=", value, "performanceSalary");
            return (Criteria) this;
        }

        public Criteria andPerformanceSalaryLessThan(BigDecimal value) {
            addCriterion("PERFORMANCE_SALARY <", value, "performanceSalary");
            return (Criteria) this;
        }

        public Criteria andPerformanceSalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PERFORMANCE_SALARY <=", value, "performanceSalary");
            return (Criteria) this;
        }

        public Criteria andPerformanceSalaryIn(List<BigDecimal> values) {
            addCriterion("PERFORMANCE_SALARY in", values, "performanceSalary");
            return (Criteria) this;
        }

        public Criteria andPerformanceSalaryNotIn(List<BigDecimal> values) {
            addCriterion("PERFORMANCE_SALARY not in", values, "performanceSalary");
            return (Criteria) this;
        }

        public Criteria andPerformanceSalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PERFORMANCE_SALARY between", value1, value2, "performanceSalary");
            return (Criteria) this;
        }

        public Criteria andPerformanceSalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PERFORMANCE_SALARY not between", value1, value2, "performanceSalary");
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