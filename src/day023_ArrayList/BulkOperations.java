package Java_Programming_Muhtar.day023_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer>numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer>list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.addAll(1,numbers);

        System.out.println(list1);

        System.out.println("-----------------------------------------------------");


        ArrayList<Integer>scores = new ArrayList<>();

        scores.addAll(Arrays.asList(75,85,95,70,80));

        System.out.println(scores);

        System.out.println("-----------------------------------------------------");


        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList ("Esra", "Ayse","Fatma","Hayriye") );

        System.out.println(students);

        students.addAll(2,Arrays.asList("Shukur" , "Sumeyye" , "Tati"));

        System.out.println(students);


        System.out.println("-------------------------------------------------------------");


        Integer[] nums = {1,2,3,4,5,6,7,8,};

        ArrayList<Integer> l1 = new ArrayList<>();

       // l1.addAll(Arrays.asList(nums));

        System.out.println(l1);











    }
}
