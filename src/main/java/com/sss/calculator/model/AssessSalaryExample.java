package com.sss.calculator.model;

import java.util.ArrayList;
import java.util.List;

public class AssessSalaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssessSalaryExample() {
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

        public Criteria andJobgradeIsNull() {
            addCriterion("JOBGRADE is null");
            return (Criteria) this;
        }

        public Criteria andJobgradeIsNotNull() {
            addCriterion("JOBGRADE is not null");
            return (Criteria) this;
        }

        public Criteria andJobgradeEqualTo(String value) {
            addCriterion("JOBGRADE =", value, "jobgrade");
            return (Criteria) this;
        }

        public Criteria andJobgradeNotEqualTo(String value) {
            addCriterion("JOBGRADE <>", value, "jobgrade");
            return (Criteria) this;
        }

        public Criteria andJobgradeGreaterThan(String value) {
            addCriterion("JOBGRADE >", value, "jobgrade");
            return (Criteria) this;
        }

        public Criteria andJobgradeGreaterThanOrEqualTo(String value) {
            addCriterion("JOBGRADE >=", value, "jobgrade");
            return (Criteria) this;
        }

        public Criteria andJobgradeLessThan(String value) {
            addCriterion("JOBGRADE <", value, "jobgrade");
            return (Criteria) this;
        }

        public Criteria andJobgradeLessThanOrEqualTo(String value) {
            addCriterion("JOBGRADE <=", value, "jobgrade");
            return (Criteria) this;
        }

        public Criteria andJobgradeLike(String value) {
            addCriterion("JOBGRADE like", value, "jobgrade");
            return (Criteria) this;
        }

        public Criteria andJobgradeNotLike(String value) {
            addCriterion("JOBGRADE not like", value, "jobgrade");
            return (Criteria) this;
        }

        public Criteria andJobgradeIn(List<String> values) {
            addCriterion("JOBGRADE in", values, "jobgrade");
            return (Criteria) this;
        }

        public Criteria andJobgradeNotIn(List<String> values) {
            addCriterion("JOBGRADE not in", values, "jobgrade");
            return (Criteria) this;
        }

        public Criteria andJobgradeBetween(String value1, String value2) {
            addCriterion("JOBGRADE between", value1, value2, "jobgrade");
            return (Criteria) this;
        }

        public Criteria andJobgradeNotBetween(String value1, String value2) {
            addCriterion("JOBGRADE not between", value1, value2, "jobgrade");
            return (Criteria) this;
        }

