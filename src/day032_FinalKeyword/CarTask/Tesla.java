package Java_Programming_Muhtar.day032_FinalKeyword.CarTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Tesla extends Car{

    public Tesla(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

public void autoPilot(){
    System.out.println(getMake() + " " + getModel() + " is in self-driving mode ");
}

    @Override
    public void start() {
        System.out.println("Say \"Start\" to start " + getMake() + " " + getModel());
    }



    @Override
    public void setModel(String model){
        ArrayList<String> models = new ArrayList<>();
       models.addAll(Arrays.asList("Model S" , "Model Y"  , "Model X" , "Model 3"));

        if (!model.contains(model)){ // if specified model is not valid model
            System.err.println("Invalid Tesla Model: " + model);
            System.exit(1);
        }

        super.setModel(model); // this.model = model;


    }


    @Override
    public void setColor(String color) {
        ArrayList<String> colors = new ArrayList<>();
        colors.addAll(Arrays.asList("White" , "Red" , "Black" , "Silver" , "Blue" , "Brown" , "Green"));

        if (!colors.contains(color)) {
            System.err.println("Invalid Color :" +color);
            System.exit(1);
        }
        super.setColor(color); // this.color = color;
    }

    @Override
    public void setYear(int year) {

        if (year <=2007){
            System.err.println("Invalid year of Tesla car: " + year);
            System.exit(1);
        }
        super.setYear(year);
    }

    @Override
    public void setPrice(double price) {

        if (price < 50000){
            System.err.println("Invalid price for Tesla" + price);
            System.exit(1);

        }
        super.setPrice(price);
    }
}
