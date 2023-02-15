package Java_Programming_Muhtar.day008_TernaryOpeatorsSwich;

public class BiggerNumber {
    public static void main(String[] args) {
        /*
        Create a class called BiggerNum,
        write a program that checks for the bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY

         */
        int a = 5;
        int b = 85 ;
        int c = 9;
        String result = (a > b && a >c)?"a is bigger":
                (b >a && b >c )? "b is bigger":
                        (c >a && c >b)?"c is bigger":"Invalid";
        System.out.println("result = " + result);




    }
}
