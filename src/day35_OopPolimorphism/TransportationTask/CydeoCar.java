package Java_Programming_Muhtar.day35_OopPolimorphism.TransportationTask;

import Java_Programming_Muhtar.day034_AbstractionCont.Animal.Flyable;

public class CydeoCar extends Car implements Flyable , Electric , AutoPilot , AutoPark  {
    public CydeoCar(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void fly() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void charge() {

    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }
}
