package com.sss.calculator.model;

public class AssessSalary {
    private String jobgrade;

    private String starLevel;

    private String year;

    private String examinationItem;

    private String categoty;

    private String assessmentMethod;

    private String algorithm;

    private String assessmentSalary;

    public String getJobgrade() {
        return jobgrade;
    }

    public void setJobgrade(String jobgrade) {
        this.jobgrade = jobgrade == null ? null : jobgrade.trim();
    }

    public String getStarLevel() {
        return starLevel;
    }

    public void setStarLevel(String starLevel) {
        this.starLevel = starLevel == null ? null : starLevel.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public String getExaminationItem() {
        return examinationItem;
    }

    public void setExaminationItem(String examinationItem) {
        this.examinationItem = examinationItem == null ? null : examinationItem.trim();
    }

    public String getCategoty() {
        return categoty;
    }

    public void setCategoty(String categoty) {
        this.categoty = categoty == null ? null : categoty.trim();
    }

    public String getAssessmentMethod() {
        return assessmentMethod;
    }

    public void setAssessmentMethod(String assessmentMethod) {
        this.assessmentMethod = assessmentMethod == null ? null : assessmentMethod.trim();
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm == null ? null : algorithm.trim();
    }

    public String getAssessmentSalary() {
        return assessmentSalary;
    }

    public void setAssessmentSalary(String assessmentSalary) {
        this.assessmentSalary = assessmentSalary == null ? null : assessmentSalary.trim();
    }
}