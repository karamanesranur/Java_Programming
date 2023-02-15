package Java_Programming_Muhtar.day008_TernaryOpeatorsSwich;

public class OxygenTank {
    public static void main(String[] args) {
        /*
        Create a class called OxygenTank. You are diving in the ocean.
         Your oxygen tank has a certain level (number) and
         you must print a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at  50%

                USE ONE PRINT STATEMENT ONLY

            Solution 1: Must use ternary
         */

        int o2Tank = 45;
        String result = "";
        result =(o2Tank >= 90 )?"Your tank is full":
                (o2Tank <90 && o2Tank >=80 )?"Still okay":
                (o2Tank <80 && o2Tank >=70 )?"Don't go too far":
                (o2Tank <70 && o2Tank >=60 )?"Start to head back":
                        "Be careful now you at  50%";


        System.out.println("result = " + result);

        System.out.println("------------------------------------------------");








    }
}
