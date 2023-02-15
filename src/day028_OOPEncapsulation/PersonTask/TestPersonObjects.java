package Java_Programming_Muhtar.day028_OOPEncapsulation.PersonTask;

public class TestPersonObjects {
    public static void main(String[] args) {

        Person person1 = new Person("Esranur");
        Person person2 = new Person("Eda" , 'F');
        Person person3 = new Person("Fahriye" , 22);
        Person person4 = new Person("Hasan" , "English");
        Person person5 = new Person("Daniel" , 30 , 'M');
        Person person6 = new Person("Lucy" , 30 , 'F', "English");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);

        Person.printPlanetName();

        person1.eat("Baklava");

        person2.drink("Water");

        person5.drink("Tea");

        person6.drink("Coffee");


    }
}
