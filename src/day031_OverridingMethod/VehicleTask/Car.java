package Java_Programming_Muhtar.day031_OverridingMethod.VehicleTask;

public class Car extends Vehicle {

    public Car(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void drive(){
        System.out.println("Driving " + getBrand() + " " + getModel());
    }
}
