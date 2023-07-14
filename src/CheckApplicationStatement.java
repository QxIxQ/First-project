public class CheckApplicationStatement {
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {
        checkArhiveRegistration();
        checkFamilyStatus();
        checkChildren();
        checkPerson();
    }

    static void checkArhiveRegistration() {
        System.out.println("Check register is running");
    }

    static void checkFamilyStatus() {
        System.out.println("Check family status is running");
    }

    static void checkChildren() {
        System.out.println("Children check is running");
    }

    static void checkPerson() {
        System.out.println("Person check is running");
    }
}