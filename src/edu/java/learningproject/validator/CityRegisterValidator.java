package edu.java.learningproject.validator;

import edu.java.learningproject.domain.AnswerCityRegister;
import edu.java.learningproject.domain.PersonOrder;

public class CityRegisterValidator {
    public String hostName;
    protected int port;
    private String login;
    String password;

    public AnswerCityRegister checkArhiveRegistration(PersonOrder po) {
        System.out.println("Check register is running:" + hostName + "," + login + "," + password);
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.success = false;
        return ans;
    }
}
