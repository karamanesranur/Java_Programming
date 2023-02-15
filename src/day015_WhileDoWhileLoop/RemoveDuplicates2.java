package Java_Programming_Muhtar.day015_WhileDoWhileLoop;

public class RemoveDuplicates2 {
    public static void main(String[] args) {

        String str = "xyzxyzxyzxyz";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (result.contains("" + str.charAt(i))){ //  if the character is already contained in new string
                continue; // skip it
            }

            result += str.charAt(i);

        }
        System.out.println(result);


        System.out.println("------------------------------------------------------------");

        //find the sum of all the even number between  50~100

        for (int i = 50; i < 101; i++) {
            if (i % 2 == 0){
                System.out.print(i + " ");
            }

        }

        System.out.println();


        //50,52,54,56....100
        for (int i = 50; i <101 ; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 50; i < 101; i++){

            if (i%2 != 0 ){

                continue;

            }
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
