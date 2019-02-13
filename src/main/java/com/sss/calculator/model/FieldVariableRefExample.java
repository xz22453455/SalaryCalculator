package com.sss.calculator.model;

import java.util.ArrayList;
import java.util.List;

public class FieldVariableRefExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FieldVariableRefExample() {
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

        public Criteria andOrderAppraisalSalaryIsNull() {
            addCriterion("ORDER_APPRAISAL_SALARY is null");
            return (Criteria) this;
        }

        public Criteria andOrderAppraisalSalaryIsNotNull() {
            addCriterion("ORDER_APPRAISAL_SALARY is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAppraisalSalaryEqualTo(String value) {
            addCriterion("ORDER_APPRAISAL_SALARY =", value, "orderAppraisalSalary");
            return (Criteria) this;
        }

        public Criteria andOrderAppraisalSalaryNotEqualTo(String value) {
            addCriterion("ORDER_APPRAISAL_SALARY <>", value, "orderAppraisalSalary");
            return (Criteria) this;
        }

        public Criteria andOrderAppraisalSalaryGreaterThan(String value) {
            addCriterion("ORDER_APPRAISAL_SALARY >", value, "orderAppraisalSalary");
            return (Criteria) this;
        }

        public Criteria andOrderAppraisalSalaryGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_APPRAISAL_SALARY >=", value, "orderAppraisalSalary");
            return (Criteria) this;
        }

        public Criteria andOrderAppraisalSalaryLessThan(String value) {
            addCriterion("ORDER_APPRAISAL_SALARY <", value, "orderAppraisalSalary");
            return (Criteria) this;
        }

        public Criteria andOrderAppraisalSalaryLessThanOrEqualTo(String value) {
            addCriterion("ORDER_APPRAISAL_SALARY <=", value, "orderAppraisalSalary");
            return (Criteria) this;
        }

        public Criteria andOrderAppraisalSalaryLike(String value) {
            addCriterion("ORDER_APPRAISAL_SALARY like", value, "orderAppraisalSalary");
            return (Criteria) this;
        }

        public Criteria andOrderAppraisalSalaryNotLike(String value) {
            addCriterion("ORDER_APPRAISAL_SALARY not like", value, "orderAppraisalSalary");
            return (Criteria) this;
        }

        public Criteria andOrderAppraisalSalaryIn(List<String> values) {
            addCriterion("ORDER_APPRAISAL_SALARY in", values, "orderAppraisalSalary");
            return (Criteria) this;
        }

        public Criteria andOrderAppraisalSalaryNotIn(List<String> values) {
            addCriterion("ORDER_APPRAISAL_SALARY not in", values, "orderAppraisalSalary");
            return (Criteria) this;
        }

        public Criteria andOrderAppraisalSalaryBetween(String value1, String value2) {
            addCriterion("ORDER_APPRAISAL_SALARY between", value1, value2, "orderAppraisalSalary");
            return (Criteria) this;
        }

        public Criteria andOrderAppraisalSalaryNotBetween(String value1, String value2) {
            addCriterion("ORDER_APPRAISAL_SALARY not between", value1, value2, "orderAppraisalSalary");
            return (Criteria) this;
        }

        public Criteria andProfitAppraisalSalaryIsNull() {
            addCriterion("PROFIT_APPRAISAL_SALARY is null");
            return (Criteria) this;
        }

        public Criteria andProfitAppraisalSalaryIsNotNull() {
            addCriterion("PROFIT_APPRAISAL_SALARY is not null");
            return (Criteria) this;
        }

        public Criteria andProfitAppraisalSalaryEqualTo(String value) {
            addCriterion("PROFIT_APPRAISAL_SALARY =", value, "profitAppraisalSalary");
            return (Criteria) this;
        }

        public Criteria andProfitAppraisalSalaryNotEqualTo(String value) {
            addCriterion("PROFIT_APPRAISAL_SALARY <>", value, "profitAppraisalSalary");
            return (Criteria) this;
        }

        public Criteria andProfitAppraisalSalaryGreaterThan(String value) {
            addCriterion("PROFIT_APPRAISAL_SALARY >", value, "profitAppraisalSalary");
            return (Criteria) this;
        }

        public Criteria andProfitAppraisalSalaryGreaterThanOrEqualTo(String value) {
            addCriterion("PROFIT_APPRAISAL_SALARY >=", value, "profitAppraisalSalary");
            return (Criteria) this;
        }

        public Criteria andProfitAppraisalSalaryLessThan(String value) {
            addCriterion("PROFIT_APPRAISAL_SALARY <", value, "profitAppraisalSalary");
            return (Criteria) this;
        }

        public Criteria andProfitAppraisalSalaryLessThanOrEqualTo(String value) {
            addCriterion("PROFIT_APPRAISAL_SALARY <=", value, "profitAppraisalSalary");
            return (Criteria) this;
        }

