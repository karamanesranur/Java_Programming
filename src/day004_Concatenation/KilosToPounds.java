package Java_Programming_Muhtar.day004_Concatenation;

public class KilosToPounds {
    public static void main(String[] args) {

        double kg = 10.5,
                pounds = 10.5 * 2.2;


        //  kg = 2.2 lb

        System.out.println(kg + " kilos is equal to " + pounds + " pounds.");

        System.out.println("----------------------------------------");

        double gallon = 10;
        double liters = 3.79;
        System.out.println(gallon + " gallons is equal to " + gallon * liters + " litters.");

        System.out.println("-----------------------------------------------");
        //Square
        //Task 5

        int side = 5;
        System.out.println("Area of the square is " + side * side + "\n" + "Perimeter of the square is ");

        System.out.println("------------------------------------------");
        //Circle-6
        int radius = 5;
        double area = 3.14 * radius * radius;
        double perimeter = 2 * 3.14 * radius;

        System.out.println("Area of the circle is " + area + "\n" + "Perimeter of the circle is " +
                perimeter);

        System.out.println("---------------------------------");


       /* int x = 10;
        int y = 15 ;
        int z = y - x ;
        x = z+x;
        y=z+y;



        System.out.println("x = " + x + "\n" +
                "y = " + y );
 */

        System.out.println("---------------------------------");

        int x = 10 ;
        int y = 15 ;

        x = x * y; // 10 * 15 = 150
        y = x / y; // 150 / 15 = 10
        x = x / y; // 150 / 10 = 15
        y = y + y; // 10 + 10 = 20



        System.out.println("x = " + ( x + y ) + "\n" +
                "y = " + 0 + x );



char ch = 95;



        long a1 = 30L;
        short b1 = (short)a1;
        System.out.println(b1);

        float a2 = 100.459_524f;
        byte b2 = (byte)a2;
        double c2 = b2;
        System.out.println(c2);




    }
}
