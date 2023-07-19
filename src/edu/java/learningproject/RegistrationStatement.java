package edu.java.learningproject;

import edu.java.learningproject.domain.Adult;
import edu.java.learningproject.domain.PersonOrder;

public class RegistrationStatement {
    public static void main(String[] args) {
        PersonOrder po = new PersonOrder();

        long ans = registrationStatementUser(po);
        System.out.println(ans);
    }
    static long registrationStatementUser(PersonOrder personOrder) {
        long answer = 20;
        System.out.println("Registration statement User:");

        return answer;
    }

    static PersonOrder buildPersonOrder(){
        PersonOrder po = new PersonOrder();
        Adult husband = new Adult();
        husband.setGiveName("Alexandr");
        po.setHusband(husband);

        return po;
    }
}
