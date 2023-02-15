package Java_Programming_Muhtar.day034_AbstractionCont.Animal;

public class Dog extends Animal implements  Playable{


    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Dog " + getName() + " is eating dog food");
    }

    @Override
    public void play() {
        System.out.println("Dog " + getName() + " is playing");
    }
}
