package Java_Programming_Muhtar.day006_IfStatements;

public class NumberOfDays {
    public static void main(String[] args) {


        int n = 10;

        boolean has28Days = n == 2; // if the months number is 2 (Feb) , then it has 28 Days
        boolean has30Days = n == 4 || n == 6 || n == 9 || n == 11 ;
        boolean has31Days = !has30Days && !has28Days ;
        // if the months does not have 28 days and also does not have 30 days , then the month has 3 days

        if(has28Days){
            System.out.println("28 days");
        }
        if(has30Days){
            System.out.println("30 days");
        }


        if(has31Days){
            System.out.println("31 days");
        }



    }
}
