package Java_Programming_Muhtar.day032_FinalKeyword.ShapeTask;

public class Cube extends Shape {

    private double length , height , width ;

    public Cube(double length, double height, double width) {
        super("Cube");
        setLength(length);
        setHeight(height);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calc_area() {
        return 0;
    }

    @Override
    public double calc_perimeter() {
        return 0;
    }
}
