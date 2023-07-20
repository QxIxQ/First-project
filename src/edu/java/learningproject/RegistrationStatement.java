package edu.java.learningproject;

import edu.java.learningproject.domain.Adult;
import edu.java.learningproject.domain.Person;
import edu.java.learningproject.domain.PersonOrder;

public class RegistrationStatement {

    public static void main(String[] args) {
//       PersonOrder po = new PersonOrder();
//        long ans = registrationStatementUser(po);
//        System.out.println(ans);
    }
    static long registrationStatementUser(PersonOrder personOrder) {
        long answer = 20;
        System.out.println("Registration statement User:");

        return answer;
    }
    public static PersonOrder buildPersonOrder(long id){
        PersonOrder po = new PersonOrder();
        po.setPersonOrderId(id);

        Adult husband = new Adult("Степанов","Артемий","Сигизмундович",null);
        return po;
    }
}