        public Criteria andProfitAppraisalSalaryLike(String value) {
            addCriterion("PROFIT_APPRAISAL_SALARY like", value, "profitAppraisalSalary");
            return (Criteria) this;
        }

        public Criteria andProfitAppraisalSalaryNotLike(String value) {
            addCriterion("PROFIT_APPRAISAL_SALARY not like", value, "profitAppraisalSalary");
            return (Criteria) this;
        }

        public Criteria andProfitAppraisalSalaryIn(List<String> values) {
            addCriterion("PROFIT_APPRAISAL_SALARY in", values, "profitAppraisalSalary");
            return (Criteria) this;
        }

        public Criteria andProfitAppraisalSalaryNotIn(List<String> values) {
            addCriterion("PROFIT_APPRAISAL_SALARY not in", values, "profitAppraisalSalary");
            return (Criteria) this;
        }

        public Criteria andProfitAppraisalSalaryBetween(String value1, String value2) {
            addCriterion("PROFIT_APPRAISAL_SALARY between", value1, value2, "profitAppraisalSalary");
            return (Criteria) this;
        }

        public Criteria andProfitAppraisalSalaryNotBetween(String value1, String value2) {
            addCriterion("PROFIT_APPRAISAL_SALARY not between", value1, value2, "profitAppraisalSalary");
            return (Criteria) this;
        }

        public Criteria andReturnPayIsNull() {
            addCriterion("RETURN_PAY is null");
            return (Criteria) this;
        }

        public Criteria andReturnPayIsNotNull() {
            addCriterion("RETURN_PAY is not null");
            return (Criteria) this;
        }

        public Criteria andReturnPayEqualTo(String value) {
            addCriterion("RETURN_PAY =", value, "returnPay");
            return (Criteria) this;
        }

        public Criteria andReturnPayNotEqualTo(String value) {
            addCriterion("RETURN_PAY <>", value, "returnPay");
            return (Criteria) this;
        }

        public Criteria andReturnPayGreaterThan(String value) {
            addCriterion("RETURN_PAY >", value, "returnPay");
            return (Criteria) this;
        }

        public Criteria andReturnPayGreaterThanOrEqualTo(String value) {
            addCriterion("RETURN_PAY >=", value, "returnPay");
            return (Criteria) this;
        }

        public Criteria andReturnPayLessThan(String value) {
            addCriterion("RETURN_PAY <", value, "returnPay");
            return (Criteria) this;
        }

        public Criteria andReturnPayLessThanOrEqualTo(String value) {
            addCriterion("RETURN_PAY <=", value, "returnPay");
            return (Criteria) this;
        }

        public Criteria andReturnPayLike(String value) {
            addCriterion("RETURN_PAY like", value, "returnPay");
            return (Criteria) this;
        }

        public Criteria andReturnPayNotLike(String value) {
            addCriterion("RETURN_PAY not like", value, "returnPay");
            return (Criteria) this;
        }

        public Criteria andReturnPayIn(List<String> values) {
            addCriterion("RETURN_PAY in", values, "returnPay");
            return (Criteria) this;
        }

        public Criteria andReturnPayNotIn(List<String> values) {
            addCriterion("RETURN_PAY not in", values, "returnPay");
            return (Criteria) this;
        }

        public Criteria andReturnPayBetween(String value1, String value2) {
            addCriterion("RETURN_PAY between", value1, value2, "returnPay");
            return (Criteria) this;
        }

        public Criteria andReturnPayNotBetween(String value1, String value2) {
            addCriterion("RETURN_PAY not between", value1, value2, "returnPay");
            return (Criteria) this;
        }

