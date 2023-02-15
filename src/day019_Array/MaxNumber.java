package Java_Programming_Muhtar.day019_Array;

public class MaxNumber {
    public static void main(String[] args) {



        int[] numbers = {100 , 20 , 500,40,-10,30};

        int max = numbers[0]; //500 // assume that first element is the maximum number

        for (int i = numbers.length - 1; i >= 0; i++) { // i: 1,2,3,4,5

            if (numbers[i] > max){ // compares the element of the array with current maximum  number

                max=numbers[i];//replace the current maximum number
            }
        }

        System.out.println("max = " + max);
   
    }
}
