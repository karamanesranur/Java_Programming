package Java_Programming_Muhtar.day033_Abstraction;

import java.time.LocalDate;

public class CydeoDevStudentObject {

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Daniel", 'M' , LocalDate.of(1989 , 11 , 1) , "A1" , "Alumni Dev" , 28);

        System.out.println(student1);

        student1.eat();
        student1.drink();
        student1.sleep();
        student1.breath();

    }
}
