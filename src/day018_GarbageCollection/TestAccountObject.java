package Java_Programming_Muhtar.day018_GarbageCollection;

public class TestAccountObject {

    public static void main(String[] args) {

        BankAccount obj1 = new BankAccount();
        obj1.setInfo("Gadir", 1265784578);

        System.out.println(obj1);

        obj1.deposit(1000);

        obj1.checkBalance();

        obj1.withdraw(700);

        obj1.checkBalance();

        obj1.withdraw(700);

        obj1.checkBalance();


        System.out.println("---------------------------------------------");


        BankAccount account1 = new BankAccount();
        account1.setInfo("Sebastian", 54654684);


        BankAccount account2 = new BankAccount();
        account2.setInfo("Umran", 878654354);

        account1.deposit(5000);
        account2.deposit(10000);

        System.out.println(account1);
        System.out.println(account2);

        account1.withdraw(1000);

        System.out.println(account1);
        System.out.println(account2);
    }
}
