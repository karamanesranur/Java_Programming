package Java_Programming_Muhtar.day006_IfStatements;

public class EvenlyDivisible {
    public static void main(String[] args) {

        int number = 30;

        boolean isDivisibleBy2 = number % 2 == 0 ;
        //if the remainder of number divided bye 2 is equal to zero , then it is evenly divisible bye 2

        boolean isDivisible3 = number % 3 == 0;
        boolean isDivisibleBye5 = number % 5 ==0;

        System.out.println(number + " is divisible by 2:  " + isDivisibleBy2);
        System.out.println(number + " is divisible by 3:  " +  isDivisible3 );
        System.out.println(number + " is divisible by 5:  " +  isDivisibleBye5   );




    }
}
