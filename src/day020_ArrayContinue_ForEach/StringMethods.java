package Java_Programming_Muhtar.day020_ArrayContinue_ForEach;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Cydeo School";

        char[] ch = str.replace(" " , "").toCharArray();

        System.out.println(Arrays.toString(ch));

        System.out.println("----------------------------------------------------------------------");

        String str2 = "Today is great day to learn Java";

       String[] words = str2.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println("----------------------------------------------------------------------");

        String sentence = "I love Java";

        sentence.split(" "); // [ I ,love ,Java ]

        //" Java love I"
    }
}
