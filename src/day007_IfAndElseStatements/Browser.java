package Java_Programming_Muhtar.day007_IfAndElseStatements;

public class Browser {
    public static void main(String[] args) {
/*
        String browserName = "chrome";
        String result = "";

        if (browserName == "chrome" || browserName == "firefox" ||
                browserName == "opera"
                || browserName == "safari" || browserName == "edge") {
            if (browserName == "chrome") {
                result = "Chrome";
            } else if (browserName == "firefox") {
                result = "Firefox";
            } else if (browserName == "opera") {
                result = "Opera";
            } else if (browserName == "safari") {
                result = "Safari";
            } else if (browserName == "edge") {
                result = "Edge";

            } else {
                result =  "Invalid Browser Name";
            }
        }
        System.out.println(result + " is invalid browser name.");
*/

        System.out.println("-----------------------------------------------------");

        int n = 5;
       String day = (n >= 1 && n <=7)?
               (n==1)?"Monday" :(n==2)?"Tuesday":(n==3)?"Wednesday":(n==4)?"Thursday"

                       :(n==5)?"Friday":(n==6)?"Saturday":"Sunday"

                       : "No such a day" ;

        System.out.println("day = " + day);


    }
}