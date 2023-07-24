package edu.java.learningproject.validator;

import edu.java.learningproject.domain.AnswerCityRegister;
import edu.java.learningproject.domain.CityRegisterCheckerResponse;
import edu.java.learningproject.domain.PersonOrder;
import edu.java.learningproject.exception.CityRegisterException;

public class CityRegisterValidator {
    public String hostName;
    protected int port;
    private String login;
    String password;

    private CityRegisterChecker personChecker;

    public CityRegisterValidator() {
        personChecker = new FakeCityRegisterChecker();
    }
    public AnswerCityRegister checkCityRegistration(PersonOrder po) {
        try {
            CityRegisterCheckerResponse husband_ans = personChecker.checkPerson(po.getHusband());
            CityRegisterCheckerResponse wife_ans = personChecker.checkPerson(po.getWife());
            CityRegisterCheckerResponse child_ans = personChecker.checkPerson(po.getChild());
        } catch (CityRegisterException ex) {
            ex.printStackTrace();
        }

        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }
}