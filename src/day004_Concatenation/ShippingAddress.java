package Java_Programming_Muhtar.day004_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {

        String name = "Aeron Kissinger",
                buildingNumber="13621A",
                streetName="Legacy Circle",
                city ="Fairfax",
                state ="VA";
                        int zipcode=22030 ;

        System.out.println("Your shipping address is:");
        System.out.println("\t" + name);
        System.out.println("\t"+ buildingNumber + " " + streetName);
        System.out.println("\t" + city+" "+state+" "+zipcode);

        System.out.println("-------------------------------------");

        System.out.println("Your shipping address is :\n\t"+name+"\n\t"+
                buildingNumber
                + " "+
                " "+ streetName +"\n\t"+city+" "+state+" "
        + zipcode);




    }



}
