package Java_Programming_Muhtar.day016_LoopsContinie;

import java.util.Scanner;

public class CydeoLogin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username:");
        String u = input.next();

        System.out.println("Enter your password:");
        String p = input.next();

        if (u.equals("Cydeo") && p.equals("WoodenSpoon")) { // if the credential are correct
            System.out.println("Logged in");
        } else { // otherwise incorrect

            for (int i = 0; i < 3; i++) { // i : 0 , 1 ,2
                /*
                if ( i != 2){
                    System.err.println("Incorrect username or password , please re-enter");
                }else {
                    System.err.println("This is your last change , Please re-enter your username and password");
                }

              */
                System.err.println("Incorrect username or password , please re-enter");

                System.out.println("Enter your username");
               u = input.next();

                System.out.println("Enter your password");
                p=input.next();

                if (u.equals("Cydeo") && p.equals("WoodenSpoon")){ // if the user enters valid credentials
                    System.out.println("You are now logged in");
                    break; // exits the loop
                }
            }

            if (  ! ( u.equals("Cydeo") && p.equals("WoodenSpoon"))){
                System.err.println("Your account now is locked , please contact with the support team");



            }

            input.close();


        }




    }


    public static void cydeoLogIn(String username , String password){
        if (username.equals("Cydeo") && password.equals("WoodenSpoon")){
            System.out.println("Logged");
        }else {
            System.out.println("Invalid credentials");
        }

    }
}
