package Java_Programming_Muhtar.day015_WhileDoWhileLoop;

public class RemoveDublicates3 {
    public static void main(String[] args) {


        String str = "XXXYYYZZ";
       String result = ""; //"XYZ"

        for (int i = 0; i < str.length(); i++) {

            if (result.contains("" + str.charAt(i))) {
                continue; // skip
            }
            result +=str.charAt(i);

        }

        System.out.println(result);
    }
}
