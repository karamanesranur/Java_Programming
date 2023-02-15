package Java_Programming_Muhtar.day008_TernaryOpeatorsSwich;

public class Loans {
    public static void main(String[] args) {
        /*
         Create a class called Loans, Given two variables salary and credit score,
         use those given info to determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.
         */


        double salary = 70000;
        int creditScore = 782;
        String Loan = (salary >= 60.000 && creditScore >= 650)?"Loan Approved":"Loan Denied";


        System.out.println("Loan = " + Loan);
    }
}
