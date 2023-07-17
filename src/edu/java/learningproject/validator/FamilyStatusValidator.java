package edu.java.learningproject.validator;

import edu.java.learningproject.domain.AnswerFamilyStatus;
import edu.java.learningproject.domain.PersonOrder;

public class FamilyStatusValidator {
    public AnswerFamilyStatus checkFamilyStatus(PersonOrder po) {
        System.out.println("Check family status is running");
        return new AnswerFamilyStatus();
    }
}
