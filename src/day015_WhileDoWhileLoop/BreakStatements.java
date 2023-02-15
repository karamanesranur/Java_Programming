package Java_Programming_Muhtar.day015_WhileDoWhileLoop;

public class BreakStatements {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 6) { // if i's value reaches 6
                break; // exits the loop
            }
            System.out.println(i);

        }

        System.out.println("-------------------------------------------------------");

        for (char i = 'A'; i <= 'Z'; i++ ){
            System.out.print(i );

            if (i == 'J'){
                System.out.println("Loop is terminated");
                break;
            }

            System.out.println(i);
        }

        System.out.println("------------------------------------------------------------");

        for (;;){
            System.out.println("Hello");
            break;

        }
    }
}
