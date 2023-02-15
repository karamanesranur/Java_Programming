package Java_Programming_Muhtar.day034_AbstractionCont.Animal;

public class Dolphin extends Animal implements Playable{

    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Dolphin " + getName()+ " is eating yosun");
    }

    @Override
    public void play() {

    }
}
