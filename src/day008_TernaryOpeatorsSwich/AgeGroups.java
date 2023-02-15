package Java_Programming_Muhtar.day008_TernaryOpeatorsSwich;

public class AgeGroups {
    public static void main(String[] args) {
        /*
        reate a class called AgeGroups
		write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)

        Note: MUST use ternary

         */


        int num = 85;
        String result = (num == 1 && num == 2) ? "Infant" :
                (num >= 3 && num <= 5) ? "Toddler" :
                (num >= 6 && num <= 9) ? "Kid" :
                (num >= 10 && num <= 12) ? "Pre-Teen" :
                (num >= 13 && num <= 17) ? "Teenager" :
                (num >= 18 && num <= 20) ? "Young Adult" :
                (num >= 21 && num <= 39) ? "Adult" :
                (num >= 40 && num <= 49) ? "Young Middle-Aged Adult" :
                (num >= 50 && num <= 54) ? "Middle-Aged Adult" :
                (num >= 55 && num <= 64) ? "Very Young Senior Citizen" :
                (num >= 65 && num <= 74) ? "Young Senior Citizen " :
                (num >= 75 && num <= 84) ? " Senior Citizen " :
                        " Old Senior Citizen" ;

        System.out.println("result = " + result);


    }
}
