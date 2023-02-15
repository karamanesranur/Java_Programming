package Java_Programming_Muhtar.day007_IfAndElseStatements;

public class GrandReport {
    public static void main(String[] args) {

        int score = 85; // 0 ~ 100

        String result = "Your grade is: ";
        if (score >= 90){
          result =   "Your grade is : A ";
        } else if ( score >= 80 && score < 90 ) {
            result = "Your grade is : B ";
        } else if ( score >= 70 && score < 80) {
            result = "Your grade is : C ";
        } else if ( score >= 60 && score < 70) {
            result = "Your grade is : D ";
    }  else {
            result = "Your grade is : F ";
        }
        System.out.println(result);


    }
}