        public Criteria andStarLevelIsNull() {
            addCriterion("STAR_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andStarLevelIsNotNull() {
            addCriterion("STAR_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andStarLevelEqualTo(String value) {
            addCriterion("STAR_LEVEL =", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelNotEqualTo(String value) {
            addCriterion("STAR_LEVEL <>", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelGreaterThan(String value) {
            addCriterion("STAR_LEVEL >", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelGreaterThanOrEqualTo(String value) {
            addCriterion("STAR_LEVEL >=", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelLessThan(String value) {
            addCriterion("STAR_LEVEL <", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelLessThanOrEqualTo(String value) {
            addCriterion("STAR_LEVEL <=", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelLike(String value) {
            addCriterion("STAR_LEVEL like", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelNotLike(String value) {
            addCriterion("STAR_LEVEL not like", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelIn(List<String> values) {
            addCriterion("STAR_LEVEL in", values, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelNotIn(List<String> values) {
            addCriterion("STAR_LEVEL not in", values, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelBetween(String value1, String value2) {
            addCriterion("STAR_LEVEL between", value1, value2, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelNotBetween(String value1, String value2) {
            addCriterion("STAR_LEVEL not between", value1, value2, "starLevel");
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

        public Criteria andExaminationItemIsNull() {
            addCriterion("EXAMINATION_ITEM is null");
            return (Criteria) this;
        }

        public Criteria andExaminationItemIsNotNull() {
            addCriterion("EXAMINATION_ITEM is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationItemEqualTo(String value) {
            addCriterion("EXAMINATION_ITEM =", value, "examinationItem");
            return (Criteria) this;
        }

        public Criteria andExaminationItemNotEqualTo(String value) {
            addCriterion("EXAMINATION_ITEM <>", value, "examinationItem");
            return (Criteria) this;
        }

        public Criteria andExaminationItemGreaterThan(String value) {
            addCriterion("EXAMINATION_ITEM >", value, "examinationItem");
            return (Criteria) this;
        }

        public Criteria andExaminationItemGreaterThanOrEqualTo(String value) {
            addCriterion("EXAMINATION_ITEM >=", value, "examinationItem");
            return (Criteria) this;
        }

        public Criteria andExaminationItemLessThan(String value) {
            addCriterion("EXAMINATION_ITEM <", value, "examinationItem");
            return (Criteria) this;
        }

        public Criteria andExaminationItemLessThanOrEqualTo(String value) {
            addCriterion("EXAMINATION_ITEM <=", value, "examinationItem");
            return (Criteria) this;
        }

        public Criteria andExaminationItemLike(String value) {
            addCriterion("EXAMINATION_ITEM like", value, "examinationItem");
            return (Criteria) this;
        }

        public Criteria andExaminationItemNotLike(String value) {
            addCriterion("EXAMINATION_ITEM not like", value, "examinationItem");
            return (Criteria) this;
        }

        public Criteria andExaminationItemIn(List<String> values) {
            addCriterion("EXAMINATION_ITEM in", values, "examinationItem");
            return (Criteria) this;
        }

        public Criteria andExaminationItemNotIn(List<String> values) {
            addCriterion("EXAMINATION_ITEM not in", values, "examinationItem");
            return (Criteria) this;
        }

        public Criteria andExaminationItemBetween(String value1, String value2) {
            addCriterion("EXAMINATION_ITEM between", value1, value2, "examinationItem");
            return (Criteria) this;
        }

        public Criteria andExaminationItemNotBetween(String value1, String value2) {
            addCriterion("EXAMINATION_ITEM not between", value1, value2, "examinationItem");
            return (Criteria) this;
        }

        public Criteria andCategotyIsNull() {
            addCriterion("CATEGOTY is null");
            return (Criteria) this;
        }

        public Criteria andCategotyIsNotNull() {
            addCriterion("CATEGOTY is not null");
            return (Criteria) this;
        }

        public Criteria andCategotyEqualTo(String value) {
            addCriterion("CATEGOTY =", value, "categoty");
            return (Criteria) this;
        }

        public Criteria andCategotyNotEqualTo(String value) {
            addCriterion("CATEGOTY <>", value, "categoty");
            return (Criteria) this;
        }

        public Criteria andCategotyGreaterThan(String value) {
            addCriterion("CATEGOTY >", value, "categoty");
            return (Criteria) this;
        }

        public Criteria andCategotyGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGOTY >=", value, "categoty");
            return (Criteria) this;
        }

        public Criteria andCategotyLessThan(String value) {
            addCriterion("CATEGOTY <", value, "categoty");
            return (Criteria) this;
        }

        public Criteria andCategotyLessThanOrEqualTo(String value) {
            addCriterion("CATEGOTY <=", value, "categoty");
            return (Criteria) this;
        }

        public Criteria andCategotyLike(String value) {
            addCriterion("CATEGOTY like", value, "categoty");
            return (Criteria) this;
        }

        public Criteria andCategotyNotLike(String value) {
            addCriterion("CATEGOTY not like", value, "categoty");
            return (Criteria) this;
        }

        public Criteria andCategotyIn(List<String> values) {
            addCriterion("CATEGOTY in", values, "categoty");
            return (Criteria) this;
        }

        public Criteria andCategotyNotIn(List<String> values) {
            addCriterion("CATEGOTY not in", values, "categoty");
            return (Criteria) this;
        }

        public Criteria andCategotyBetween(String value1, String value2) {
            addCriterion("CATEGOTY between", value1, value2, "categoty");
            return (Criteria) this;
        }

        public Criteria andCategotyNotBetween(String value1, String value2) {
            addCriterion("CATEGOTY not between", value1, value2, "categoty");
            return (Criteria) this;
        }

        public Criteria andAssessmentMethodIsNull() {
            addCriterion("ASSESSMENT_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andAssessmentMethodIsNotNull() {
            addCriterion("ASSESSMENT_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmentMethodEqualTo(String value) {
            addCriterion("ASSESSMENT_METHOD =", value, "assessmentMethod");
            return (Criteria) this;
        }

        public Criteria andAssessmentMethodNotEqualTo(String value) {
            addCriterion("ASSESSMENT_METHOD <>", value, "assessmentMethod");
            return (Criteria) this;
        }

        public Criteria andAssessmentMethodGreaterThan(String value) {
            addCriterion("ASSESSMENT_METHOD >", value, "assessmentMethod");
            return (Criteria) this;
        }

        public Criteria andAssessmentMethodGreaterThanOrEqualTo(String value) {
            addCriterion("ASSESSMENT_METHOD >=", value, "assessmentMethod");
            return (Criteria) this;
        }

        public Criteria andAssessmentMethodLessThan(String value) {
            addCriterion("ASSESSMENT_METHOD <", value, "assessmentMethod");
            return (Criteria) this;
        }

        public Criteria andAssessmentMethodLessThanOrEqualTo(String value) {
            addCriterion("ASSESSMENT_METHOD <=", value, "assessmentMethod");
            return (Criteria) this;
        }

        public Criteria andAssessmentMethodLike(String value) {
            addCriterion("ASSESSMENT_METHOD like", value, "assessmentMethod");
            return (Criteria) this;
        }

        public Criteria andAssessmentMethodNotLike(String value) {
            addCriterion("ASSESSMENT_METHOD not like", value, "assessmentMethod");
            return (Criteria) this;
        }

        public Criteria andAssessmentMethodIn(List<String> values) {
            addCriterion("ASSESSMENT_METHOD in", values, "assessmentMethod");
            return (Criteria) this;
        }

        public Criteria andAssessmentMethodNotIn(List<String> values) {
            addCriterion("ASSESSMENT_METHOD not in", values, "assessmentMethod");
            return (Criteria) this;
        }

        public Criteria andAssessmentMethodBetween(String value1, String value2) {
            addCriterion("ASSESSMENT_METHOD between", value1, value2, "assessmentMethod");
            return (Criteria) this;
        }

        public Criteria andAssessmentMethodNotBetween(String value1, String value2) {
            addCriterion("ASSESSMENT_METHOD not between", value1, value2, "assessmentMethod");
            return (Criteria) this;
        }

        public Criteria andAlgorithmIsNull() {
            addCriterion("ALGORITHM is null");
            return (Criteria) this;
        }

        public Criteria andAlgorithmIsNotNull() {
            addCriterion("ALGORITHM is not null");
            return (Criteria) this;
        }

        public Criteria andAlgorithmEqualTo(String value) {
            addCriterion("ALGORITHM =", value, "algorithm");
            return (Criteria) this;
        }

        public Criteria andAlgorithmNotEqualTo(String value) {
            addCriterion("ALGORITHM <>", value, "algorithm");
            return (Criteria) this;
        }

        public Criteria andAlgorithmGreaterThan(String value) {
            addCriterion("ALGORITHM >", value, "algorithm");
            return (Criteria) this;
        }

        public Criteria andAlgorithmGreaterThanOrEqualTo(String value) {
            addCriterion("ALGORITHM >=", value, "algorithm");
            return (Criteria) this;
        }

        public Criteria andAlgorithmLessThan(String value) {
            addCriterion("ALGORITHM <", value, "algorithm");
            return (Criteria) this;
        }

        public Criteria andAlgorithmLessThanOrEqualTo(String value) {
            addCriterion("ALGORITHM <=", value, "algorithm");
            return (Criteria) this;
        }

        public Criteria andAlgorithmLike(String value) {
            addCriterion("ALGORITHM like", value, "algorithm");
            return (Criteria) this;
        }

        public Criteria andAlgorithmNotLike(String value) {
            addCriterion("ALGORITHM not like", value, "algorithm");
            return (Criteria) this;
        }

        public Criteria andAlgorithmIn(List<String> values) {
            addCriterion("ALGORITHM in", values, "algorithm");
            return (Criteria) this;
        }

        public Criteria andAlgorithmNotIn(List<String> values) {
            addCriterion("ALGORITHM not in", values, "algorithm");
            return (Criteria) this;
        }

        public Criteria andAlgorithmBetween(String value1, String value2) {
            addCriterion("ALGORITHM between", value1, value2, "algorithm");
            return (Criteria) this;
        }

        public Criteria andAlgorithmNotBetween(String value1, String value2) {
            addCriterion("ALGORITHM not between", value1, value2, "algorithm");
            return (Criteria) this;
        }

        public Criteria andAssessmentSalaryIsNull() {
            addCriterion("ASSESSMENT_SALARY is null");
            return (Criteria) this;
        }

        public Criteria andAssessmentSalaryIsNotNull() {
            addCriterion("ASSESSMENT_SALARY is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmentSalaryEqualTo(String value) {
            addCriterion("ASSESSMENT_SALARY =", value, "assessmentSalary");
            return (Criteria) this;
        }

        public Criteria andAssessmentSalaryNotEqualTo(String value) {
            addCriterion("ASSESSMENT_SALARY <>", value, "assessmentSalary");
            return (Criteria) this;
        }

        public Criteria andAssessmentSalaryGreaterThan(String value) {
            addCriterion("ASSESSMENT_SALARY >", value, "assessmentSalary");
            return (Criteria) this;
        }

        public Criteria andAssessmentSalaryGreaterThanOrEqualTo(String value) {
            addCriterion("ASSESSMENT_SALARY >=", value, "assessmentSalary");
            return (Criteria) this;
        }

        public Criteria andAssessmentSalaryLessThan(String value) {
            addCriterion("ASSESSMENT_SALARY <", value, "assessmentSalary");
            return (Criteria) this;
        }

        public Criteria andAssessmentSalaryLessThanOrEqualTo(String value) {
            addCriterion("ASSESSMENT_SALARY <=", value, "assessmentSalary");
            return (Criteria) this;
        }

        public Criteria andAssessmentSalaryLike(String value) {
            addCriterion("ASSESSMENT_SALARY like", value, "assessmentSalary");
            return (Criteria) this;
        }

        public Criteria andAssessmentSalaryNotLike(String value) {
            addCriterion("ASSESSMENT_SALARY not like", value, "assessmentSalary");
            return (Criteria) this;
        }

        public Criteria andAssessmentSalaryIn(List<String> values) {
            addCriterion("ASSESSMENT_SALARY in", values, "assessmentSalary");
            return (Criteria) this;
        }

        public Criteria andAssessmentSalaryNotIn(List<String> values) {
            addCriterion("ASSESSMENT_SALARY not in", values, "assessmentSalary");
            return (Criteria) this;
        }

        public Criteria andAssessmentSalaryBetween(String value1, String value2) {
            addCriterion("ASSESSMENT_SALARY between", value1, value2, "assessmentSalary");
            return (Criteria) this;
        }

        public Criteria andAssessmentSalaryNotBetween(String value1, String value2) {
            addCriterion("ASSESSMENT_SALARY not between", value1, value2, "assessmentSalary");
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