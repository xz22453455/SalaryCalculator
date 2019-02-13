package com.sss.calculator.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("AGE is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("AGE is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Short value) {
            addCriterion("AGE =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Short value) {
            addCriterion("AGE <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Short value) {
            addCriterion("AGE >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Short value) {
            addCriterion("AGE >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Short value) {
            addCriterion("AGE <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Short value) {
            addCriterion("AGE <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Short> values) {
            addCriterion("AGE in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Short> values) {
            addCriterion("AGE not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Short value1, Short value2) {
            addCriterion("AGE between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Short value1, Short value2) {
            addCriterion("AGE not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("NATION is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("NATION is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("NATION =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("NATION <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("NATION >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("NATION >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("NATION <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("NATION <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("NATION like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("NATION not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("NATION in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("NATION not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("NATION between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("NATION not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusIsNull() {
            addCriterion("POLITICS_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusIsNotNull() {
            addCriterion("POLITICS_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusEqualTo(String value) {
            addCriterion("POLITICS_STATUS =", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusNotEqualTo(String value) {
            addCriterion("POLITICS_STATUS <>", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusGreaterThan(String value) {
            addCriterion("POLITICS_STATUS >", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusGreaterThanOrEqualTo(String value) {
            addCriterion("POLITICS_STATUS >=", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusLessThan(String value) {
            addCriterion("POLITICS_STATUS <", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusLessThanOrEqualTo(String value) {
            addCriterion("POLITICS_STATUS <=", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusLike(String value) {
            addCriterion("POLITICS_STATUS like", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusNotLike(String value) {
            addCriterion("POLITICS_STATUS not like", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusIn(List<String> values) {
            addCriterion("POLITICS_STATUS in", values, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusNotIn(List<String> values) {
            addCriterion("POLITICS_STATUS not in", values, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusBetween(String value1, String value2) {
            addCriterion("POLITICS_STATUS between", value1, value2, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusNotBetween(String value1, String value2) {
            addCriterion("POLITICS_STATUS not between", value1, value2, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNull() {
            addCriterion("MARITAL_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNotNull() {
            addCriterion("MARITAL_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusEqualTo(String value) {
            addCriterion("MARITAL_STATUS =", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotEqualTo(String value) {
            addCriterion("MARITAL_STATUS <>", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThan(String value) {
            addCriterion("MARITAL_STATUS >", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("MARITAL_STATUS >=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThan(String value) {
            addCriterion("MARITAL_STATUS <", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThanOrEqualTo(String value) {
            addCriterion("MARITAL_STATUS <=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLike(String value) {
            addCriterion("MARITAL_STATUS like", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotLike(String value) {
            addCriterion("MARITAL_STATUS not like", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIn(List<String> values) {
            addCriterion("MARITAL_STATUS in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotIn(List<String> values) {
            addCriterion("MARITAL_STATUS not in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusBetween(String value1, String value2) {
            addCriterion("MARITAL_STATUS between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotBetween(String value1, String value2) {
            addCriterion("MARITAL_STATUS not between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNull() {
            addCriterion("ID_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNotNull() {
            addCriterion("ID_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andIdNumberEqualTo(String value) {
            addCriterion("ID_NUMBER =", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotEqualTo(String value) {
            addCriterion("ID_NUMBER <>", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThan(String value) {
            addCriterion("ID_NUMBER >", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ID_NUMBER >=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThan(String value) {
            addCriterion("ID_NUMBER <", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThanOrEqualTo(String value) {
            addCriterion("ID_NUMBER <=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLike(String value) {
            addCriterion("ID_NUMBER like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotLike(String value) {
            addCriterion("ID_NUMBER not like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberIn(List<String> values) {
            addCriterion("ID_NUMBER in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotIn(List<String> values) {
            addCriterion("ID_NUMBER not in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberBetween(String value1, String value2) {
            addCriterion("ID_NUMBER between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotBetween(String value1, String value2) {
            addCriterion("ID_NUMBER not between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIsNull() {
            addCriterion("NATIVE_PLACE is null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIsNotNull() {
            addCriterion("NATIVE_PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceEqualTo(String value) {
            addCriterion("NATIVE_PLACE =", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotEqualTo(String value) {
            addCriterion("NATIVE_PLACE <>", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceGreaterThan(String value) {
            addCriterion("NATIVE_PLACE >", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("NATIVE_PLACE >=", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLessThan(String value) {
            addCriterion("NATIVE_PLACE <", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLessThanOrEqualTo(String value) {
            addCriterion("NATIVE_PLACE <=", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLike(String value) {
            addCriterion("NATIVE_PLACE like", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotLike(String value) {
            addCriterion("NATIVE_PLACE not like", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIn(List<String> values) {
            addCriterion("NATIVE_PLACE in", values, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotIn(List<String> values) {
            addCriterion("NATIVE_PLACE not in", values, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceBetween(String value1, String value2) {
            addCriterion("NATIVE_PLACE between", value1, value2, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotBetween(String value1, String value2) {
            addCriterion("NATIVE_PLACE not between", value1, value2, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andLiveAddressIsNull() {
            addCriterion("LIVE_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andLiveAddressIsNotNull() {
            addCriterion("LIVE_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andLiveAddressEqualTo(String value) {
            addCriterion("LIVE_ADDRESS =", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressNotEqualTo(String value) {
            addCriterion("LIVE_ADDRESS <>", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressGreaterThan(String value) {
            addCriterion("LIVE_ADDRESS >", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressGreaterThanOrEqualTo(String value) {
            addCriterion("LIVE_ADDRESS >=", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressLessThan(String value) {
            addCriterion("LIVE_ADDRESS <", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressLessThanOrEqualTo(String value) {
            addCriterion("LIVE_ADDRESS <=", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressLike(String value) {
            addCriterion("LIVE_ADDRESS like", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressNotLike(String value) {
            addCriterion("LIVE_ADDRESS not like", value, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressIn(List<String> values) {
            addCriterion("LIVE_ADDRESS in", values, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressNotIn(List<String> values) {
            addCriterion("LIVE_ADDRESS not in", values, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressBetween(String value1, String value2) {
            addCriterion("LIVE_ADDRESS between", value1, value2, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andLiveAddressNotBetween(String value1, String value2) {
            addCriterion("LIVE_ADDRESS not between", value1, value2, "liveAddress");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNull() {
            addCriterion("BIRTHDATE is null");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNotNull() {
            addCriterion("BIRTHDATE is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdateEqualTo(String value) {
            addCriterion("BIRTHDATE =", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotEqualTo(String value) {
            addCriterion("BIRTHDATE <>", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThan(String value) {
            addCriterion("BIRTHDATE >", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThanOrEqualTo(String value) {
            addCriterion("BIRTHDATE >=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThan(String value) {
            addCriterion("BIRTHDATE <", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThanOrEqualTo(String value) {
            addCriterion("BIRTHDATE <=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLike(String value) {
            addCriterion("BIRTHDATE like", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotLike(String value) {
            addCriterion("BIRTHDATE not like", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateIn(List<String> values) {
            addCriterion("BIRTHDATE in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotIn(List<String> values) {
            addCriterion("BIRTHDATE not in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateBetween(String value1, String value2) {
            addCriterion("BIRTHDATE between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotBetween(String value1, String value2) {
            addCriterion("BIRTHDATE not between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileIsNull() {
            addCriterion("PLACE_OF_DOMICILE is null");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileIsNotNull() {
            addCriterion("PLACE_OF_DOMICILE is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileEqualTo(String value) {
            addCriterion("PLACE_OF_DOMICILE =", value, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileNotEqualTo(String value) {
            addCriterion("PLACE_OF_DOMICILE <>", value, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileGreaterThan(String value) {
            addCriterion("PLACE_OF_DOMICILE >", value, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileGreaterThanOrEqualTo(String value) {
            addCriterion("PLACE_OF_DOMICILE >=", value, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileLessThan(String value) {
            addCriterion("PLACE_OF_DOMICILE <", value, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileLessThanOrEqualTo(String value) {
            addCriterion("PLACE_OF_DOMICILE <=", value, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileLike(String value) {
            addCriterion("PLACE_OF_DOMICILE like", value, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileNotLike(String value) {
            addCriterion("PLACE_OF_DOMICILE not like", value, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileIn(List<String> values) {
            addCriterion("PLACE_OF_DOMICILE in", values, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileNotIn(List<String> values) {
            addCriterion("PLACE_OF_DOMICILE not in", values, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileBetween(String value1, String value2) {
            addCriterion("PLACE_OF_DOMICILE between", value1, value2, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andPlaceOfDomicileNotBetween(String value1, String value2) {
            addCriterion("PLACE_OF_DOMICILE not between", value1, value2, "placeOfDomicile");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolIsNull() {
            addCriterion("GRADUATED_SCHOOL is null");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolIsNotNull() {
            addCriterion("GRADUATED_SCHOOL is not null");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolEqualTo(String value) {
            addCriterion("GRADUATED_SCHOOL =", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolNotEqualTo(String value) {
            addCriterion("GRADUATED_SCHOOL <>", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolGreaterThan(String value) {
            addCriterion("GRADUATED_SCHOOL >", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("GRADUATED_SCHOOL >=", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolLessThan(String value) {
            addCriterion("GRADUATED_SCHOOL <", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolLessThanOrEqualTo(String value) {
            addCriterion("GRADUATED_SCHOOL <=", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolLike(String value) {
            addCriterion("GRADUATED_SCHOOL like", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolNotLike(String value) {
            addCriterion("GRADUATED_SCHOOL not like", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolIn(List<String> values) {
            addCriterion("GRADUATED_SCHOOL in", values, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolNotIn(List<String> values) {
            addCriterion("GRADUATED_SCHOOL not in", values, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolBetween(String value1, String value2) {
            addCriterion("GRADUATED_SCHOOL between", value1, value2, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolNotBetween(String value1, String value2) {
            addCriterion("GRADUATED_SCHOOL not between", value1, value2, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("MAJOR is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("MAJOR is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("MAJOR =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("MAJOR <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("MAJOR >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("MAJOR >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("MAJOR <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("MAJOR <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("MAJOR like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("MAJOR not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("MAJOR in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("MAJOR not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("MAJOR between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("MAJOR not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("EDUCATION is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("EDUCATION is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("EDUCATION =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("EDUCATION <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("EDUCATION >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("EDUCATION >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("EDUCATION <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("EDUCATION <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("EDUCATION like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("EDUCATION not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("EDUCATION in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("EDUCATION not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("EDUCATION between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("EDUCATION not between", value1, value2, "education");
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

        public Criteria andJobIsNull() {
            addCriterion("JOB is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("JOB is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("JOB =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("JOB <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("JOB >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("JOB >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("JOB <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("JOB <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("JOB like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("JOB not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("JOB in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("JOB not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("JOB between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("JOB not between", value1, value2, "job");
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

        public Criteria andWorkAgeMonthIsNull() {
            addCriterion("WORK_AGE_MONTH is null");
            return (Criteria) this;
        }

        public Criteria andWorkAgeMonthIsNotNull() {
            addCriterion("WORK_AGE_MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andWorkAgeMonthEqualTo(Short value) {
            addCriterion("WORK_AGE_MONTH =", value, "workAgeMonth");
            return (Criteria) this;
        }

        public Criteria andWorkAgeMonthNotEqualTo(Short value) {
            addCriterion("WORK_AGE_MONTH <>", value, "workAgeMonth");
            return (Criteria) this;
        }

        public Criteria andWorkAgeMonthGreaterThan(Short value) {
            addCriterion("WORK_AGE_MONTH >", value, "workAgeMonth");
            return (Criteria) this;
        }

        public Criteria andWorkAgeMonthGreaterThanOrEqualTo(Short value) {
            addCriterion("WORK_AGE_MONTH >=", value, "workAgeMonth");
            return (Criteria) this;
        }

        public Criteria andWorkAgeMonthLessThan(Short value) {
            addCriterion("WORK_AGE_MONTH <", value, "workAgeMonth");
            return (Criteria) this;
        }

        public Criteria andWorkAgeMonthLessThanOrEqualTo(Short value) {
            addCriterion("WORK_AGE_MONTH <=", value, "workAgeMonth");
            return (Criteria) this;
        }

        public Criteria andWorkAgeMonthIn(List<Short> values) {
            addCriterion("WORK_AGE_MONTH in", values, "workAgeMonth");
            return (Criteria) this;
        }

        public Criteria andWorkAgeMonthNotIn(List<Short> values) {
            addCriterion("WORK_AGE_MONTH not in", values, "workAgeMonth");
            return (Criteria) this;
        }

        public Criteria andWorkAgeMonthBetween(Short value1, Short value2) {
            addCriterion("WORK_AGE_MONTH between", value1, value2, "workAgeMonth");
            return (Criteria) this;
        }

        public Criteria andWorkAgeMonthNotBetween(Short value1, Short value2) {
            addCriterion("WORK_AGE_MONTH not between", value1, value2, "workAgeMonth");
            return (Criteria) this;
        }

        public Criteria andContractExpirationTimeIsNull() {
            addCriterion("CONTRACT_EXPIRATION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andContractExpirationTimeIsNotNull() {
            addCriterion("CONTRACT_EXPIRATION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andContractExpirationTimeEqualTo(Short value) {
            addCriterion("CONTRACT_EXPIRATION_TIME =", value, "contractExpirationTime");
            return (Criteria) this;
        }

        public Criteria andContractExpirationTimeNotEqualTo(Short value) {
            addCriterion("CONTRACT_EXPIRATION_TIME <>", value, "contractExpirationTime");
            return (Criteria) this;
        }

        public Criteria andContractExpirationTimeGreaterThan(Short value) {
            addCriterion("CONTRACT_EXPIRATION_TIME >", value, "contractExpirationTime");
            return (Criteria) this;
        }

        public Criteria andContractExpirationTimeGreaterThanOrEqualTo(Short value) {
            addCriterion("CONTRACT_EXPIRATION_TIME >=", value, "contractExpirationTime");
            return (Criteria) this;
        }

        public Criteria andContractExpirationTimeLessThan(Short value) {
            addCriterion("CONTRACT_EXPIRATION_TIME <", value, "contractExpirationTime");
            return (Criteria) this;
        }

        public Criteria andContractExpirationTimeLessThanOrEqualTo(Short value) {
            addCriterion("CONTRACT_EXPIRATION_TIME <=", value, "contractExpirationTime");
            return (Criteria) this;
        }

        public Criteria andContractExpirationTimeIn(List<Short> values) {
            addCriterion("CONTRACT_EXPIRATION_TIME in", values, "contractExpirationTime");
            return (Criteria) this;
        }

        public Criteria andContractExpirationTimeNotIn(List<Short> values) {
            addCriterion("CONTRACT_EXPIRATION_TIME not in", values, "contractExpirationTime");
            return (Criteria) this;
        }

        public Criteria andContractExpirationTimeBetween(Short value1, Short value2) {
            addCriterion("CONTRACT_EXPIRATION_TIME between", value1, value2, "contractExpirationTime");
            return (Criteria) this;
        }

        public Criteria andContractExpirationTimeNotBetween(Short value1, Short value2) {
            addCriterion("CONTRACT_EXPIRATION_TIME not between", value1, value2, "contractExpirationTime");
            return (Criteria) this;
        }

        public Criteria andHiredateIsNull() {
            addCriterion("HIREDATE is null");
            return (Criteria) this;
        }

        public Criteria andHiredateIsNotNull() {
            addCriterion("HIREDATE is not null");
            return (Criteria) this;
        }

        public Criteria andHiredateEqualTo(String value) {
            addCriterion("HIREDATE =", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateNotEqualTo(String value) {
            addCriterion("HIREDATE <>", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateGreaterThan(String value) {
            addCriterion("HIREDATE >", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateGreaterThanOrEqualTo(String value) {
            addCriterion("HIREDATE >=", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateLessThan(String value) {
            addCriterion("HIREDATE <", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateLessThanOrEqualTo(String value) {
            addCriterion("HIREDATE <=", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateLike(String value) {
            addCriterion("HIREDATE like", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateNotLike(String value) {
            addCriterion("HIREDATE not like", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateIn(List<String> values) {
            addCriterion("HIREDATE in", values, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateNotIn(List<String> values) {
            addCriterion("HIREDATE not in", values, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateBetween(String value1, String value2) {
            addCriterion("HIREDATE between", value1, value2, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateNotBetween(String value1, String value2) {
            addCriterion("HIREDATE not between", value1, value2, "hiredate");
            return (Criteria) this;
        }

        public Criteria andLastContractDateIsNull() {
            addCriterion("LAST_CONTRACT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastContractDateIsNotNull() {
            addCriterion("LAST_CONTRACT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastContractDateEqualTo(String value) {
            addCriterion("LAST_CONTRACT_DATE =", value, "lastContractDate");
            return (Criteria) this;
        }

        public Criteria andLastContractDateNotEqualTo(String value) {
            addCriterion("LAST_CONTRACT_DATE <>", value, "lastContractDate");
            return (Criteria) this;
        }

        public Criteria andLastContractDateGreaterThan(String value) {
            addCriterion("LAST_CONTRACT_DATE >", value, "lastContractDate");
            return (Criteria) this;
        }

        public Criteria andLastContractDateGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_CONTRACT_DATE >=", value, "lastContractDate");
            return (Criteria) this;
        }

        public Criteria andLastContractDateLessThan(String value) {
            addCriterion("LAST_CONTRACT_DATE <", value, "lastContractDate");
            return (Criteria) this;
        }

        public Criteria andLastContractDateLessThanOrEqualTo(String value) {
            addCriterion("LAST_CONTRACT_DATE <=", value, "lastContractDate");
            return (Criteria) this;
        }

        public Criteria andLastContractDateLike(String value) {
            addCriterion("LAST_CONTRACT_DATE like", value, "lastContractDate");
            return (Criteria) this;
        }

        public Criteria andLastContractDateNotLike(String value) {
            addCriterion("LAST_CONTRACT_DATE not like", value, "lastContractDate");
            return (Criteria) this;
        }

        public Criteria andLastContractDateIn(List<String> values) {
            addCriterion("LAST_CONTRACT_DATE in", values, "lastContractDate");
            return (Criteria) this;
        }

        public Criteria andLastContractDateNotIn(List<String> values) {
            addCriterion("LAST_CONTRACT_DATE not in", values, "lastContractDate");
            return (Criteria) this;
        }

        public Criteria andLastContractDateBetween(String value1, String value2) {
            addCriterion("LAST_CONTRACT_DATE between", value1, value2, "lastContractDate");
            return (Criteria) this;
        }

        public Criteria andLastContractDateNotBetween(String value1, String value2) {
            addCriterion("LAST_CONTRACT_DATE not between", value1, value2, "lastContractDate");
            return (Criteria) this;
        }

        public Criteria andNumberContractIsNull() {
            addCriterion("NUMBER_CONTRACT is null");
            return (Criteria) this;
        }

        public Criteria andNumberContractIsNotNull() {
            addCriterion("NUMBER_CONTRACT is not null");
            return (Criteria) this;
        }

        public Criteria andNumberContractEqualTo(Short value) {
            addCriterion("NUMBER_CONTRACT =", value, "numberContract");
            return (Criteria) this;
        }

        public Criteria andNumberContractNotEqualTo(Short value) {
            addCriterion("NUMBER_CONTRACT <>", value, "numberContract");
            return (Criteria) this;
        }

        public Criteria andNumberContractGreaterThan(Short value) {
            addCriterion("NUMBER_CONTRACT >", value, "numberContract");
            return (Criteria) this;
        }

        public Criteria andNumberContractGreaterThanOrEqualTo(Short value) {
            addCriterion("NUMBER_CONTRACT >=", value, "numberContract");
            return (Criteria) this;
        }

        public Criteria andNumberContractLessThan(Short value) {
            addCriterion("NUMBER_CONTRACT <", value, "numberContract");
            return (Criteria) this;
        }

        public Criteria andNumberContractLessThanOrEqualTo(Short value) {
            addCriterion("NUMBER_CONTRACT <=", value, "numberContract");
            return (Criteria) this;
        }

        public Criteria andNumberContractIn(List<Short> values) {
            addCriterion("NUMBER_CONTRACT in", values, "numberContract");
            return (Criteria) this;
        }

        public Criteria andNumberContractNotIn(List<Short> values) {
            addCriterion("NUMBER_CONTRACT not in", values, "numberContract");
            return (Criteria) this;
        }

        public Criteria andNumberContractBetween(Short value1, Short value2) {
            addCriterion("NUMBER_CONTRACT between", value1, value2, "numberContract");
            return (Criteria) this;
        }

        public Criteria andNumberContractNotBetween(Short value1, Short value2) {
            addCriterion("NUMBER_CONTRACT not between", value1, value2, "numberContract");
            return (Criteria) this;
        }

        public Criteria andContractDeadlineIsNull() {
            addCriterion("CONTRACT_DEADLINE is null");
            return (Criteria) this;
        }

        public Criteria andContractDeadlineIsNotNull() {
            addCriterion("CONTRACT_DEADLINE is not null");
            return (Criteria) this;
        }

        public Criteria andContractDeadlineEqualTo(String value) {
            addCriterion("CONTRACT_DEADLINE =", value, "contractDeadline");
            return (Criteria) this;
        }

        public Criteria andContractDeadlineNotEqualTo(String value) {
            addCriterion("CONTRACT_DEADLINE <>", value, "contractDeadline");
            return (Criteria) this;
        }

        public Criteria andContractDeadlineGreaterThan(String value) {
            addCriterion("CONTRACT_DEADLINE >", value, "contractDeadline");
            return (Criteria) this;
        }

        public Criteria andContractDeadlineGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_DEADLINE >=", value, "contractDeadline");
            return (Criteria) this;
        }

        public Criteria andContractDeadlineLessThan(String value) {
            addCriterion("CONTRACT_DEADLINE <", value, "contractDeadline");
            return (Criteria) this;
        }

        public Criteria andContractDeadlineLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_DEADLINE <=", value, "contractDeadline");
            return (Criteria) this;
        }

        public Criteria andContractDeadlineLike(String value) {
            addCriterion("CONTRACT_DEADLINE like", value, "contractDeadline");
            return (Criteria) this;
        }

        public Criteria andContractDeadlineNotLike(String value) {
            addCriterion("CONTRACT_DEADLINE not like", value, "contractDeadline");
            return (Criteria) this;
        }

        public Criteria andContractDeadlineIn(List<String> values) {
            addCriterion("CONTRACT_DEADLINE in", values, "contractDeadline");
            return (Criteria) this;
        }

        public Criteria andContractDeadlineNotIn(List<String> values) {
            addCriterion("CONTRACT_DEADLINE not in", values, "contractDeadline");
            return (Criteria) this;
        }

        public Criteria andContractDeadlineBetween(String value1, String value2) {
            addCriterion("CONTRACT_DEADLINE between", value1, value2, "contractDeadline");
            return (Criteria) this;
        }

        public Criteria andContractDeadlineNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_DEADLINE not between", value1, value2, "contractDeadline");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("TELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("TELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("TELEPHONE =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("TELEPHONE <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("TELEPHONE >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("TELEPHONE >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("TELEPHONE <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("TELEPHONE <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("TELEPHONE like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("TELEPHONE not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("TELEPHONE in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("TELEPHONE not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("TELEPHONE between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("TELEPHONE not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andSpareTelephoneIsNull() {
            addCriterion("SPARE_TELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andSpareTelephoneIsNotNull() {
            addCriterion("SPARE_TELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andSpareTelephoneEqualTo(String value) {
            addCriterion("SPARE_TELEPHONE =", value, "spareTelephone");
            return (Criteria) this;
        }

        public Criteria andSpareTelephoneNotEqualTo(String value) {
            addCriterion("SPARE_TELEPHONE <>", value, "spareTelephone");
            return (Criteria) this;
        }

        public Criteria andSpareTelephoneGreaterThan(String value) {
            addCriterion("SPARE_TELEPHONE >", value, "spareTelephone");
            return (Criteria) this;
        }

        public Criteria andSpareTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("SPARE_TELEPHONE >=", value, "spareTelephone");
            return (Criteria) this;
        }

        public Criteria andSpareTelephoneLessThan(String value) {
            addCriterion("SPARE_TELEPHONE <", value, "spareTelephone");
            return (Criteria) this;
        }

        public Criteria andSpareTelephoneLessThanOrEqualTo(String value) {
            addCriterion("SPARE_TELEPHONE <=", value, "spareTelephone");
            return (Criteria) this;
        }

        public Criteria andSpareTelephoneLike(String value) {
            addCriterion("SPARE_TELEPHONE like", value, "spareTelephone");
            return (Criteria) this;
        }

        public Criteria andSpareTelephoneNotLike(String value) {
            addCriterion("SPARE_TELEPHONE not like", value, "spareTelephone");
            return (Criteria) this;
        }

        public Criteria andSpareTelephoneIn(List<String> values) {
            addCriterion("SPARE_TELEPHONE in", values, "spareTelephone");
            return (Criteria) this;
        }

        public Criteria andSpareTelephoneNotIn(List<String> values) {
            addCriterion("SPARE_TELEPHONE not in", values, "spareTelephone");
            return (Criteria) this;
        }

        public Criteria andSpareTelephoneBetween(String value1, String value2) {
            addCriterion("SPARE_TELEPHONE between", value1, value2, "spareTelephone");
            return (Criteria) this;
        }

        public Criteria andSpareTelephoneNotBetween(String value1, String value2) {
            addCriterion("SPARE_TELEPHONE not between", value1, value2, "spareTelephone");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("COMMENTS is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("COMMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("COMMENTS =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("COMMENTS <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("COMMENTS >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENTS >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("COMMENTS <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("COMMENTS <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("COMMENTS like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("COMMENTS not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("COMMENTS in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("COMMENTS not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("COMMENTS between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("COMMENTS not between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andWorkingStateIsNull() {
            addCriterion("WORKING_STATE is null");
            return (Criteria) this;
        }

        public Criteria andWorkingStateIsNotNull() {
            addCriterion("WORKING_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkingStateEqualTo(String value) {
            addCriterion("WORKING_STATE =", value, "workingState");
            return (Criteria) this;
        }

        public Criteria andWorkingStateNotEqualTo(String value) {
            addCriterion("WORKING_STATE <>", value, "workingState");
            return (Criteria) this;
        }

        public Criteria andWorkingStateGreaterThan(String value) {
            addCriterion("WORKING_STATE >", value, "workingState");
            return (Criteria) this;
        }

        public Criteria andWorkingStateGreaterThanOrEqualTo(String value) {
            addCriterion("WORKING_STATE >=", value, "workingState");
            return (Criteria) this;
        }

        public Criteria andWorkingStateLessThan(String value) {
            addCriterion("WORKING_STATE <", value, "workingState");
            return (Criteria) this;
        }

        public Criteria andWorkingStateLessThanOrEqualTo(String value) {
            addCriterion("WORKING_STATE <=", value, "workingState");
            return (Criteria) this;
        }

        public Criteria andWorkingStateLike(String value) {
            addCriterion("WORKING_STATE like", value, "workingState");
            return (Criteria) this;
        }

        public Criteria andWorkingStateNotLike(String value) {
            addCriterion("WORKING_STATE not like", value, "workingState");
            return (Criteria) this;
        }

        public Criteria andWorkingStateIn(List<String> values) {
            addCriterion("WORKING_STATE in", values, "workingState");
            return (Criteria) this;
        }

        public Criteria andWorkingStateNotIn(List<String> values) {
            addCriterion("WORKING_STATE not in", values, "workingState");
            return (Criteria) this;
        }

        public Criteria andWorkingStateBetween(String value1, String value2) {
            addCriterion("WORKING_STATE between", value1, value2, "workingState");
            return (Criteria) this;
        }

        public Criteria andWorkingStateNotBetween(String value1, String value2) {
            addCriterion("WORKING_STATE not between", value1, value2, "workingState");
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

        public Criteria andPostLevelEqualTo(Short value) {
            addCriterion("POST_LEVEL =", value, "postLevel");
            return (Criteria) this;
        }

        public Criteria andPostLevelNotEqualTo(Short value) {
            addCriterion("POST_LEVEL <>", value, "postLevel");
            return (Criteria) this;
        }

        public Criteria andPostLevelGreaterThan(Short value) {
            addCriterion("POST_LEVEL >", value, "postLevel");
            return (Criteria) this;
        }

        public Criteria andPostLevelGreaterThanOrEqualTo(Short value) {
            addCriterion("POST_LEVEL >=", value, "postLevel");
            return (Criteria) this;
        }

        public Criteria andPostLevelLessThan(Short value) {
            addCriterion("POST_LEVEL <", value, "postLevel");
            return (Criteria) this;
        }

        public Criteria andPostLevelLessThanOrEqualTo(Short value) {
            addCriterion("POST_LEVEL <=", value, "postLevel");
            return (Criteria) this;
        }

        public Criteria andPostLevelIn(List<Short> values) {
            addCriterion("POST_LEVEL in", values, "postLevel");
            return (Criteria) this;
        }

        public Criteria andPostLevelNotIn(List<Short> values) {
            addCriterion("POST_LEVEL not in", values, "postLevel");
            return (Criteria) this;
        }

        public Criteria andPostLevelBetween(Short value1, Short value2) {
            addCriterion("POST_LEVEL between", value1, value2, "postLevel");
            return (Criteria) this;
        }

        public Criteria andPostLevelNotBetween(Short value1, Short value2) {
            addCriterion("POST_LEVEL not between", value1, value2, "postLevel");
            return (Criteria) this;
        }

        public Criteria andDirectSupervisorIdIsNull() {
            addCriterion("DIRECT_SUPERVISOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andDirectSupervisorIdIsNotNull() {
            addCriterion("DIRECT_SUPERVISOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDirectSupervisorIdEqualTo(String value) {
            addCriterion("DIRECT_SUPERVISOR_ID =", value, "directSupervisorId");
            return (Criteria) this;
        }

        public Criteria andDirectSupervisorIdNotEqualTo(String value) {
            addCriterion("DIRECT_SUPERVISOR_ID <>", value, "directSupervisorId");
            return (Criteria) this;
        }

        public Criteria andDirectSupervisorIdGreaterThan(String value) {
            addCriterion("DIRECT_SUPERVISOR_ID >", value, "directSupervisorId");
            return (Criteria) this;
        }

        public Criteria andDirectSupervisorIdGreaterThanOrEqualTo(String value) {
            addCriterion("DIRECT_SUPERVISOR_ID >=", value, "directSupervisorId");
            return (Criteria) this;
        }

        public Criteria andDirectSupervisorIdLessThan(String value) {
            addCriterion("DIRECT_SUPERVISOR_ID <", value, "directSupervisorId");
            return (Criteria) this;
        }

        public Criteria andDirectSupervisorIdLessThanOrEqualTo(String value) {
            addCriterion("DIRECT_SUPERVISOR_ID <=", value, "directSupervisorId");
            return (Criteria) this;
        }

        public Criteria andDirectSupervisorIdLike(String value) {
            addCriterion("DIRECT_SUPERVISOR_ID like", value, "directSupervisorId");
            return (Criteria) this;
        }

        public Criteria andDirectSupervisorIdNotLike(String value) {
            addCriterion("DIRECT_SUPERVISOR_ID not like", value, "directSupervisorId");
            return (Criteria) this;
        }

        public Criteria andDirectSupervisorIdIn(List<String> values) {
            addCriterion("DIRECT_SUPERVISOR_ID in", values, "directSupervisorId");
            return (Criteria) this;
        }

        public Criteria andDirectSupervisorIdNotIn(List<String> values) {
            addCriterion("DIRECT_SUPERVISOR_ID not in", values, "directSupervisorId");
            return (Criteria) this;
        }

        public Criteria andDirectSupervisorIdBetween(String value1, String value2) {
            addCriterion("DIRECT_SUPERVISOR_ID between", value1, value2, "directSupervisorId");
            return (Criteria) this;
        }

        public Criteria andDirectSupervisorIdNotBetween(String value1, String value2) {
            addCriterion("DIRECT_SUPERVISOR_ID not between", value1, value2, "directSupervisorId");
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