package Java_Programming_Muhtar.day005_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {

        int a = 20;
        System.out.println(a); //20

        System.out.println(a); //20

        a = 40;

        System.out.println(a);
        System.out.println("------------------------------------------");

        double balance = 100;

        balance += 10000; // balance = 100+1000

        System.out.println("balance is= " + balance);

        balance += 500; //balance = 1100+500
        System.out.println("balance= " + balance);

        balance += 1000;

        System.out.println("balance= " + balance);

        balance -= 836; // balance= $11600.0 - $836 = 10764.0

        System.out.println("balance= " + balance);

        balance -= 10000;  //10464 - 10000

        System.out.println("balance= " + balance);

        balance *= 2;

        System.out.println("balance= " + balance);

        System.out.println("----------------------------------------------");

        double salary = 45000;

        salary *= 2; // salary = 45000 * 2

        System.out.println(salary);

        salary *= 3;
        System.out.println(salary);

        System.out.println("----------------------------------------------");


        double eth = 4;

        eth /= 0.5 ;

        System.out.println(eth);


    }


}
