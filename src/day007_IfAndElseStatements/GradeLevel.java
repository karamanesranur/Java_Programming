package Java_Programming_Muhtar.day007_IfAndElseStatements;

public class GradeLevel {
    public static void main(String[] args) {

        int gradeLevel = 6 ; // 1~18
        String result = "";

        if (gradeLevel <= 5 ) {
            result = "Elementary School";
        } else if (gradeLevel <= 8) {
            result = "Middle School";
        } else if (gradeLevel <= 12) {
            result ="High School";
        } else if (gradeLevel <= 16) {
            result = "College";
        } else {
            result = "Grad Level";
        }
        System.out.println(result);
        }


    }

