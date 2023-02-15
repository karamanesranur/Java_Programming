package Java_Programming_Muhtar.day019_Array;

public class MinNumber {
    public static void main(String[] args) {



        int[] numbers = {100 , 20 , 500,40,-10};

        int min = numbers[0]; //500 // assume that first element is the maximum number

        for (int i = numbers.length - 1; i >= 0; i--) { // i: 1,2,3,4,5

            if (numbers[i]> min){ // compares the element of the array with current maximum  number

               min=numbers[i];//replace the current maximum number
            }
        }

        System.out.println("max = " + min);

    }
}
