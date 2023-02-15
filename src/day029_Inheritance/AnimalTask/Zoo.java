package Java_Programming_Muhtar.day029_Inheritance.AnimalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog  =new Dog();
        dog.setInfo("Max" , "Husky" , 'F' , 4 , "Large" , "White");
        Cat cat = new Cat();
        cat.setInfo("Cemil" , "Smokine" , 'M' , 1, "Medium","Black-White");
        Tiger tiger = new Tiger();
        tiger.setInfo("Kaplan" , "Bengal" , 'M' , 5 , "Large" , "Orange");

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);

        System.out.println("---------------------------------------------");

        dog.eat();
        dog.drink();
        dog.drink();

        cat.eat();
        cat.drink();
        cat.sleep();

        tiger.eat();
        tiger.eat();
        tiger.sleep();

        System.out.println("------------------------------------------------------");

        dog.bark();
        cat.meow();

        tiger.hunt();


        System.out.println("----------------------------------------");


    }
}
