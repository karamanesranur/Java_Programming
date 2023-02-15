package Java_Programming_Muhtar.day022_WrapperClasses_ArrayIntro;

public class MaxMinNumbersOfMultiDimensionalArray {
    public static void main(String[] args) {

        // index of elements: 0    1  2    0  1   2        0   1   2
        int[][] array = {{100, 20, 30}, {10, 1000, 50}, {-200, 400, 0}}; // indexes of array : 0~ 2
        // index of 1D array: 0            1               2


        int max = array[0][0];
        int min = array[0][0];

        for (int[] each1D : array) {
            for (int eachElements : each1D) {

                if (eachElements > max) {
                    max = eachElements;
                }
                if (eachElements < min ) {
                    min = eachElements;
                }

            }


        }
        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);

    }


}
