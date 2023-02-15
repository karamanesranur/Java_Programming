package Java_Programming_Muhtar.day011_String;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        String correctUsername = "Cydeo",//literal
                correctPassword = "WoodenSpoon";//literal

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username");
        String username = input.nextLine(); //new keyword

        System.out.println("Enter your Password");
        String password = input.nextLine();

        input.close();

        if (username.equals(correctUsername) && password.equals(correctUsername)){
            System.out.println("You are now logged in");
        }else {
            System.err.println("Incorrect username or password.Please try again.");
        }



    }
}
