public class CheckApplicationStatement {
    public static void main(String[] args) {
        checkAll();
    }
    static void checkAll() {
        PersonOrder po = readPersonOrder(); // read (receive) an application

        AnswerCityRegister cityAnswer = checkArhiveRegistration(po); //answer city register
        AnswerFamilyStatus FamilyAnswer = checkFamilyStatus(po); // answer marriage check
        AnswerCheckChildren ChildrenAnswer = checkChildren(po); // answer check for children
        AnswerCheckPerson AnswerCheckPerson = checkPerson(po); // response to the request of the city book to check the applicant for belonging to a certain group

        sendMail(po); // sending an e-mail about the result of the check
    }
    static PersonOrder readPersonOrder() {
        PersonOrder po = new PersonOrder(); // creation of an instance of the application
        return po;
    }
    static AnswerCityRegister checkArhiveRegistration(PersonOrder po) {
        System.out.println("Check register is running");
        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }
    static AnswerFamilyStatus checkFamilyStatus(PersonOrder po) {
        System.out.println("Check family status is running");
        return new AnswerFamilyStatus();
    }
    static AnswerCheckChildren checkChildren(PersonOrder po) {
        System.out.println("Children check is running");
        return new AnswerCheckChildren();
    }
    static AnswerCheckPerson checkPerson(PersonOrder po) {
        System.out.println("Person check is running");
        return new AnswerCheckPerson();
    }
    static void sendMail(PersonOrder po) {
        System.out.println("Send an e-mail about the result of the check");
    }

}