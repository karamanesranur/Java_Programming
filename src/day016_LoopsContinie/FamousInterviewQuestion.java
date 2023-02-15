package Java_Programming_Muhtar.day016_LoopsContinie;

public class FamousInterviewQuestion {
    public static void main(String[] args) {

        String str = "aabbbccccccccccccccccccc";
        char ch = 'c';

        int count = 0;

        for (int i = 0; i < str.length(); i++) {// i :index numbers of str

            if (str.charAt(i) == ch){ // if the character of the string is equal to the given character has appeared in the String
                count++;
            }

        }

        System.out.println(count);



    }
}
