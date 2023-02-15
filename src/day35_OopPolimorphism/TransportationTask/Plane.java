package Java_Programming_Muhtar.day35_OopPolimorphism.TransportationTask;

import Java_Programming_Muhtar.day034_AbstractionCont.Animal.Flyable;

public abstract class Plane extends Transportation implements Flyable {

    public Plane(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    public void land(){
        System.out.println("Plane " + getMake() + " " + getModel());
    }

    @Override
    public void fly() {
        System.out.println(getMake() + " " + getModel() + " is flying");
    }
}
