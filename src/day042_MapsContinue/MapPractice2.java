package Java_Programming_Muhtar.day042_MapsContinue;

import java.time.LocalDate;
import java.util.*;

public class MapPractice2 {
    public static void main(String[] args) {

        Map< String , Object> person1 = new LinkedHashMap<>();

        person1.put("name" , "Arthur");
        person1.put("gender" , 'M');
        person1.put("age" , 32);
        person1.put("job_title" , "Developer");
        person1.put("salary" , 100000.5);
        person1.put("hired_date" , LocalDate.of(2022,8,15));
        person1.put("married" , true);

        Map< String , Object> person2 = new LinkedHashMap<>();

        person2.put("name" , "Nora");
        person2.put("gender" , 'F');
        person2.put("age" , 28);
        person2.put("job_title" , "Tester");
        person2.put("salary" , 90000.5);
        person2.put("hired_date" , LocalDate.of(2020,7,15));
        person2.put("married" , true);

        Map< String , Object> person3 = new LinkedHashMap<>();

        Map< String , Object> person4 = new LinkedHashMap<>();

        Map< String , Object> person5 = new LinkedHashMap<>();

        List<Map<String , Object>> listOfMap = new ArrayList<>();
        listOfMap.add(person1);
        listOfMap.add(person2);

       // listOfMap.addAll(Arrays.asList(person3, person4, person5));
        System.out.println(listOfMap);

        System.out.println("-----------------------------------------------------");

        // display the names of the employee who are hired this year(2022)

        for (Map<String , Object> eachMap : listOfMap){
            for (Map.Entry < String , Object > eachEntry : eachMap.entrySet()){
                if (eachEntry.getKey().equals("hired_date")){


                    }
                }
            }
        }



    }

