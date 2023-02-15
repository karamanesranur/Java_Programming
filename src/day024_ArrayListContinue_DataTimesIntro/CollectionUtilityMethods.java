package Java_Programming_Muhtar.day024_ArrayListContinue_DataTimesIntro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtilityMethods {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java" , "Java" , "Java" , "C#" ,"C#" , "Rubby" , "Swift" , "Swift" , "Java" ));

        System.out.println(names);
         /*


        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equals("Java")){
                names.set(i , "Python");
            }
        }

        System.out.println(names);*/

        Collections.replaceAll(names,"Java", "Python");
        System.out.println(names);


        System.out.println("---------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30,40,40,50,50,50,50,50,60,60,50));

      int countJava =  Collections.frequency(list,50);






    }
}
