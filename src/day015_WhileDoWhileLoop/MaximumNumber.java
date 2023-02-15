package Java_Programming_Muhtar.day015_WhileDoWhileLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);


        int max = -546546545;//10



        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int num =input.nextInt();  // 10 , 5 , 3 , 20 , 15

            if (num > max){
                max = num;
            }
        }

        System.out.println("max = " + max);
    }
}
