package Java_Programming_Muhtar.day036_PolymorphismContiniue;

import Java_Programming_Muhtar.day029_Inheritance.AnimalTask.Animal;
import Java_Programming_Muhtar.day029_Inheritance.AnimalTask.Dog;
import Java_Programming_Muhtar.day030_InheritanceContiniu.PhoneTask.Nokia;
import Java_Programming_Muhtar.day030_InheritanceContiniu.PhoneTask.Phone;
import Java_Programming_Muhtar.day033_Abstraction.EmployeeTask.Developer;
import Java_Programming_Muhtar.day033_Abstraction.EmployeeTask.Employee;
import Java_Programming_Muhtar.day033_Abstraction.EmployeeTask.Tester;

public class ReferenceTypeCastings {
    public static void main(String[] args) {

       Dog dog = new Dog();
      //  Cat cat = new Cat();

        Animal animal = (Animal) new Dog(); //  implicit casting


        System.out.println("-------------------------------------------------");


        Animal animal1 = new Dog(); // upcasting ==> Polymorphism
        animal1.setInfo("Max" , "Husky" , 'M' , 4,"Large" , "White");

        animal1.eat();
        animal1.drink();
        animal1.sleep();


       ( (Dog)animal1).bark(); // down casting

     //  Dog dog1 = (Dog) animal1 ; // down casting

      // dog1.bark();

      // ( (Cat)animal1).stratch(); // Dog can not be converted to cat , because there is "not is" a relationship

        System.out.println("-------------------------------------------------");

        Phone phone = new Nokia("Nokia" , "XR20" , "Small" , "Blue" , 350);

        phone.call(911);
        phone.text(1234567);
       ( (Nokia)phone).selfDefense();
        System.out.println("-------------------------------------------------");

        Employee employee = new Developer("Lucy" , 25, 'F' , "C1","Java Developer");

        employee.work();

        System.out.println(((Developer)employee) . getProgrammingLanguage());

        Tester tester = (Tester) employee;



    }
}
