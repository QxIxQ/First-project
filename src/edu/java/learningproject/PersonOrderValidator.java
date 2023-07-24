package edu.java.learningproject;

import edu.java.learningproject.domain.*;
import edu.java.learningproject.mail.MailSender;
import edu.java.learningproject.validator.ChildrenValidator;
import edu.java.learningproject.validator.CityRegisterValidator;
import edu.java.learningproject.validator.FamilyStatusValidator;
import edu.java.learningproject.validator.PersonValidator;

public class PersonOrderValidator
{
    private CityRegisterValidator cityRegisterVal;
    private FamilyStatusValidator familyStatusVal;
    private ChildrenValidator childrenVal;
    private PersonValidator personVal;
    private MailSender mailSender;

    public PersonOrderValidator() {
        cityRegisterVal = new CityRegisterValidator();
        familyStatusVal = new FamilyStatusValidator();
        childrenVal = new ChildrenValidator();
        personVal = new PersonValidator();
        mailSender = new MailSender();
    }
    public static void main(String[] args) {
       PersonOrderValidator pov = new PersonOrderValidator();
       pov.checkAll();
    }
    public void checkAll() {
        PersonOrder[] poArray = readPersonOrders();                 // read (receive) an application

        for(int c = 0; c < poArray.length; c++){   // * loop for
            System.out.println();
            checkOneOrder(poArray[c]);
        }
//        for(PersonOrder po : poArray){      // * loop for-each
//            System.out.println();
//            checkOneOrder(po);
//        }
    }
//
    public PersonOrder[] readPersonOrders() {
        PersonOrder[] poArray = new PersonOrder[3];                // declaration array

        for(int c = 0; c < poArray.length; c++) {
            poArray[c] = RegistrationStatement.buildPersonOrder(c);
        }
        return poArray;
    }

    public void checkOneOrder(PersonOrder po){
        AnswerCityRegister cityAnswer = checkCityRegistration(po);           //answer city register

        AnswerFamilyStatus FamilyAnswer = checkFamilyStatus(po);   // answer marriage check
        AnswerCheckChildren ChildrenAnswer = checkChildren(po);   // answer check for children
        AnswerCheckPerson AnswerCheckPerson = checkPerson(po);    // response to the request of the city book to check the applicant for belonging to a certain group

        sendMail(po); // sending an e-mail about the result of the check
    }

    public AnswerCityRegister checkCityRegistration(PersonOrder po) {
        return cityRegisterVal.checkCityRegistration(po);
    }
    public AnswerFamilyStatus checkFamilyStatus(PersonOrder po) {
        return familyStatusVal.checkFamilyStatus(po);
    }
    public AnswerCheckChildren checkChildren(PersonOrder po) {
        return childrenVal.checkChildren(po);
    }
    public AnswerCheckPerson checkPerson(PersonOrder po) {
        return personVal.checkPerson(po);
    }
    public void sendMail(PersonOrder po) {
    mailSender.sendMail(po);
    }
}