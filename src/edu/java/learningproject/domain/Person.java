package edu.java.learningproject.domain;

import java.time.LocalDate;

public class Person {
    private String surName;
    private String giveName;
    private String  patronymic;
    private LocalDate dataOfBirth;
    private String Address;

    public String getSurName() {
        return surName;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGiveName() {
        return giveName;
    }

    public void setGiveName(String giveName) {
        this.giveName = giveName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(LocalDate dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
