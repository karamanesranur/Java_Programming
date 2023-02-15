package Java_Programming_Muhtar.day041_Maps;

import Java_Programming_Muhtar.day017_ClassAndObject.Employee;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {
        List<Integer>list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6));

        List<Integer>list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(7,8,9,10,11,12));

        List<List<Integer>>lists = new ArrayList<>();
       // lists.addAll(Arrays.asList(7,8,9,10,11,12));

        lists.add(list1);
        lists.add(list2);


        System.out.println(lists);

        //10
        System.out.println(lists.get(1).get(3));

        for ( List<Integer> eachList : lists){
            for (Integer eachElement : eachList){
                System.out.println(eachElement);
            }

        }


        System.out.println("-----------------------------------------");

        List<Set<Integer>> listOfSets = new ArrayList<>();
        listOfSets.add(new LinkedHashSet<>());
        listOfSets.add(new LinkedHashSet<>());
        listOfSets.add(new LinkedHashSet<>());
        listOfSets.add(new LinkedHashSet<>());
        listOfSets.add(new LinkedHashSet<>());

        System.out.println(listOfSets);

        //{10, 5, 20}

        listOfSets.get(0).addAll(Arrays.asList(10, 5, 20 ,5 ,20));
        listOfSets.get(1).addAll(Arrays.asList(30,15,30));
        listOfSets.get(2).addAll(Arrays.asList(300,150,40));
        listOfSets.get(3).addAll(Arrays.asList(30000,1,5));

        System.out.println(listOfSets);

        System.out.println("-----------------------------------------");

        int[] arr1 ={1,2,3,4};
        int[] arr2 = {5,6,7,8,9,10};

        List<int[]>listOfArrays = new ArrayList<>();
        listOfArrays.add(arr1);
        listOfArrays.add(arr2);

        listOfArrays.get(0)[2] = 35;
        System.out.println(Arrays.toString(listOfArrays.get(0)));

        System.out.println("-----------------------------------");











    }
}
