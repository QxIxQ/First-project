package edu.java.learningproject.domain;

import java.time.LocalDate;

public class Adult extends Person {
    private String passportSeria;
    private String passportNumber;
    private LocalDate issueData;
    private String issueDepartment;
    private String education;
    private String numberId;

    public String getPassportSeria() {
        return passportSeria;
    }

    public void setPassportSeria(String passportSeria) {
        this.passportSeria = passportSeria;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public LocalDate getIssueData() {
        return issueData;
    }

    public void setIssueData(LocalDate issueData) {
        this.issueData = issueData;
    }

    public String getIssueDepartment() {
        return issueDepartment;
    }

    public void setIssueDepartment(String issueDepartment) {
        this.issueDepartment = issueDepartment;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getNumberId() {
        return numberId;
    }

    public void setNumberId(String numberId) {
        this.numberId = numberId;
    }
}
