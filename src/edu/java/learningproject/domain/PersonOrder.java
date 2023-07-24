package edu.java.learningproject.domain;

import java.time.LocalDate;

public class PersonOrder {
   private long personOrderId; //индентификатор
   private Adult husband;
   private Adult wife;
   private Child child;
   private String marriageCertificatedId;
   private String marriageOffice;
   private LocalDate marriageDate;

    public long getPersonOrderId() {
        return personOrderId;
    }

    public void setPersonOrderId(long personOrderId) {
        this.personOrderId = personOrderId;
    }

    public Adult getHusband() {
        return husband;
    }

    public void setHusband(Adult husband) {
        this.husband = husband;
    }

    public Adult getWife() {
        return wife;
    }

    public void setWife(Adult wife) { this.wife = wife; }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public String getMarriageCertificatedId() { return marriageCertificatedId; }

    public void setMarriageCertificatedId(String marriageCertificatedId) { this.marriageCertificatedId = marriageCertificatedId; }

    public String getMarriageOffice() { return marriageOffice; }

    public void setMarriageOffice(String marriageOffice) { this.marriageOffice = marriageOffice; }

    public LocalDate getMarriageDate() { return marriageDate; }

    public void setMarriageDate(LocalDate marriageDate) { this.marriageDate = marriageDate; }
}
