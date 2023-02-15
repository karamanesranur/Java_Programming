package Java_Programming_Muhtar.day008_TernaryOpeatorsSwich;

public class Elevator {
    public static void main(String[] args) {

        int floorNumber = 2;
        String result = "Invalid Floor";
        if (floorNumber >= 1 && floorNumber <= 3) {

          /*   if(floorNumber== 1){
                System.out.println("Floor 1 selected.Companies : Lobby , Verizon , Starbucks");
            } else if (floorNumber == 2) {
                System.out.println("Floor 2 selected.Companies : Cydeo , Nasa , Toyato");

            }else{
                System.out.println("Floor 3 selected.Companies : Lyft , bofA , Stake house");
            }
        }
        System.out.println(floorNumber);*/
result = "Floor " + floorNumber + " is selected.Companies:";
            if(floorNumber== 1){

                result += "Lobby , Verizon , Starbucks ";
            } else if (floorNumber == 2) {

               result += " Cydeo , Nasa , Toyato";

            }else{
               result += "Lyft , bofA , Stake house";
            }
            System.out.println(result);
        }
    }
}
