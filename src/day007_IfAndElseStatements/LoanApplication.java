package Java_Programming_Muhtar.day007_IfAndElseStatements;

public class LoanApplication {
    public static void main(String[] args) {

        int salary = 55000,
                creditScore = 70 ;
        String eligibleLoan = "";

        if ( salary >= 45000 && creditScore >= 700) {

          eligibleLoan = "You are eligible for the loan.";
        }else {
          eligibleLoan = "You are not eligible for the loan.";

          System.out.println( eligibleLoan);


        }



    }
}
