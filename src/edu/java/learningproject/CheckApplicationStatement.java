package edu.java.learningproject;

import edu.java.learningproject.domain.*;
import edu.java.learningproject.mail.MailSender;
import edu.java.learningproject.validator.CildrenValidator;
import edu.java.learningproject.validator.CityRegisterValidator;
import edu.java.learningproject.validator.FamilyStatusValidator;
import edu.java.learningproject.validator.PersonValidator;

public class CheckApplicationStatement {
    public static void main(String[] args) {

        checkAll();
    }
    static void checkAll() {

        while (true) {
            PersonOrder po = readPersonOrder();// read (receive) an application
            if (po == null){
                break;
            }

            AnswerCityRegister cityAnswer = checkArhiveRegistration(po); //answer city register
            if (!cityAnswer.success){
                //...
                //continue;
                break;
            }

            AnswerFamilyStatus FamilyAnswer = checkFamilyStatus(po);// answer marriage check
            AnswerCheckChildren ChildrenAnswer = checkChildren(po); // answer check for children
            AnswerCheckPerson AnswerCheckPerson = checkPerson(po); // response to the request of the city book to check the applicant for belonging to a certain group

            sendMail(po); // sending an e-mail about the result of the check
        }
    }

    static PersonOrder readPersonOrder() {
        PersonOrder po = new PersonOrder(); // creation of an instance of the application
        return po;
    }
    static AnswerCityRegister checkArhiveRegistration(PersonOrder po) {
        CityRegisterValidator crv1 =  new CityRegisterValidator();
        crv1.hostName = "Host1";
        AnswerCityRegister ans1 = crv1.checkArhiveRegistration(po);
        return ans1;
    }
    static AnswerFamilyStatus checkFamilyStatus(PersonOrder po) {
        FamilyStatusValidator fsv = new FamilyStatusValidator();
        return fsv.checkFamilyStatus(po);

    }
    static AnswerCheckChildren checkChildren(PersonOrder po) {
        CildrenValidator cv = new CildrenValidator();
        return cv.checkChildren(po);
    }
    static AnswerCheckPerson checkPerson(PersonOrder po) {
        return new PersonValidator().checkPerson(po); // более краткая форма записи - создал объект и сразу предложил вызвать
    }
    static void sendMail(PersonOrder po) {
    new MailSender().sendMail(po);
    }

}