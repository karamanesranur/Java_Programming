package Java_Programming_Muhtar.day020_ArrayContinue_ForEach;

import java.util.Arrays;

public class ArrayUtilityMethods {
    public static void main(String[] args) {

        int[] score = {70, 100, 80, 90, 65};

        System.out.println(Arrays.toString(score));

        String result = Arrays.toString(score);

        System.out.println(result);

        System.out.println("------------------------------------------");

        int[] a1 = {1, 2 , 3 , 4 , 5};
        int[] a2 = {1, 2 , 3 , 4 , 5};

       boolean r1 =  Arrays.equals(a1 , a2);

        System.out.println(r1);


        char[] ch1 = {'A' , 'B' , 'C'};
        char[] ch2 = {'A' , 'C' , 'B'};

       boolean r2 =  Arrays.equals(ch1,ch2);

        System.out.println(r2);

        String[] s1 = {"A", "B" ,"C"};
        String[] s2 = {"A", "C" ,"B"};

        System.out.println(Arrays.equals(s1 , s2));

        System.out.println("------------------------------------------------------");

        int[] nums = {100,60,50 ,88,55,45,24,20,54};

        System.out.println(Arrays.toString(nums));


        Arrays.sort(nums);


        System.out.println(Arrays.toString(nums));
        System.out.println("Minimum number: " + nums[0]);
        System.out.println("Maximum number: " + nums[nums.length-1]);






    }
}
