package edu.java.learningproject;

import edu.java.learningproject.domain.Adult;
import edu.java.learningproject.domain.Person;
import edu.java.learningproject.domain.PersonOrder;

public class RegistrationStatement {

    public static void main(String[] args) {
        buildPersonOrder();

//       PersonOrder po = new PersonOrder();
//        long ans = registrationStatementUser(po);
//        System.out.println(ans);
    }
    static long registrationStatementUser(PersonOrder personOrder) {
        long answer = 20;
        System.out.println("Registration statement User:");

        return answer;
    }

    public static PersonOrder buildPersonOrder(){
        PersonOrder po = new PersonOrder();

        Adult husband = new Adult();

//        husband.setGivenName("Alexandr");
//        husband.setSurName("Ivanov");
//        husband.setPassportNumber("123456789");
//        po.setHusband(husband);

//          String ans = husband.getPersonString();
//          System.out.println(ans);

        return po;
    }
}