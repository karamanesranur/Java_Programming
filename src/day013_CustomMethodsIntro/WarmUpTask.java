package Java_Programming_Muhtar.day013_CustomMethodsIntro;

public class WarmUpTask {
    public static void main(String[] args) {

        Calculate(200, 5, '/');

        Calculate(200, 5, '*');


        /*
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your two numbers and a math operator: ");
        double n1= input.nextDouble();
        double n2= input.nextDouble();

        char operator = input.next().charAt(0);

        Calculate(n1 , n2 , operator);
*/
        System.out.println("------------------------------------------------------");

        ageGroup(75);

        eligibleToVote(35,true);

    }



    public static void Calculate(double num1, double num2, char mathOperator) {


        switch (mathOperator) {

            case '+':
                System.out.println(num1 + " " + mathOperator + " " + num2 + "=" + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " " + mathOperator + " " + num2 + "=" + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " " + mathOperator + " " + num2 + "=" + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + " " + mathOperator + " " + num2 + "=" + (num1 / num2));
                break;
            default:

                System.err.println("Invalid Operator: " + mathOperator);

        }


    }


    public static void ageGroup(int age ){

        if (age >=0 && age <= 150){

            System.out.println( (age <=21)?"Teenage" : (age <55)?"Adult" :"Senior" );

        }else {
            System.err.println("Invalid age: " + age);
        }


    }


    public static void eligibleToVote(int age , boolean isAmerican){

        if ( age >= 18 && isAmerican){

            System.out.println("You are eligible to vote");
        }else {
            System.err.println("You are not eligible to vote");
        }

    }
}
