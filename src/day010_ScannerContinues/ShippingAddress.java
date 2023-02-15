package Java_Programming_Muhtar.day010_ScannerContinues;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Enter


        System.out.println("Enter your full name:");
        String full_name = input.nextLine(); // Cydeo School + ENTER

        System.out.println("Enter your building number:");
        String building_number =input.next(); // 7926A

        input.nextLine();// To clear the scanner

        System.out.println("Enter your street name:");
        String street_name = input.nextLine(); // Jones Branch Drive + Enter

        System.out.println("Enter your city name:");
        String city_name = input.nextLine();//Mclean +ENTER

        System.out.println("Enter your state name:");
        String state_name = input.nextLine();//Virginia

        System.out.println("Enter your zip code:");
        String zip_code = input.next(); //

        System.out.println("full_name = " + full_name);
        System.out.println("building_number = " + building_number);
        System.out.println("street_name = " + street_name);
        System.out.println("city_name = " + city_name);
        System.out.println("state_name = " + state_name);
        System.out.println("zip_code = " + zip_code);

        //--------------------------------------------------------------

        System.out.println("Your shipping address is:");
        System.out.println("\t" + full_name);
        System.out.println("\t" + building_number + " " + street_name);
        System.out.println("\t" + city_name + " " + state_name + " " + zip_code);

    input.close();

    }
}
