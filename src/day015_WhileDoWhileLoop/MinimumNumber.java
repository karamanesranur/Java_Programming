package Java_Programming_Muhtar.day015_WhileDoWhileLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
int minimumNumber = 564654454;

        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter your number" );
            int num = input.nextInt();
            if (num < minimumNumber){ // if the user entered entry is less than
                minimumNumber = num; // then user entered number should be the minimum number


            }

        }

        System.out.println("minimumNumber = " + minimumNumber);

        input.close();
    }
}
