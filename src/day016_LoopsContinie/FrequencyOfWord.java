package Java_Programming_Muhtar.day016_LoopsContinie;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String sentence = "Java Java Java Java";
        String word = "Java";


        sentence =word.toLowerCase();
        word     =word.toLowerCase();


        int count = 0;

        while(sentence.contains(word)){
            count++ ;

           sentence =  sentence.replaceFirst(word, ""); //"Java Java Java"

        }

        System.out.println(count);
/*
           "Java Java Java Java";count:0;
           "Java Java Java";count :1
          " Java Java";count :2
            "Java";count :3
           " ";count : 4

 */
    }
}
