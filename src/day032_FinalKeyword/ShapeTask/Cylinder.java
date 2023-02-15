package Java_Programming_Muhtar.day032_FinalKeyword.ShapeTask;



public class Cylinder extends Shape{

    private double height ,radius ;

    public Cylinder(String name, double height, double radius) {
        super("Cylinder");
        setHeight(height);
        setRadius(radius);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calc_area() {
        return 2 * radius;
    }

    @Override
    public double calc_perimeter() {
        return 0;
    }
}
