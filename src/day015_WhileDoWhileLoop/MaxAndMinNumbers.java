package Java_Programming_Muhtar.day015_WhileDoWhileLoop;

import java.util.Scanner;

public class MaxAndMinNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int max = -2132546874; // Any integer number that user enter will always be greater than -2132546874
        int min = 545475878;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int num = input.nextInt();

            if ( num > max){
                max = num;
            }

            if ( num < min){
                min = num ;
            }
        }
        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);
    }
}
