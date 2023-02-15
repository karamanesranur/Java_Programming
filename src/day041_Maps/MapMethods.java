package Java_Programming_Muhtar.day041_Maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();

        map.put("CO2", "Josh");
        map.put("BO2", "Nora");
        map.put("AO2", "Keri");
        map.put("DO2", "Anna");
        map.put("EO2", "Rosemarry");
        map.put("FO2", "Tatianna");
        map.put("FO2", "Tatianna");
        map.put("FO2", "Tatianna");
        map.put("FO2", "Tatianna");
        map.put("FO2", "Tatianna");

        System.out.println(map.size());
        System.out.println(map);

        System.out.println(map.get("FO2"));

        map.put("A04" , "Lucy");
        map.put("A06" , "Madiyar");

        System.out.println(map);

        System.out.println(map.get("A05"));

        System.out.println(map);

        System.out.println(map.containsKey("B03"));
        System.out.println(map.containsValue("H03"));
        System.out.println(map.containsValue("Lucy"));


    }


}

   /*
   pair: id-name
    */


