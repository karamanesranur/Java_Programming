package Java_Programming_Muhtar.day030_InheritanceContiniu.PhoneTask;

public class IPhone extends Phone{ // Iphone is a phone



    public static boolean hasApplePay=true;

    public IPhone(String brand, String model, String size, String color, double price) {
        super("Iphone", model, size, color, price);
    }

    public void faceTime(long phoneNumber){

        System.out.println(getModel() + " is face timing with " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println(getModel() + " is face timing with " + email);

    }
}
