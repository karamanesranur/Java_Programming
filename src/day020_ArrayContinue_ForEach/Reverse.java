package Java_Programming_Muhtar.day020_ArrayContinue_ForEach;

import utilities.ArrayUtility;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

       int[] array = {1,2,3,4,5 ,11,6,7,8,9,10};

        int[] reverse = new int[array.length];//{5,4,3,2,1}

        for (int i = array.length - 1 , j = 0 ; i >= 0; i-- , j++) {
         reverse[j++]=array[i] ;
        }

        System.out.println(Arrays.toString(reverse));

        System.out.println("----------------------------------------------");

        int[] nums = {100,200,300,400,500};
       nums =  ArrayUtility.reverse(nums);

        System.out.println(Arrays.toString(nums));
    }
}
