package Java_Programming_Muhtar.day031_OverridingMethod.VehicleTask;

public class Airplane extends Vehicle{

    public Airplane(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void fly(){
        System.out.println(getBrand() + " " + getModel() + " is flying");
    }
}
