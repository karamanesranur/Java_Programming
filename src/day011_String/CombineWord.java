package Java_Programming_Muhtar.day011_String;

import java.util.Scanner;

public class CombineWord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first word");
        String word1 = scan.next();

        System.out.println("Enter your second word");
        String word2 = scan.next();

        String result = "";

        if (word1.charAt(word1.length() - 1) == word2.charAt(0)) {
            result = word1 + word2.substring(1);

        }else {
            result = word1+word2;
        }
        System.out.println(result);



        /*
        Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
     print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight


         */


        System.out.println("----------------------------------------------------------------");

    /*
    Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School */


        System.out.println("Enter the first name");
    String firstName = scan.next().toLowerCase();

    firstName =(""+ firstName.charAt(0)).toUpperCase() + firstName.substring(1);

        System.out.println("Enter the second name");
        String secondName = scan.next().toLowerCase();
secondName= (""+secondName.charAt(0)).toUpperCase() + secondName.substring(1);

        System.out.println(firstName + " " + secondName);











    }
}
