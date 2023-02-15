package Java_Programming_Muhtar.day005_Operators;

import java.sql.SQLOutput;

public class LogicalOperator {
    public static void main(String[] args) {

        double salary = 90000;
        int creditScore = 700;
        int age = 18;

        boolean eligibleForLoan = salary >= 30000 && creditScore >= 650 && age >= 18;
        //  true       &&      true       &&  true
        System.out.println(eligibleForLoan);

        System.out.println("----------------------------------------------------");

        age = 18;

        String country = "USA";

        boolean eligibleToVote = age >= 18 && country == "USA";
        // true     &&      true

        System.out.println(eligibleToVote);

        System.out.println("---------------------------------------------");
        System.out.println("LOGICAL OR(||){ IT S MEAN EITHER[||] } OPERATOR");

        String answer = "no";

        boolean validAnswer = answer == "yes" || answer == "no";

        System.out.println(validAnswer);

        System.out.println("---------------------------------------------");
        System.out.println("LOGICAL NOT(!){ IT S MEAN NOT } OPERATOR");

        System.out.println(true == !false && false == !true && true != !true);
        //                    true=true or  false=false or true =! false
        //                            true         true            true


    }
}
