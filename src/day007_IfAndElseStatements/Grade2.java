package Java_Programming_Muhtar.day007_IfAndElseStatements;

public class Grade2 {
    public static void main(String[] args) {

        char grade = 'D';
        String result = "";

        if (grade == 'A') {
            result = "Excellent";
        } else if (grade == 'B') {
            result = "Great Job";
        } else if (grade == 'C') {
            result = "Good";
        } else if (grade == 'D') {
            result = "Passed";
        } else if (grade == 'E') {
            result = "Failed";
        } else {

        }
        System.out.println(result);

    }

}

