package Java_Programming_Muhtar.day007_IfAndElseStatements;

public class NetIncomeCalculate {
    public static void main(String[] args) {
        int salary = 200000;
        double taxRate = 0;
        boolean isMarried = false;

        if (salary >= 130000) { // if the salary is 130k
            taxRate = 0.35;
        }
        if (salary >= 100000 && salary <= 129000) { //if the salary is between 100k to 130k then the tax rate should be %30
            taxRate = 0.30;
        }
        if (salary >= 80000 && salary <= 100000) {
            taxRate = 0.25;
        }
        if (salary <= 79000) {
            taxRate = 0.20;
        }

        if (isMarried) { // if the person is married
            taxRate -= 0.05; //  tax is reduced bye %5
        }
        double totalTax = salary * taxRate;
        double netIncome = salary - totalTax;

       // double netIncome = salary * (1 - taxRate);
        System.out.println("NET INCOME = " + netIncome);
        System.out.println("Total tax = " + totalTax);
        System.out.println("salary = " + salary);
    }
}
