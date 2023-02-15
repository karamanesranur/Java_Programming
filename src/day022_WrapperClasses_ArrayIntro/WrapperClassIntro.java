package Java_Programming_Muhtar.day022_WrapperClasses_ArrayIntro;

import java.lang.String;

public class WrapperClassIntro {

    public static void main(String[] args) {

        String str = "Java";

        int a = 10;
       Integer a2 = 10;

        System.out.println("--------------------------------------------------------------");

        int b1 = 100;

        Integer b2 = b1; //auto boxing

       char ch = 'A';
       Character ch2 = ch; // Autoboxing

        double db = 5.5;
        Double db1 =db; // autoboxing

        System.out.println("--------------------------------------------------------------");

        Integer n1 = 20;
        int n2 = n1; // unboxing
        long n3 = n1;// unboxing

    }
}
