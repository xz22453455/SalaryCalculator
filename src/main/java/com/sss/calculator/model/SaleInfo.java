package com.sss.calculator.model;

import java.math.BigDecimal;

public class SaleInfo {
    private String id;

    private String year;

    private String month;

    private String employeeNo;

    private String department;

    private String post;

    private String postLevel;

    private BigDecimal totalOrderSize;

    private BigDecimal yearTargetSize;

    private BigDecimal totalOrderMoney;

    private BigDecimal yearTargetMoney;

    private BigDecimal currentMonthSize;

    private BigDecimal monthTargetSize;

    private BigDecimal currentMonthMoney;

    private BigDecimal monthTargetMoney;

    private BigDecimal totalOutputSize;

    private BigDecimal pricePerTon;

    private BigDecimal totalOutputMoney;

    private BigDecimal totalReturnMoney;

    private BigDecimal currentMonthOutputSize;

    private BigDecimal currentMonthOutputMoney;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo == null ? null : employeeNo.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
    }

    public String getPostLevel() {
        return postLevel;
    }

    public void setPostLevel(String postLevel) {
        this.postLevel = postLevel == null ? null : postLevel.trim();
    }

    public BigDecimal getTotalOrderSize() {
        return totalOrderSize;
    }

    public void setTotalOrderSize(BigDecimal totalOrderSize) {
        this.totalOrderSize = totalOrderSize;
    }

    public BigDecimal getYearTargetSize() {
        return yearTargetSize;
    }

    public void setYearTargetSize(BigDecimal yearTargetSize) {
        this.yearTargetSize = yearTargetSize;
    }

    public BigDecimal getTotalOrderMoney() {
        return totalOrderMoney;
    }

    public void setTotalOrderMoney(BigDecimal totalOrderMoney) {
        this.totalOrderMoney = totalOrderMoney;
    }

    public BigDecimal getYearTargetMoney() {
        return yearTargetMoney;
    }

    public void setYearTargetMoney(BigDecimal yearTargetMoney) {
        this.yearTargetMoney = yearTargetMoney;
    }

    public BigDecimal getCurrentMonthSize() {
        return currentMonthSize;
    }

    public void setCurrentMonthSize(BigDecimal currentMonthSize) {
        this.currentMonthSize = currentMonthSize;
    }

    public BigDecimal getMonthTargetSize() {
        return monthTargetSize;
    }

    public void setMonthTargetSize(BigDecimal monthTargetSize) {
        this.monthTargetSize = monthTargetSize;
    }

    public BigDecimal getCurrentMonthMoney() {
        return currentMonthMoney;
    }

    public void setCurrentMonthMoney(BigDecimal currentMonthMoney) {
        this.currentMonthMoney = currentMonthMoney;
    }

    public BigDecimal getMonthTargetMoney() {
        return monthTargetMoney;
    }

    public void setMonthTargetMoney(BigDecimal monthTargetMoney) {
        this.monthTargetMoney = monthTargetMoney;
    }

    public BigDecimal getTotalOutputSize() {
        return totalOutputSize;
    }

    public void setTotalOutputSize(BigDecimal totalOutputSize) {
        this.totalOutputSize = totalOutputSize;
    }

    public BigDecimal getPricePerTon() {
        return pricePerTon;
    }

    public void setPricePerTon(BigDecimal pricePerTon) {
        this.pricePerTon = pricePerTon;
    }

    public BigDecimal getTotalOutputMoney() {
        return totalOutputMoney;
    }

    public void setTotalOutputMoney(BigDecimal totalOutputMoney) {
        this.totalOutputMoney = totalOutputMoney;
    }

    public BigDecimal getTotalReturnMoney() {
        return totalReturnMoney;
    }

    public void setTotalReturnMoney(BigDecimal totalReturnMoney) {
        this.totalReturnMoney = totalReturnMoney;
    }

    public BigDecimal getCurrentMonthOutputSize() {
        return currentMonthOutputSize;
    }

    public void setCurrentMonthOutputSize(BigDecimal currentMonthOutputSize) {
        this.currentMonthOutputSize = currentMonthOutputSize;
    }

    public BigDecimal getCurrentMonthOutputMoney() {
        return currentMonthOutputMoney;
    }

    public void setCurrentMonthOutputMoney(BigDecimal currentMonthOutputMoney) {
        this.currentMonthOutputMoney = currentMonthOutputMoney;
    }
}