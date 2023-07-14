public class RegistrationStatement {
    public static void main(String[] args) {
        PersonOrder po;
        po = new PersonOrder();
        po.hFirstName = "Alexandr";
        po.hLastName = "Ivanov";
        po.wFirstName = "Elena";
        po.wLastName = "Ivanova";

        po.hFirstName = "Sergey";
        po.hLastName = "Petrov";
        po.wFirstName = "Anna";
        po.wLastName = "Petrova";

        long ans = registrationStatementUser(po);
        System.out.println(ans);
        long ans1 = registrationStatementUser(po);
        System.out.println(ans1);
    }
    static long registrationStatementUser(PersonOrder personOrder) {
        long answer;
        answer = 20;
        System.out.println("registrationStatementUser" + personOrder.wLastName);

        return answer;
    }
}
