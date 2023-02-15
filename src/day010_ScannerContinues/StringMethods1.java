package Java_Programming_Muhtar.day010_ScannerContinues;

public class StringMethods1 {
    public static void main(String[] args) {

        String str = "Cydeo";
        //index :01234

        char firstChar = str.charAt(0);
        char secondChar =str.charAt(1);
        char thirdChar =str.charAt(2);
        char fourChar = str.charAt(3);
        char fiveChar = str.charAt(4);


        System.out.println("firstChar = " + firstChar);
        System.out.println("secondChar = " + secondChar);
        System.out.println("thirdChar = " + thirdChar);
        System.out.println("fourChar = " + fourChar);
        System.out.println("fiveChar = " + fiveChar);


        System.out.println("---------------------------------------------------------");

        String sentence = "Java Programming Language";

       int length = sentence.length();
        System.out.println(length);

        int lastIndex = length - 1;

        System.out.println(lastIndex);

        System.out.println("----------------------------------------------------------------");

        String s1 ="Java is the best programing language";
        char f =s1.charAt(0);

        int lastIndexNum = s1.length()-1;

        char l = s1.charAt(lastIndexNum);

        System.out.println(f +" : " + l);

    }
}
