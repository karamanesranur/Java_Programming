package Java_Programming_Muhtar.day009_Scanner;


import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;//ENTER+ENTER


        System.out.println("Enter your full name : ");
        String full_name = input.nextLine();//Daniel+enter

        System.out.println("Enter your school name:");
        String school_name = input.nextLine();//Cydeo+enter

        System.out.println("Enter your gender: ");
        String gender = input.nextLine();//Male+enter

        System.out.println("Enter your age: ");
        int age = input.nextInt();//28+enter

        input.nextLine();// Clear out the scanner
        //we have to give extra nextLine() method if we are using a nextLine() method after the other
       // methods of scanner

        System.out.println("Enter your street name: ");
        String street = input.nextLine();






    }
}
