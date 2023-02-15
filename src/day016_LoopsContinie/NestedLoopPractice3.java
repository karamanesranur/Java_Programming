package Java_Programming_Muhtar.day016_LoopsContinie;

public class NestedLoopPractice3 {

    public static void main(String[] args) {

        String s = "abcabbbbbbbbbbbcabcabc";

        String result = "";

        for (int j = 0; j < s.length(); j++) {

            char c =s.charAt(j);
            int f = 0;

            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) == s.charAt(j)  ){
                    f++;
                }
            }
if (result.contains("" + c)){
    continue;
}

            result += c + "" + f ;
        }

        System.out.println(result);

































    }
}
