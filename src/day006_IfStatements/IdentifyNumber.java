package Java_Programming_Muhtar.day006_IfStatements;

public class IdentifyNumber {
    public static void main(String[] args) {
        int number = -200 ;
        boolean positiveNumber = number > 0;
        boolean negativeNumber =number < 0;
      //  boolean isZero = number == 0;

        boolean isZero = !positiveNumber && !negativeNumber;

        System.out.println(number + " is positive number: " + positiveNumber);
        System.out.println(number + " is negative number: " + negativeNumber);
        System.out.println(number + " is zero number: " + isZero);








    }
}
