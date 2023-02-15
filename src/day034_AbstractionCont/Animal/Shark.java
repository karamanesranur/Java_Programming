package Java_Programming_Muhtar.day034_AbstractionCont.Animal;

public class Shark extends Animal{
    public Shark(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Shark " + getName() + " is eating big fish");
    }

    @Override
    public void play() {

    }
}
