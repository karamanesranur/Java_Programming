package Java_Programming_Muhtar.day006_IfStatements;

public class OddOrEven {
    public static void main(String[] args) {

        int number = 100 ;
        boolean isEven = number % 2 ==0;
        // When we divide a number by 2 , if the remainder is 0 ,mean the number is even
      // boolean isOdd = number % 2 != 0;
       //When we divide a number by 2 , if the remainder is NOT 0 ,mean the number is Odd

        boolean isOdd = !isEven ;
        //If the number is not even , then It's odd.


        System.out.println(number + " is an even number: " + isEven);
        System.out.println(number + " is an odd number: " + isOdd);








    }






}
