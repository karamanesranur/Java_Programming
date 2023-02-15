package Java_Programming_Muhtar.day042_MapsContinue;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods2 {
    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();

        map.put("C02", "Josh");
        map.put("B02", "Nora");
        map.put("A02", "Keri");
        map.put("D02", "Anna");
        map.put("E02", "Rosemarry");
        map.put("F02", "Tatianna");


        Map<String , String> employees = new LinkedHashMap<>();
        employees.putAll(map);

        System.out.println(employees);

        System.out.println(employees == map); //false

        System.out.println(map.equals(employees)); //true





    }}
