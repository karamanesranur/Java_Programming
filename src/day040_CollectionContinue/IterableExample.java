package Java_Programming_Muhtar.day040_CollectionContinue;

import java.util.*;

public class IterableExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        /*
        for (Integer each : list) {
            if(each < 5){
                list.remove(each);
            }
        }
      */


        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 5) {
                list.remove(i);
            }
        }

        System.out.println(list);


        System.out.println("-----------------------------------------------------");
    }
}