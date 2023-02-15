package Java_Programming_Muhtar.day032_FinalKeyword.ShapeTask;

import static java.lang.Math.pow;
public  class Circle extends Shape {


    private double radius ;
    public final static double PI = Math.PI;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(String name, double radius) {
        super("Circle");
        setRadius(radius);
    }

    @Override
    public double calc_area() {
        return pow(radius, 2 ) * PI;
    }

    @Override
    public double calc_perimeter() {
        return 2*PI *  (radius*radius);
    }
}
