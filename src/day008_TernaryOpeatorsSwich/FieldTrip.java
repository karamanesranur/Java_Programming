package Java_Programming_Muhtar.day008_TernaryOpeatorsSwich;

public class FieldTrip {
    public static void main(String[] args) {

        int grade = 5;
        String location = "Unknow";
        int numOfGrade = 0;
        String teacher = "Umknow";

        if (grade >= 1 && grade <= 6) {

            if (grade == 1) {
                location = "Apple Orchard";
                numOfGrade = 3;
                teacher = "Ms. Smith";
            } else if (grade == 2) {
                location = "Zoo";
                numOfGrade = 7;
                teacher = "Mr. Lee";
            } else if (grade == 3) {
                location = "Aquarium";
                numOfGrade = 5;
                teacher = "Ms. Wilson";
            } else if (grade == 4) {
                location = "Theater";
                numOfGrade = 2;
                teacher = "Ms. Reyes";

            } else if (grade == 5) {
                location = "Museum";
                numOfGrade = 5;
                teacher = "Ms. Lela";
            }else { // grade==6
                location = "Six Flags";
                numOfGrade = 8;
                teacher = "Ms. Watt";
            }

            System.out.println("Local - " + location);
            System.out.println("Number of groups - "+numOfGrade);
            System.out.println("Teacher in charge - " + teacher);
        }

    }
}