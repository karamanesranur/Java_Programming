package Java_Programming_Muhtar.day006_IfStatements;

public class SingleIfStatement {
    public static void main(String[] args) {

        int number = 155;

        boolean isEven = number % 2 == 0 ;
       // boolean isOdd = number % 2 != 0 ; = !isEven

        if(isEven){
            System.out.println("Even number");
        }

        if(!isEven){
            System.out.println("Odd number");
        }

        System.out.println("---------------------------------------------");

        if(number % 2 == 0){

            System.out.println("Even Number");
        }


        if(number % 2 != 0) {

            System.out.println("Odd number");
        }

    }
}
