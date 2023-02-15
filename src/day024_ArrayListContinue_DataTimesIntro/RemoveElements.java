package Java_Programming_Muhtar.day024_ArrayListContinue_DataTimesIntro;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElements {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(); //0 ~ 9
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 4) {
                list.remove(i);
            }
        }


        System.out.println(list);

        System.out.println("-------------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));
        System.out.println(list2);

        list2.removeIf(p -> p < 4);

        System.out.println(list2);


        System.out.println("---------------------------------------------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java" , "Python" , "C#" , "Java" , "Ruby" , "Java Script" , "C++"));

        names.removeIf(each -> each.startsWith("J"));

        System.out.println(names);





    }
}
