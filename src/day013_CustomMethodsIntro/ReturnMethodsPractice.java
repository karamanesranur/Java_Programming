package Java_Programming_Muhtar.day013_CustomMethodsIntro;

public class ReturnMethodsPractice {
    public static void main(String[] args) {

        System.out.println(isOdd(100));

        int num = 200;

        if (isEven(num)) {
            System.out.println( num + "is even number");
        } else {
            System.out.println( num + "is odd number");
        }
        }


        public static boolean isOdd ( int num){
            return (num % 2 != 0) ? true : false;
        }

        public static boolean isEven ( int num){
            return !isOdd(num);
        }

        public static int max(int n1 , int n2){
        //return n1 > n2 ? n1 : n2;

            if (n1 > n2){
                return n1;
            }else{
                return  n2;
            }


        }
    }
