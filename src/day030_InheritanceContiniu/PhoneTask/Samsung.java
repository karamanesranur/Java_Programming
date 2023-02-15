package Java_Programming_Muhtar.day030_InheritanceContiniu.PhoneTask;

public class Samsung extends Phone {
    public Samsung(String brand, String model, String size, String color, double price){
        super("Samsung", model, size, color, price);

 }
 public void freeze(){
     System.out.println(getBrand() + " " + getModel()+ " freezes a lot");
 }
}