        public Criteria andDeliveryPayIsNull() {
            addCriterion("DELIVERY_PAY is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPayIsNotNull() {
            addCriterion("DELIVERY_PAY is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPayEqualTo(String value) {
            addCriterion("DELIVERY_PAY =", value, "deliveryPay");
            return (Criteria) this;
        }

        public Criteria andDeliveryPayNotEqualTo(String value) {
            addCriterion("DELIVERY_PAY <>", value, "deliveryPay");
            return (Criteria) this;
        }

        public Criteria andDeliveryPayGreaterThan(String value) {
            addCriterion("DELIVERY_PAY >", value, "deliveryPay");
            return (Criteria) this;
        }

        public Criteria andDeliveryPayGreaterThanOrEqualTo(String value) {
            addCriterion("DELIVERY_PAY >=", value, "deliveryPay");
            return (Criteria) this;
        }

        public Criteria andDeliveryPayLessThan(String value) {
            addCriterion("DELIVERY_PAY <", value, "deliveryPay");
            return (Criteria) this;
        }

        public Criteria andDeliveryPayLessThanOrEqualTo(String value) {
            addCriterion("DELIVERY_PAY <=", value, "deliveryPay");
            return (Criteria) this;
        }

        public Criteria andDeliveryPayLike(String value) {
            addCriterion("DELIVERY_PAY like", value, "deliveryPay");
            return (Criteria) this;
        }

        public Criteria andDeliveryPayNotLike(String value) {
            addCriterion("DELIVERY_PAY not like", value, "deliveryPay");
            return (Criteria) this;
        }

        public Criteria andDeliveryPayIn(List<String> values) {
            addCriterion("DELIVERY_PAY in", values, "deliveryPay");
            return (Criteria) this;
        }

        public Criteria andDeliveryPayNotIn(List<String> values) {
            addCriterion("DELIVERY_PAY not in", values, "deliveryPay");
            return (Criteria) this;
        }

        public Criteria andDeliveryPayBetween(String value1, String value2) {
            addCriterion("DELIVERY_PAY between", value1, value2, "deliveryPay");
            return (Criteria) this;
        }

        public Criteria andDeliveryPayNotBetween(String value1, String value2) {
            addCriterion("DELIVERY_PAY not between", value1, value2, "deliveryPay");
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

        public Criteria andCurrentMonthSizeEqualTo(String value) {
            addCriterion("CURRENT_MONTH_SIZE =", value, "currentMonthSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthSizeNotEqualTo(String value) {
            addCriterion("CURRENT_MONTH_SIZE <>", value, "currentMonthSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthSizeGreaterThan(String value) {
            addCriterion("CURRENT_MONTH_SIZE >", value, "currentMonthSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthSizeGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENT_MONTH_SIZE >=", value, "currentMonthSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthSizeLessThan(String value) {
            addCriterion("CURRENT_MONTH_SIZE <", value, "currentMonthSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthSizeLessThanOrEqualTo(String value) {
            addCriterion("CURRENT_MONTH_SIZE <=", value, "currentMonthSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthSizeLike(String value) {
            addCriterion("CURRENT_MONTH_SIZE like", value, "currentMonthSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthSizeNotLike(String value) {
            addCriterion("CURRENT_MONTH_SIZE not like", value, "currentMonthSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthSizeIn(List<String> values) {
            addCriterion("CURRENT_MONTH_SIZE in", values, "currentMonthSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthSizeNotIn(List<String> values) {
            addCriterion("CURRENT_MONTH_SIZE not in", values, "currentMonthSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthSizeBetween(String value1, String value2) {
            addCriterion("CURRENT_MONTH_SIZE between", value1, value2, "currentMonthSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthSizeNotBetween(String value1, String value2) {
            addCriterion("CURRENT_MONTH_SIZE not between", value1, value2, "currentMonthSize");
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

        public Criteria andCurrentMonthOutputSizeEqualTo(String value) {
            addCriterion("CURRENT_MONTH_OUTPUT_SIZE =", value, "currentMonthOutputSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputSizeNotEqualTo(String value) {
            addCriterion("CURRENT_MONTH_OUTPUT_SIZE <>", value, "currentMonthOutputSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputSizeGreaterThan(String value) {
            addCriterion("CURRENT_MONTH_OUTPUT_SIZE >", value, "currentMonthOutputSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputSizeGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENT_MONTH_OUTPUT_SIZE >=", value, "currentMonthOutputSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputSizeLessThan(String value) {
            addCriterion("CURRENT_MONTH_OUTPUT_SIZE <", value, "currentMonthOutputSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputSizeLessThanOrEqualTo(String value) {
            addCriterion("CURRENT_MONTH_OUTPUT_SIZE <=", value, "currentMonthOutputSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputSizeLike(String value) {
            addCriterion("CURRENT_MONTH_OUTPUT_SIZE like", value, "currentMonthOutputSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputSizeNotLike(String value) {
            addCriterion("CURRENT_MONTH_OUTPUT_SIZE not like", value, "currentMonthOutputSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputSizeIn(List<String> values) {
            addCriterion("CURRENT_MONTH_OUTPUT_SIZE in", values, "currentMonthOutputSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputSizeNotIn(List<String> values) {
            addCriterion("CURRENT_MONTH_OUTPUT_SIZE not in", values, "currentMonthOutputSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputSizeBetween(String value1, String value2) {
            addCriterion("CURRENT_MONTH_OUTPUT_SIZE between", value1, value2, "currentMonthOutputSize");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputSizeNotBetween(String value1, String value2) {
            addCriterion("CURRENT_MONTH_OUTPUT_SIZE not between", value1, value2, "currentMonthOutputSize");
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

        public Criteria andMonthTargetSizeEqualTo(String value) {
            addCriterion("MONTH_TARGET_SIZE =", value, "monthTargetSize");
            return (Criteria) this;
        }

        public Criteria andMonthTargetSizeNotEqualTo(String value) {
            addCriterion("MONTH_TARGET_SIZE <>", value, "monthTargetSize");
            return (Criteria) this;
        }

        public Criteria andMonthTargetSizeGreaterThan(String value) {
            addCriterion("MONTH_TARGET_SIZE >", value, "monthTargetSize");
            return (Criteria) this;
        }

        public Criteria andMonthTargetSizeGreaterThanOrEqualTo(String value) {
            addCriterion("MONTH_TARGET_SIZE >=", value, "monthTargetSize");
            return (Criteria) this;
        }

        public Criteria andMonthTargetSizeLessThan(String value) {
            addCriterion("MONTH_TARGET_SIZE <", value, "monthTargetSize");
            return (Criteria) this;
        }

        public Criteria andMonthTargetSizeLessThanOrEqualTo(String value) {
            addCriterion("MONTH_TARGET_SIZE <=", value, "monthTargetSize");
            return (Criteria) this;
        }

        public Criteria andMonthTargetSizeLike(String value) {
            addCriterion("MONTH_TARGET_SIZE like", value, "monthTargetSize");
            return (Criteria) this;
        }

        public Criteria andMonthTargetSizeNotLike(String value) {
            addCriterion("MONTH_TARGET_SIZE not like", value, "monthTargetSize");
            return (Criteria) this;
        }

        public Criteria andMonthTargetSizeIn(List<String> values) {
            addCriterion("MONTH_TARGET_SIZE in", values, "monthTargetSize");
            return (Criteria) this;
        }

        public Criteria andMonthTargetSizeNotIn(List<String> values) {
            addCriterion("MONTH_TARGET_SIZE not in", values, "monthTargetSize");
            return (Criteria) this;
        }

        public Criteria andMonthTargetSizeBetween(String value1, String value2) {
            addCriterion("MONTH_TARGET_SIZE between", value1, value2, "monthTargetSize");
            return (Criteria) this;
        }

        public Criteria andMonthTargetSizeNotBetween(String value1, String value2) {
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

        public Criteria andCurrentMonthMoneyEqualTo(String value) {
            addCriterion("CURRENT_MONTH_MONEY =", value, "currentMonthMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthMoneyNotEqualTo(String value) {
            addCriterion("CURRENT_MONTH_MONEY <>", value, "currentMonthMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthMoneyGreaterThan(String value) {
            addCriterion("CURRENT_MONTH_MONEY >", value, "currentMonthMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENT_MONTH_MONEY >=", value, "currentMonthMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthMoneyLessThan(String value) {
            addCriterion("CURRENT_MONTH_MONEY <", value, "currentMonthMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthMoneyLessThanOrEqualTo(String value) {
            addCriterion("CURRENT_MONTH_MONEY <=", value, "currentMonthMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthMoneyLike(String value) {
            addCriterion("CURRENT_MONTH_MONEY like", value, "currentMonthMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthMoneyNotLike(String value) {
            addCriterion("CURRENT_MONTH_MONEY not like", value, "currentMonthMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthMoneyIn(List<String> values) {
            addCriterion("CURRENT_MONTH_MONEY in", values, "currentMonthMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthMoneyNotIn(List<String> values) {
            addCriterion("CURRENT_MONTH_MONEY not in", values, "currentMonthMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthMoneyBetween(String value1, String value2) {
            addCriterion("CURRENT_MONTH_MONEY between", value1, value2, "currentMonthMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthMoneyNotBetween(String value1, String value2) {
            addCriterion("CURRENT_MONTH_MONEY not between", value1, value2, "currentMonthMoney");
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

        public Criteria andCurrentMonthOutputMoneyEqualTo(String value) {
            addCriterion("CURRENT_MONTH_OUTPUT_MONEY =", value, "currentMonthOutputMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputMoneyNotEqualTo(String value) {
            addCriterion("CURRENT_MONTH_OUTPUT_MONEY <>", value, "currentMonthOutputMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputMoneyGreaterThan(String value) {
            addCriterion("CURRENT_MONTH_OUTPUT_MONEY >", value, "currentMonthOutputMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENT_MONTH_OUTPUT_MONEY >=", value, "currentMonthOutputMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputMoneyLessThan(String value) {
            addCriterion("CURRENT_MONTH_OUTPUT_MONEY <", value, "currentMonthOutputMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputMoneyLessThanOrEqualTo(String value) {
            addCriterion("CURRENT_MONTH_OUTPUT_MONEY <=", value, "currentMonthOutputMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputMoneyLike(String value) {
            addCriterion("CURRENT_MONTH_OUTPUT_MONEY like", value, "currentMonthOutputMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputMoneyNotLike(String value) {
            addCriterion("CURRENT_MONTH_OUTPUT_MONEY not like", value, "currentMonthOutputMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputMoneyIn(List<String> values) {
            addCriterion("CURRENT_MONTH_OUTPUT_MONEY in", values, "currentMonthOutputMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputMoneyNotIn(List<String> values) {
            addCriterion("CURRENT_MONTH_OUTPUT_MONEY not in", values, "currentMonthOutputMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputMoneyBetween(String value1, String value2) {
            addCriterion("CURRENT_MONTH_OUTPUT_MONEY between", value1, value2, "currentMonthOutputMoney");
            return (Criteria) this;
        }

        public Criteria andCurrentMonthOutputMoneyNotBetween(String value1, String value2) {
            addCriterion("CURRENT_MONTH_OUTPUT_MONEY not between", value1, value2, "currentMonthOutputMoney");
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

        public Criteria andMonthTargetMoneyEqualTo(String value) {
            addCriterion("MONTH_TARGET_MONEY =", value, "monthTargetMoney");
            return (Criteria) this;
        }

        public Criteria andMonthTargetMoneyNotEqualTo(String value) {
            addCriterion("MONTH_TARGET_MONEY <>", value, "monthTargetMoney");
            return (Criteria) this;
        }

        public Criteria andMonthTargetMoneyGreaterThan(String value) {
            addCriterion("MONTH_TARGET_MONEY >", value, "monthTargetMoney");
            return (Criteria) this;
        }

        public Criteria andMonthTargetMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("MONTH_TARGET_MONEY >=", value, "monthTargetMoney");
            return (Criteria) this;
        }

        public Criteria andMonthTargetMoneyLessThan(String value) {
            addCriterion("MONTH_TARGET_MONEY <", value, "monthTargetMoney");
            return (Criteria) this;
        }

        public Criteria andMonthTargetMoneyLessThanOrEqualTo(String value) {
            addCriterion("MONTH_TARGET_MONEY <=", value, "monthTargetMoney");
            return (Criteria) this;
        }

        public Criteria andMonthTargetMoneyLike(String value) {
            addCriterion("MONTH_TARGET_MONEY like", value, "monthTargetMoney");
            return (Criteria) this;
        }

        public Criteria andMonthTargetMoneyNotLike(String value) {
            addCriterion("MONTH_TARGET_MONEY not like", value, "monthTargetMoney");
            return (Criteria) this;
        }

        public Criteria andMonthTargetMoneyIn(List<String> values) {
            addCriterion("MONTH_TARGET_MONEY in", values, "monthTargetMoney");
            return (Criteria) this;
        }

        public Criteria andMonthTargetMoneyNotIn(List<String> values) {
            addCriterion("MONTH_TARGET_MONEY not in", values, "monthTargetMoney");
            return (Criteria) this;
        }

        public Criteria andMonthTargetMoneyBetween(String value1, String value2) {
            addCriterion("MONTH_TARGET_MONEY between", value1, value2, "monthTargetMoney");
            return (Criteria) this;
        }

        public Criteria andMonthTargetMoneyNotBetween(String value1, String value2) {
            addCriterion("MONTH_TARGET_MONEY not between", value1, value2, "monthTargetMoney");
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

        public Criteria andPricePerTonEqualTo(String value) {
            addCriterion("PRICE_PER_TON =", value, "pricePerTon");
            return (Criteria) this;
        }

        public Criteria andPricePerTonNotEqualTo(String value) {
            addCriterion("PRICE_PER_TON <>", value, "pricePerTon");
            return (Criteria) this;
        }

        public Criteria andPricePerTonGreaterThan(String value) {
            addCriterion("PRICE_PER_TON >", value, "pricePerTon");
            return (Criteria) this;
        }

        public Criteria andPricePerTonGreaterThanOrEqualTo(String value) {
            addCriterion("PRICE_PER_TON >=", value, "pricePerTon");
            return (Criteria) this;
        }

        public Criteria andPricePerTonLessThan(String value) {
            addCriterion("PRICE_PER_TON <", value, "pricePerTon");
            return (Criteria) this;
        }

        public Criteria andPricePerTonLessThanOrEqualTo(String value) {
            addCriterion("PRICE_PER_TON <=", value, "pricePerTon");
            return (Criteria) this;
        }

        public Criteria andPricePerTonLike(String value) {
            addCriterion("PRICE_PER_TON like", value, "pricePerTon");
            return (Criteria) this;
        }

        public Criteria andPricePerTonNotLike(String value) {
            addCriterion("PRICE_PER_TON not like", value, "pricePerTon");
            return (Criteria) this;
        }

        public Criteria andPricePerTonIn(List<String> values) {
            addCriterion("PRICE_PER_TON in", values, "pricePerTon");
            return (Criteria) this;
        }

        public Criteria andPricePerTonNotIn(List<String> values) {
            addCriterion("PRICE_PER_TON not in", values, "pricePerTon");
            return (Criteria) this;
        }

        public Criteria andPricePerTonBetween(String value1, String value2) {
            addCriterion("PRICE_PER_TON between", value1, value2, "pricePerTon");
            return (Criteria) this;
        }

        public Criteria andPricePerTonNotBetween(String value1, String value2) {
            addCriterion("PRICE_PER_TON not between", value1, value2, "pricePerTon");
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

        public Criteria andTotalOrderSizeEqualTo(String value) {
            addCriterion("TOTAL_ORDER_SIZE =", value, "totalOrderSize");
            return (Criteria) this;
        }

        public Criteria andTotalOrderSizeNotEqualTo(String value) {
            addCriterion("TOTAL_ORDER_SIZE <>", value, "totalOrderSize");
            return (Criteria) this;
        }

        public Criteria andTotalOrderSizeGreaterThan(String value) {
            addCriterion("TOTAL_ORDER_SIZE >", value, "totalOrderSize");
            return (Criteria) this;
        }

        public Criteria andTotalOrderSizeGreaterThanOrEqualTo(String value) {
            addCriterion("TOTAL_ORDER_SIZE >=", value, "totalOrderSize");
            return (Criteria) this;
        }

        public Criteria andTotalOrderSizeLessThan(String value) {
            addCriterion("TOTAL_ORDER_SIZE <", value, "totalOrderSize");
            return (Criteria) this;
        }

        public Criteria andTotalOrderSizeLessThanOrEqualTo(String value) {
            addCriterion("TOTAL_ORDER_SIZE <=", value, "totalOrderSize");
            return (Criteria) this;
        }

        public Criteria andTotalOrderSizeLike(String value) {
            addCriterion("TOTAL_ORDER_SIZE like", value, "totalOrderSize");
            return (Criteria) this;
        }

        public Criteria andTotalOrderSizeNotLike(String value) {
            addCriterion("TOTAL_ORDER_SIZE not like", value, "totalOrderSize");
            return (Criteria) this;
        }

        public Criteria andTotalOrderSizeIn(List<String> values) {
            addCriterion("TOTAL_ORDER_SIZE in", values, "totalOrderSize");
            return (Criteria) this;
        }

        public Criteria andTotalOrderSizeNotIn(List<String> values) {
            addCriterion("TOTAL_ORDER_SIZE not in", values, "totalOrderSize");
            return (Criteria) this;
        }

        public Criteria andTotalOrderSizeBetween(String value1, String value2) {
            addCriterion("TOTAL_ORDER_SIZE between", value1, value2, "totalOrderSize");
            return (Criteria) this;
        }

        public Criteria andTotalOrderSizeNotBetween(String value1, String value2) {
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

        public Criteria andYearTargetSizeEqualTo(String value) {
            addCriterion("YEAR_TARGET_SIZE =", value, "yearTargetSize");
            return (Criteria) this;
        }

        public Criteria andYearTargetSizeNotEqualTo(String value) {
            addCriterion("YEAR_TARGET_SIZE <>", value, "yearTargetSize");
            return (Criteria) this;
        }

        public Criteria andYearTargetSizeGreaterThan(String value) {
            addCriterion("YEAR_TARGET_SIZE >", value, "yearTargetSize");
            return (Criteria) this;
        }

        public Criteria andYearTargetSizeGreaterThanOrEqualTo(String value) {
            addCriterion("YEAR_TARGET_SIZE >=", value, "yearTargetSize");
            return (Criteria) this;
        }

        public Criteria andYearTargetSizeLessThan(String value) {
            addCriterion("YEAR_TARGET_SIZE <", value, "yearTargetSize");
            return (Criteria) this;
        }

        public Criteria andYearTargetSizeLessThanOrEqualTo(String value) {
            addCriterion("YEAR_TARGET_SIZE <=", value, "yearTargetSize");
            return (Criteria) this;
        }

        public Criteria andYearTargetSizeLike(String value) {
            addCriterion("YEAR_TARGET_SIZE like", value, "yearTargetSize");
            return (Criteria) this;
        }

        public Criteria andYearTargetSizeNotLike(String value) {
            addCriterion("YEAR_TARGET_SIZE not like", value, "yearTargetSize");
            return (Criteria) this;
        }

        public Criteria andYearTargetSizeIn(List<String> values) {
            addCriterion("YEAR_TARGET_SIZE in", values, "yearTargetSize");
            return (Criteria) this;
        }

        public Criteria andYearTargetSizeNotIn(List<String> values) {
            addCriterion("YEAR_TARGET_SIZE not in", values, "yearTargetSize");
            return (Criteria) this;
        }

        public Criteria andYearTargetSizeBetween(String value1, String value2) {
            addCriterion("YEAR_TARGET_SIZE between", value1, value2, "yearTargetSize");
            return (Criteria) this;
        }

        public Criteria andYearTargetSizeNotBetween(String value1, String value2) {
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

        public Criteria andTotalOrderMoneyEqualTo(String value) {
            addCriterion("TOTAL_ORDER_MONEY =", value, "totalOrderMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOrderMoneyNotEqualTo(String value) {
            addCriterion("TOTAL_ORDER_MONEY <>", value, "totalOrderMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOrderMoneyGreaterThan(String value) {
            addCriterion("TOTAL_ORDER_MONEY >", value, "totalOrderMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOrderMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("TOTAL_ORDER_MONEY >=", value, "totalOrderMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOrderMoneyLessThan(String value) {
            addCriterion("TOTAL_ORDER_MONEY <", value, "totalOrderMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOrderMoneyLessThanOrEqualTo(String value) {
            addCriterion("TOTAL_ORDER_MONEY <=", value, "totalOrderMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOrderMoneyLike(String value) {
            addCriterion("TOTAL_ORDER_MONEY like", value, "totalOrderMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOrderMoneyNotLike(String value) {
            addCriterion("TOTAL_ORDER_MONEY not like", value, "totalOrderMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOrderMoneyIn(List<String> values) {
            addCriterion("TOTAL_ORDER_MONEY in", values, "totalOrderMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOrderMoneyNotIn(List<String> values) {
            addCriterion("TOTAL_ORDER_MONEY not in", values, "totalOrderMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOrderMoneyBetween(String value1, String value2) {
            addCriterion("TOTAL_ORDER_MONEY between", value1, value2, "totalOrderMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOrderMoneyNotBetween(String value1, String value2) {
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

        public Criteria andYearTargetMoneyEqualTo(String value) {
            addCriterion("YEAR_TARGET_MONEY =", value, "yearTargetMoney");
            return (Criteria) this;
        }

        public Criteria andYearTargetMoneyNotEqualTo(String value) {
            addCriterion("YEAR_TARGET_MONEY <>", value, "yearTargetMoney");
            return (Criteria) this;
        }

        public Criteria andYearTargetMoneyGreaterThan(String value) {
            addCriterion("YEAR_TARGET_MONEY >", value, "yearTargetMoney");
            return (Criteria) this;
        }

        public Criteria andYearTargetMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("YEAR_TARGET_MONEY >=", value, "yearTargetMoney");
            return (Criteria) this;
        }

        public Criteria andYearTargetMoneyLessThan(String value) {
            addCriterion("YEAR_TARGET_MONEY <", value, "yearTargetMoney");
            return (Criteria) this;
        }

        public Criteria andYearTargetMoneyLessThanOrEqualTo(String value) {
            addCriterion("YEAR_TARGET_MONEY <=", value, "yearTargetMoney");
            return (Criteria) this;
        }

        public Criteria andYearTargetMoneyLike(String value) {
            addCriterion("YEAR_TARGET_MONEY like", value, "yearTargetMoney");
            return (Criteria) this;
        }

        public Criteria andYearTargetMoneyNotLike(String value) {
            addCriterion("YEAR_TARGET_MONEY not like", value, "yearTargetMoney");
            return (Criteria) this;
        }

        public Criteria andYearTargetMoneyIn(List<String> values) {
            addCriterion("YEAR_TARGET_MONEY in", values, "yearTargetMoney");
            return (Criteria) this;
        }

        public Criteria andYearTargetMoneyNotIn(List<String> values) {
            addCriterion("YEAR_TARGET_MONEY not in", values, "yearTargetMoney");
            return (Criteria) this;
        }

        public Criteria andYearTargetMoneyBetween(String value1, String value2) {
            addCriterion("YEAR_TARGET_MONEY between", value1, value2, "yearTargetMoney");
            return (Criteria) this;
        }

        public Criteria andYearTargetMoneyNotBetween(String value1, String value2) {
            addCriterion("YEAR_TARGET_MONEY not between", value1, value2, "yearTargetMoney");
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

        public Criteria andTotalOutputSizeEqualTo(String value) {
            addCriterion("TOTAL_OUTPUT_SIZE =", value, "totalOutputSize");
            return (Criteria) this;
        }

        public Criteria andTotalOutputSizeNotEqualTo(String value) {
            addCriterion("TOTAL_OUTPUT_SIZE <>", value, "totalOutputSize");
            return (Criteria) this;
        }

        public Criteria andTotalOutputSizeGreaterThan(String value) {
            addCriterion("TOTAL_OUTPUT_SIZE >", value, "totalOutputSize");
            return (Criteria) this;
        }

        public Criteria andTotalOutputSizeGreaterThanOrEqualTo(String value) {
            addCriterion("TOTAL_OUTPUT_SIZE >=", value, "totalOutputSize");
            return (Criteria) this;
        }

        public Criteria andTotalOutputSizeLessThan(String value) {
            addCriterion("TOTAL_OUTPUT_SIZE <", value, "totalOutputSize");
            return (Criteria) this;
        }

        public Criteria andTotalOutputSizeLessThanOrEqualTo(String value) {
            addCriterion("TOTAL_OUTPUT_SIZE <=", value, "totalOutputSize");
            return (Criteria) this;
        }

        public Criteria andTotalOutputSizeLike(String value) {
            addCriterion("TOTAL_OUTPUT_SIZE like", value, "totalOutputSize");
            return (Criteria) this;
        }

        public Criteria andTotalOutputSizeNotLike(String value) {
            addCriterion("TOTAL_OUTPUT_SIZE not like", value, "totalOutputSize");
            return (Criteria) this;
        }

        public Criteria andTotalOutputSizeIn(List<String> values) {
            addCriterion("TOTAL_OUTPUT_SIZE in", values, "totalOutputSize");
            return (Criteria) this;
        }

        public Criteria andTotalOutputSizeNotIn(List<String> values) {
            addCriterion("TOTAL_OUTPUT_SIZE not in", values, "totalOutputSize");
            return (Criteria) this;
        }

        public Criteria andTotalOutputSizeBetween(String value1, String value2) {
            addCriterion("TOTAL_OUTPUT_SIZE between", value1, value2, "totalOutputSize");
            return (Criteria) this;
        }

        public Criteria andTotalOutputSizeNotBetween(String value1, String value2) {
            addCriterion("TOTAL_OUTPUT_SIZE not between", value1, value2, "totalOutputSize");
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

        public Criteria andTotalOutputMoneyEqualTo(String value) {
            addCriterion("TOTAL_OUTPUT_MONEY =", value, "totalOutputMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOutputMoneyNotEqualTo(String value) {
            addCriterion("TOTAL_OUTPUT_MONEY <>", value, "totalOutputMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOutputMoneyGreaterThan(String value) {
            addCriterion("TOTAL_OUTPUT_MONEY >", value, "totalOutputMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOutputMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("TOTAL_OUTPUT_MONEY >=", value, "totalOutputMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOutputMoneyLessThan(String value) {
            addCriterion("TOTAL_OUTPUT_MONEY <", value, "totalOutputMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOutputMoneyLessThanOrEqualTo(String value) {
            addCriterion("TOTAL_OUTPUT_MONEY <=", value, "totalOutputMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOutputMoneyLike(String value) {
            addCriterion("TOTAL_OUTPUT_MONEY like", value, "totalOutputMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOutputMoneyNotLike(String value) {
            addCriterion("TOTAL_OUTPUT_MONEY not like", value, "totalOutputMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOutputMoneyIn(List<String> values) {
            addCriterion("TOTAL_OUTPUT_MONEY in", values, "totalOutputMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOutputMoneyNotIn(List<String> values) {
            addCriterion("TOTAL_OUTPUT_MONEY not in", values, "totalOutputMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOutputMoneyBetween(String value1, String value2) {
            addCriterion("TOTAL_OUTPUT_MONEY between", value1, value2, "totalOutputMoney");
            return (Criteria) this;
        }

        public Criteria andTotalOutputMoneyNotBetween(String value1, String value2) {
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

        public Criteria andTotalReturnMoneyEqualTo(String value) {
            addCriterion("TOTAL_RETURN_MONEY =", value, "totalReturnMoney");
            return (Criteria) this;
        }

        public Criteria andTotalReturnMoneyNotEqualTo(String value) {
            addCriterion("TOTAL_RETURN_MONEY <>", value, "totalReturnMoney");
            return (Criteria) this;
        }

        public Criteria andTotalReturnMoneyGreaterThan(String value) {
            addCriterion("TOTAL_RETURN_MONEY >", value, "totalReturnMoney");
            return (Criteria) this;
        }

        public Criteria andTotalReturnMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("TOTAL_RETURN_MONEY >=", value, "totalReturnMoney");
            return (Criteria) this;
        }

        public Criteria andTotalReturnMoneyLessThan(String value) {
            addCriterion("TOTAL_RETURN_MONEY <", value, "totalReturnMoney");
            return (Criteria) this;
        }

        public Criteria andTotalReturnMoneyLessThanOrEqualTo(String value) {
            addCriterion("TOTAL_RETURN_MONEY <=", value, "totalReturnMoney");
            return (Criteria) this;
        }

        public Criteria andTotalReturnMoneyLike(String value) {
            addCriterion("TOTAL_RETURN_MONEY like", value, "totalReturnMoney");
            return (Criteria) this;
        }

        public Criteria andTotalReturnMoneyNotLike(String value) {
            addCriterion("TOTAL_RETURN_MONEY not like", value, "totalReturnMoney");
            return (Criteria) this;
        }

        public Criteria andTotalReturnMoneyIn(List<String> values) {
            addCriterion("TOTAL_RETURN_MONEY in", values, "totalReturnMoney");
            return (Criteria) this;
        }

        public Criteria andTotalReturnMoneyNotIn(List<String> values) {
            addCriterion("TOTAL_RETURN_MONEY not in", values, "totalReturnMoney");
            return (Criteria) this;
        }

        public Criteria andTotalReturnMoneyBetween(String value1, String value2) {
            addCriterion("TOTAL_RETURN_MONEY between", value1, value2, "totalReturnMoney");
            return (Criteria) this;
        }

        public Criteria andTotalReturnMoneyNotBetween(String value1, String value2) {
            addCriterion("TOTAL_RETURN_MONEY not between", value1, value2, "totalReturnMoney");
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