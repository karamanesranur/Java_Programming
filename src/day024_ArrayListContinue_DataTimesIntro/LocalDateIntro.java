package Java_Programming_Muhtar.day024_ArrayListContinue_DataTimesIntro;

import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println(today);


        LocalDate birthDay = LocalDate.of(2000,5,25);

        System.out.println(birthDay);


        System.out.println("------------------------------------------------------------");

        System.out.println(today.getYear());

        System.out.println(today.getMonth());

        System.out.println(today.getMonthValue());

        System.out.println(today.getDayOfWeek());

        System.out.println(birthDay.getDayOfWeek());

        System.out.println(today.getDayOfMonth());

        System.out.println(today.getDayOfYear());


        System.out.println("------------------------------------------------------------");

        today = today.plusYears(1);

        System.out.println(today);

        System.out.println("------------------------------------------------------------");

        LocalDate graduationDate = LocalDate.of(2025,6,4) ;

        graduationDate.plusYears(2);// 2027-6-4

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusMonths(7);

        System.out.println(graduationDate);


       graduationDate =  graduationDate.plusDays(100);

        System.out.println(graduationDate);

        System.out.println("------------------------------------------------------------");

        LocalDate yourBirthday = LocalDate.of(2005,4,1);

        LocalDate  yourBrotherBirthday = yourBirthday.minusYears(2).minusMonths(3);

        System.out.println(yourBirthday);
        System.out.println(yourBrotherBirthday);

        System.out.println("------------------------------------------------------------");

        LocalDate birthday1 = LocalDate.of(1994,7,7);
        LocalDate birthday2 = LocalDate.of(1995,6,7);






    }
}
