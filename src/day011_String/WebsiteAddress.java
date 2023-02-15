package Java_Programming_Muhtar.day011_String;

import java.util.Scanner;

public class WebsiteAddress {
    public static void main(String[] args) {
        String url = "www.amazon.com";

        boolean isValid = url.startsWith("www.") &&
                (url.endsWith(".com") || url.endsWith(".edu") || url.endsWith(".gov"));

        if (isValid) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

        System.out.println("---------------------------------------------------------");

        String str = "xcodeX";

        str = str.replace('x', 'a').replace('X', 'a');

        System.out.println(str);

        System.out.println("----------------------------");

        /*
4. Create a class named ReallyNeverMind. Ask the user to enter a word.
if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
 */

        Scanner input =new Scanner(System.in);
        System.out.println("Enter a world: ");

        String word =input.next();
        String lastTwo = word.substring(word.length()-2);

if (lastTwo.equals("Iy")){
    System.out.println("really???");
}else {
    System.out.println("never mind " );
}
input.close();

        System.out.println("----------------------------------------------------------");


/*
Create a class named WithoutFirstChar. Ask user to enter two words.
Print first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana
 */










    }
}
