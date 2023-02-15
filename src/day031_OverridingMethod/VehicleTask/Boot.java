package Java_Programming_Muhtar.day031_OverridingMethod.VehicleTask;

public class Boot extends Vehicle{
    public Boot(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void sail(){
        System.out.println(getBrand() + " " + getModel() + " is ailing.");
    }
}
