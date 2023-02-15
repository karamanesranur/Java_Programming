package Java_Programming_Muhtar.day024_ArrayListContinue_DataTimesIntro;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aaabbbbcccccc";

            String result = "";//a3b4c5

        for (String each : str.split("")) {

         int frequency =    Collections.frequency(Arrays.asList(str.split("")) , each);

         if (!result.contains(each)){
             result += each + frequency;
         }


        }

        System.out.println(result);




    }
}
