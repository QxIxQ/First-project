package edu.java.learningproject.validator;

import edu.java.learningproject.domain.AnswerCheckChildren;
import edu.java.learningproject.domain.PersonOrder;

public class CildrenValidator {
    public AnswerCheckChildren checkChildren(PersonOrder po) {
        System.out.println("Children check is running");
        return new AnswerCheckChildren();
    }
}
