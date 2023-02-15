package Java_Programming_Muhtar.day019_Array;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {


        String[] arr1 = {"A" , "B","C" , "D"};
        String[] arr2 = {"E" , "F","G" };

        String[] arr3 = new String[arr1.length + arr2.length];

        int k = 0; // for indexes of third array
/*
        for (int i = 0; i <arr1.length ; i++ ,k++ ) { // i : for indexes of first array
            arr3[k]=arr1[i]; // elements of first array beign assigned to the indexes of third array
        }

        for (int j = 0; j <arr2.length ; j++ ,k++ ) { // i : indexes of second array
            arr3[k]=arr2[j]; //elements of second array beign assigned
        }
*/
        for ( String each : arr1) {// each : elements of first array
            arr3[k++] = each; // each element of first array beign assigned to each index of third
        }

        for ( String each : arr2) {// each : elements of first array
            arr3[k++] = each; // each element of first array beign assigned to each index of third
        }

        System.out.println(Arrays.toString(arr3));

    }
}
