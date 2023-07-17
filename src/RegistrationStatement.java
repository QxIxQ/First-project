public class RegistrationStatement {
    public static void main(String[] args) {
        PersonOrder po;
        po = new PersonOrder();
        po.hFirstName = "Alexandr";
        po.hLastName = "Ivanov";
        po.wFirstName = "Elena";
        po.wLastName = "Ivanova";

        long ans = registrationStatementUser(po);
        System.out.println(ans);
    }
    static long registrationStatementUser(PersonOrder personOrder) {
        long answer = 20;
        System.out.println("registrationStatementUser" + personOrder.wLastName);

        return answer;
    }
}
