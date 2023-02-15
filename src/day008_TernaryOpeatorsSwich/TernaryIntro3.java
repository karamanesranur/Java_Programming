package Java_Programming_Muhtar.day008_TernaryOpeatorsSwich;

public class TernaryIntro3 {
    public static void main(String[] args) {

        int score = 135;


      /*
        String result = "";



        if (score >=0 && score<=100) {


            if (score >= 60) {
                result = "Passed";
            } else {
                result = "Failed";
            }
        }else {
            result = "Invalid";
        }
        System.out.println(result);

    */

String result = (score >=0 && score<=100)?

        (score >= 60)? "Passed" : "Failed"

        : "Invalid" ;
        System.out.println(result);





    }
}
