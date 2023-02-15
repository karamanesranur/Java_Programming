package Java_Programming_Muhtar.day012_CustomMethods;

public class EmailDomain {
    public static void main(String[] args) {

        display();
        monthName(6);
        capitalization("cydeo","scHool");
        week(5);
        monthHas("jUNe");
        eligibleToVote(25 ,true);
        salary(45,40);
    }

    public static void display(){

        String email="Cydeo@gmail.com";
        String result = email.substring(email.indexOf("@")+1 ,email.lastIndexOf(".") );

        System.out.println("domain = " + result);;
    }
    /*
    Create a method named monthName that can display the name of the month based on the given number
    to the method, if the number is invalid, then the method should print the error message
     "Invalid Number"
    Ex:
        monthName(6)

        output:
            June

     */

    public static void monthName( int number ){

        if (number >12 ||  number <1){
            System.err.println("Invalid Number");
            return; //exits the method. remaining codes of the method won't be executed
    }

      String  mName = (number==1)?"January":(number==2)?"February":(number==3)?"March":
                (number==4)?"April":(number==5)?"May":(number==6)?"Jun":
                        (number==7)?"July":(number==8)?"Aug":(number==9)?"Sep":
                                (number==10)?"October":(number==11)?"November":"December";

        System.out.println(mName);

    }

    /*
    . Create a method named capitalization that can format the first and last names of the person and display the full name of the person
    Ex:
        capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School

     */

    public static void capitalization(String firstName , String lastName){

        firstName = (""+firstName.charAt(0)).toUpperCase()+firstName.substring(1);
        lastName =(""+lastName.charAt(0)).toUpperCase()+lastName.substring(1);

        System.out.println(firstName + " " + lastName);



    }

    /*
    Create a method named day that can display the name of the day based on the given
     number to the method, if the number is invalid,
     then the method should print the error message "Invalid Number"
    Ex:
        day(5)

        output:
            Friday
     */
    public static void week(int dayNum){

        if (dayNum > 7 || dayNum < 1){
            System.err.println("Invalid Number");
            return;
        }

        String dayName = (dayNum==1)?"Monday":(dayNum==2)?"Tuesday":
                (dayNum==3)?"Wednesday":(dayNum==4)?"Thursday":
                        (dayNum==5)?"Friday":(dayNum==6)?"Saturday":
                                "Sunday";

        System.out.println(dayName);
    }

/*
 Create a method that can print how many days a month has
    Ex:
        month("jUNe")

        output:
            June has 30 days

 */

 public static void monthHas(String month){

     month =(""+ month.charAt(0)).toUpperCase() + month.substring(1);

     String result = month + " has " ;

switch (month){

    case "February":
        month += 28 + " days";
        break;

    case "April":
    case "June":
    case "September":
    case "November":
    month += 30 + " days";
        break;

    case "January":
    case "March":
    case "May":
    case "July":
    case "August":
    case "October":
    case "December":
        month += 31 + " days";
        break;

    default:
        month = "Invalid Month" ;
}
     System.out.println(month);

}


/*
Create a method named eligibleToVote that takes two arguments:
        1. age (int)
        2. isAmerican (boolean)

    Then the method should determine if the person eligible to vote
        Ex:
            eligibleToVote(23, true)

        output:
            You are eligible to vote
 */



    public static void eligibleToVote(int age, boolean isAmerican){


        String result = "";

        if (age > 18 || isAmerican == true){
           result = "Eligible for the vote(" +age + "," + isAmerican + ")";
        }else {
            System.err.println("Not eligible for the vote");
        }

        System.out.println(result);

    }


    /*
    Create a method named salary that takes two arguments:
        1. hourlyRate (double)
        2. weeklyHours (int)

    Then the method should display the salary of the person.
        Ex:
            salary(45, 40)

        output:
            You make $45.0 per hour
            You work 40 hours in a week
            Your gross income is $93600.0
     */


    public static void salary(double hourlyRate , int weeklyHours){

        double income = hourlyRate * weeklyHours *52;

        System.out.println("You make $" + hourlyRate + " per hour");
        System.out.println("You work " + weeklyHours + " hours in a week");
        System.out.println("You gross income is $" + income);
    }

 }


