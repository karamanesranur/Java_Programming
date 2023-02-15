package Java_Programming_Muhtar.day012_CustomMethods;

public class CustomMethodWithParameter {
    public static void main(String[] args) {

        oddOrEven(100);




    }
    public static void oddOrEven(int number){

        if (number%2== 0){
            System.out.println(number + " is even number");
        }else {
            System.out.println(number + " is odd number");
        }


    }
}
