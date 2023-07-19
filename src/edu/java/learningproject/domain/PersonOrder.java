package edu.java.learningproject.domain;

public class PersonOrder {
   private long personOrderId; //индентификатор
   private Adult husband;
   private Adult wife;
   private Child child;

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

    public void setWife(Adult wife) {
        this.wife = wife;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }
}
