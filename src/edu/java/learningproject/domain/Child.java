package edu.java.learningproject.domain;

import java.time.LocalDate;

public class Child extends Person {
    private String certificateNumber;
    public LocalDate issueData;
    public String issueDepartment;

    public Child(String surName, String givenName, String patronymic, LocalDate dataOfBirth) {    // create constructor matching Person (super)
        super(surName, givenName, patronymic, dataOfBirth);
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
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
}
