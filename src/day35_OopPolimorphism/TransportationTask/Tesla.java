package Java_Programming_Muhtar.day35_OopPolimorphism.TransportationTask;

public class Tesla extends Car implements Electric , AutoPark , AutoPilot {


    public Tesla(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
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
