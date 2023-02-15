package Java_Programming_Muhtar.day037_Exceptions;

public class FinallyBlock {
    public static void main(String[] args) {

       try {
            System.out.println(9/0);
        }catch (NullPointerException e){
           System.out.println("Null Pointer Exception has been caught");
           e.printStackTrace();
           System.exit(1);
       }finally { //optional
           System.out.println("Finally Block");
       }





    }
}
