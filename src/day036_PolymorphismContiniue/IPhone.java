package Java_Programming_Muhtar.day036_PolymorphismContiniue;

public class IPhone {
    private String brand, model, size, color;
    private double price;


    public IPhone(String brand, String model, String size, String color, double price) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setColor(color);
        setPrice(price);
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.err.println("Invalid price: " + price);
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {


    }

    public void call(long PhoneNumber) {
        System.out.println(getModel() + " is calling ");
    }

    public void text(long PhoneNumber) {
        System.out.println(getModel() + " is texting");
    }


    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof IPhone)){
            System.err.println("Invalid object");
            System.exit(1);
        }

        if (obj instanceof IPhone) { // if the given object is Iphone
            if (model.equals(((IPhone) obj).model)) {// if the model of the Iphone is equal to the given Iphone model
                if (color.equals(((IPhone) obj).color)) {// if the color of the Iphone is equal to given Iphone color
                    return true;
                }
            }
        }
        return false;
    }
}
