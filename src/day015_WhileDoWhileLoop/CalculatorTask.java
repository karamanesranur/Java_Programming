package Java_Programming_Muhtar.day015_WhileDoWhileLoop;

import java.util.Scanner;

public class CalculatorTask {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number:");
        double num1 = input.nextDouble();

        System.out.println("Enter your second number:");
        double num2 = input.nextDouble();

        System.out.println("Enter your math operators:");
        char mathOperators = input.next().charAt(0);

        while (!(mathOperators == '+' || mathOperators == '-' || mathOperators == '*' || mathOperators == '/')) {
// while the operator is invalid.
            System.err.println("Invalid Operator! Please re-enter the math operator");
            mathOperators = input.next().charAt(0);


        }


        if (mathOperators == '+') {
            System.out.println(num1 + num2);
        } else if (mathOperators == '-') {
            System.out.println(num1 - num2);
        } else if (mathOperators == '*') {
            System.out.println(num1 * num2);
        } else {
            System.out.println(num1 / num2);
        }


    }
}
