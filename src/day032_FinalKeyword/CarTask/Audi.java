package Java_Programming_Muhtar.day032_FinalKeyword.CarTask;

public class Audi extends Car{
    public Audi(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }
    @Override
    public void start(){
        System.out.println("Press the start button to start " + getMake() + " " + getModel());
    }
}
