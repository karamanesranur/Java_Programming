package Java_Programming_Muhtar.day008_TernaryOpeatorsSwich;

public class SwitchIntro {
    public static void main(String[] args) {

        char grade = 'S';
        String result = "";


        switch (grade) {

            case 'A':
                result = "Excellent";
                break;
            case 'B':
                result = "Great Job";
                break;
            case 'C':
                result = "Good";
                break;
            case 'D':
                result = "Passed";
                break;
            case 'E':
                result ="Failed";
                break;

            default:
               result= "Invalid";
        }
        System.out.println("result = " + result);

    }
}
