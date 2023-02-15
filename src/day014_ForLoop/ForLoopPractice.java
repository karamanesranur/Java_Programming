package Java_Programming_Muhtar.day014_ForLoop;

public class ForLoopPractice {
    public static void main(String[] args) {

        for (int i = 10 ; i >= 5; i--){ // i : 10 , 9 , 8 ,7 ,6 ,5 ,4
            System.out.println("Hello Cydeo" + i); // 1, 2 , 3 ,4 ,5 ,6


        }

      //  System.out.println("Hello Wold");


        System.out.println("--------------------------------------------");

        // sum of all the numbers 1~100

        int sum = 0;

        for (int i =1 ; i <= 100; i++){
            sum += i;
        }

        System.out.println(sum);




        // print all the alphabet letter A~Z

        for (char i = 'A'; i <= 'Z'; i++){
            System.out.print(i +" ");

        }
        System.out.println();


        System.out.println("---------------------------------------------------------------");

        // print all the alphabet letters in backwards Z~A

        for (char i = 'Z'; i >= 'A' ; i--){
            System.out.print(i + " ");

        }


    }
}
