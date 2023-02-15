package Java_Programming_Muhtar.day041_Maps;

import java.util.*;

public class MapIntro {
    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>(); // random order, accept null key
        hashMap.put("Daniel" , 95000);
        hashMap.put("Emily" , 100000);
        hashMap.put("Bella" , 85000);
        hashMap.put("Arron" , 78000);

        System.out.println("hashMap = " + hashMap);

        Map<String, Integer> map2 = new LinkedHashMap<>(); // insertion order, accept null key and null values
        map2.put("Daniel" , 95000);
        map2.put("Emily" , 100000);
        map2.put("Bella" , 85000);

        System.out.println(map2);



        Map<String, Integer> map3 = new TreeMap<>(); // sorted order , does not accept null key , accepts null values
        map3.put("Daniel" , 95000);
        map3.put("Emily" , 100000);
        map3.put("Bella" , 85000);

        System.out.println(map3);

        Map<String, Integer> map4 = new Hashtable<>(); //random order, does not accept null key and null value, Synchronized



        /*
        pair: name & salary
        Daniel = 95000
        Emily  = 100000
        Bella  = 85000






         */



    }
}
