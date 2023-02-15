package Java_Programming_Muhtar.day034_AbstractionCont.Animal;

public class Duck extends Animal implements Playable , Flyable{
    public Duck(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Duck " + getName() + " is eating worm");
    }

    @Override
    public void play() {
        System.out.println("Duck " + getName() + " is playing");
    }

    @Override
    public void fly() {

    }
}
