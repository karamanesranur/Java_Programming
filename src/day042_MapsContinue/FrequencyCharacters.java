package Java_Programming_Muhtar.day042_MapsContinue;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyCharacters {
    public static void main(String[] args) {


        String str = "bbcccaaaaa";

        Map<Character , Integer>map = new LinkedHashMap<>();

        for (String each : str.split("")) {

            int frequency = Collections.frequency(Arrays.asList( str.split("") ), each);

            map.put(each.charAt(0) , frequency);

        }

        System.out.println(map);





    }
}
