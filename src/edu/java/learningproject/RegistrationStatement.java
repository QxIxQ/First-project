package edu.java.learningproject;

import edu.java.learningproject.domain.Adult;
import edu.java.learningproject.domain.Person;
import edu.java.learningproject.domain.PersonOrder;

public class RegistrationStatement {

    public static void main(String[] args) {
        buildPersonOrder(10);

//       PersonOrder po = new PersonOrder();
//        long ans = registrationStatementUser(po);
//        System.out.println(ans);
    }
    static long registrationStatementUser(PersonOrder personOrder) {
        long answer = 20;
        System.out.println("Registration statement User:");

        return answer;
    }
    public static PersonOrder buildPersonOrder(long id){
        PersonOrder po = new PersonOrder();                            // создали объект (в ссылке все параметры входные всегда копируются)
        po.setPersonOrderId(id);                                      // поменяли ему индентификатор
        PersonOrder po1 = po;                                         // присвоили еще одной ссылке указатель на этот объект
        printPersonOrder(po1);                                        //вызвали функцию в которую передали еще наш объект

//        Adult husband = new Adult("Степанов","Артемий","Сигизмундович",null);
        return po;
    }
    static  void printPersonOrder(PersonOrder persOr){             /* входной параметр внутри самого метода -
                                                                      - (persOr) - еще одна ссылка в которую копируется, в данном случае значение po1 */

        System.out.println(persOr.getPersonOrderId());
    }                                                            // после выполнения ссылка persOr перестанет существовать
}