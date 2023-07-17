package edu.java.learningproject.validator;

import edu.java.learningproject.domain.AnswerCheckPerson;
import edu.java.learningproject.domain.PersonOrder;

public class PersonValidator {
    public AnswerCheckPerson checkPerson(PersonOrder po) {
        System.out.println("Person check is running");
        return new AnswerCheckPerson();
    }
}
