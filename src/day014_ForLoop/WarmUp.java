package Java_Programming_Muhtar.day014_ForLoop;

import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {


        for (int i = 0; i < 8; i++) {
            System.out.println("* * * * * *");
        }

        System.out.println("-----------------------------------------");
        
        /*
         Write a method which prints out the numbers from 1 to 100 but for 
         numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number, 
          for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers 
          which are a multiple of 5, print "RA" instead of the number. 
     ex: 
        output:
            1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN 
*/

        String result = "";

        for (int i = 0; i < 101; i++) {

            if (i % 15 == 0) {
                result += "FINRA ";
            } else if (i % 5 == 0) {
                result += "RA ";
            } else if (i % 3 == 0) {
                result += "FIN ";
            } else {
                result += i + " ";
            }

        }
        System.out.println(result);

        System.out.println("--------------------------------------------------");

        /*
         write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275

         */

        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
       /* int num = scan.nextInt();

        if(num < 0){
            System.out.println("Invalid Number");
        }else{
            int sum = 0;
            for (int i = 0; i <= num; i++) {
                sum += i;
            }

            System.out.println(sum);
        }
*/
        /*
        Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )


         */


        System.out.println("Enter a number");
        int num1 = scan.nextInt();
        int result1 =scan.nextInt();


        for (int i = num1; i >= 1 ; i--) {
         //Faktoriyelden bir halt anlamadim tekrar bakilacak !!!!
        }
    }
}
