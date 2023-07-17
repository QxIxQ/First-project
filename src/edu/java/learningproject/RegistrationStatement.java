package edu.java.learningproject;

import edu.java.learningproject.domain.PersonOrder;

public class RegistrationStatement {
    public static void main(String[] args) {
        PersonOrder po = new PersonOrder();
        po.sethFirstName("Alexandr");
        po.sethLastName("Ivanov");
        po.setwFirstName("Elena");
        po.setwLastName("Ivanova");

        long ans = registrationStatementUser(po);
        System.out.println(ans);
    }
    static long registrationStatementUser(PersonOrder personOrder) {
        long answer = 20;
        System.out.println("registrationStatementUser" + personOrder.gethLastName());

        return answer;
    }
}
