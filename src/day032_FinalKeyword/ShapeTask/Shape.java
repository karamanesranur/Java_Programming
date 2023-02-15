package Java_Programming_Muhtar.day032_FinalKeyword.ShapeTask;

import java.text.DecimalFormat;

public abstract class Shape {

    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract double calc_area();

    public abstract double calc_perimeter();

   // public abstract void eat(String food);

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return name +"{" +
                "area='" + calc_area()+ '\'' +
                ", perimeter='" + df.format(calc_perimeter())+ '\'' +
                '}';
    }
}
