package Java_Programming_Muhtar.day013_CustomMethodsIntro;

public class isOdd {
    public static void main(String[] args) {

        System.out.println(isOdd(100));
        System.out.println(isEven(100));

        System.out.println("---------------------------------");

        System.out.println(max(100,200));
        System.out.println(min(100,200));

        System.out.println("---------------------------------");

        System.out.println(combine("one" , "eight"));

        System.out.println("---------------------------------");


        String sentence= "Java java JaVa python python";
        String world = "java";
        System.out.println(frequencyOfWord(sentence,world));

        System.out.println("---------------------------------");



        System.out.println(title("jAvA"));


    }
    /*
    Create a method named isOdd,
     that can return true if a number is an odd number, otherwise returns false
     */

    public static boolean isOdd(int number){

        if (number % 2 != 0){
          return true ;
        }else {
            return false;
        }
    }

    public static boolean isEven(int number){
        return !isOdd(number);
    }

    /*
     Create a method named max, that can return the maximum number between two numbers
     */

    public static int max (int n1 , int n2){
        if (n1 >= n2){
            return n1;
        }else {
            return n2;
        }
    }

    public static int min(int n1 , int n2){
        if (n1 <= n2){
            return n1;
        }else {
            return n2;
        }
    }

    /*
    Create a method named combine that can take two string and hen add them together and returns it.
        But if the last letter of the first word and the first letter of the
        last letter are the same, return that character once.
    Ex:
        combine("one", "eight")  ==> oneight
     */

    public static String combine (String word1 , String word2){

        String result = word1 +word2;

        if (word1.charAt(word1.length()-1) == word2.charAt(0)){
            result =word1+ word2.substring(1);
        }
        return result;
    }

    /*
     Create a method named frequencyOfWord that takes two arguments:
            1. sentence (String)
            2. word (String)

    The method should return the frequency of the word from the sentence

        Ex:
            frequencyOfWord("Java java jAvA", "java")  ==> 4
 */

    public static int frequencyOfWord(String sentence , String word){

        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        String temp = sentence.replace(word, "a".repeat(word.length()-1) );

        int frequency = sentence.length() - temp.length();
        return frequency;


    }

    /*
     Create a method named title that takes a string arguments

    The method returns the proper capitalized version of the given argument

    Ex:
        title("jAvA") ===> Java

*/

    public static String title(String word){

        String result = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
        return result;

    }
}
