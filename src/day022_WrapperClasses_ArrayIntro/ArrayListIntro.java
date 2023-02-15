package Java_Programming_Muhtar.day022_WrapperClasses_ArrayIntro;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {

        int[] array = new int[5];// {0,0,0,0,0}

        array[0] = 10;
        array[1] = 20;

        System.out.println(Arrays.toString(array));

        System.out.println("----------------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(list);

        System.out.println(list.size());

    }
}
