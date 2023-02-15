package Java_Programming_Muhtar.day031_OverridingMethod.AnimalMethodOverring;

public class TestAnimalObjects {

    public static void main(String[] args) {


        Cat cat = new Cat("Cemil", "Smoking", 'F', 1, "Large", " Combo");

        Dog dog = new Dog("Max", "Husky", 'M', 3, "Large", "White");

        Lion lion = new Lion("Simba", "African Lion", 'M', 6, "Large", "Yellow", true);

        Eagle eagle = new Eagle("Bella", "American Eagle", 'F', 4, "Medium", "Black & Silver");


        System.out.println(cat);
        System.out.println(dog);
        System.out.println(lion);
        System.out.println(eagle);

        System.out.println("-----------------------------------------------");

        cat.eat();
        dog.eat();
        eagle.eat();
        lion.eat();

        System.out.println("-----------------------------------------------");

        cat.sleep();
        dog.sleep();
        eagle.sleep();
        lion.sleep();




    }



}
