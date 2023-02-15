package Java_Programming_Muhtar.day006_IfStatements;

public class Cigarettes {
    public static void main(String[] args) {

        int age = 30;



        if (age >= 21 && age<100 ){
            System.out.println("You are eligible to buy cigarettes");

        }

        if ( age < 21 || age > 100 ) {

            System.out.println("You are not eligible to buy cigarettes");
        }


    }
}
