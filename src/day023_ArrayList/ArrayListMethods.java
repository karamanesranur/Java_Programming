package Java_Programming_Muhtar.day023_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,};

        array[0] = 100;

        System.out.println(Arrays.toString(array));


        System.out.println("-------------------------------------------------------------");

        ArrayList<String> groceriesList = new ArrayList<>();

        groceriesList.add("Egg");
        groceriesList.add("Paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking Oil");

        System.out.println(groceriesList);

     //   groceriesList[2] = "Oranges";

        groceriesList.set(2,"Oranges");

        System.out.println(groceriesList);

        groceriesList.set(2,"Chicken");
        System.out.println(groceriesList);

        groceriesList.remove("Paper Towels");
        System.out.println(groceriesList);

        System.out.println("-----------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10); //0
        numbers.add(20); //1
        numbers.add(30);//2
        numbers.add(40);//3
        numbers.add(50);//4

        numbers.remove(Integer.valueOf(20));

        System.out.println(numbers);

        System.out.println("-----------------------------------------------------");

        ArrayList<String> names = new ArrayList<>();

        names.add("Vasyl"); //0
        names.add("Vasyl");//1
        names.add("Dimitri");//2
        names.add("Dimitri");//3
        names.add("Olga");//4
        names.add("Dimitri");//5

        System.out.println(names.indexOf("Vasyl"));
        System.out.println(names.lastIndexOf("Vasyl"));
        System.out.println(names.lastIndexOf("Dimitri"));






    }
}
