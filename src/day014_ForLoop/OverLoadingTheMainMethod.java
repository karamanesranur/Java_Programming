package Java_Programming_Muhtar.day014_ForLoop;

public class OverLoadingTheMainMethod {
    public static void main(String[] args) {
        System.out.println("A");
        main(25);
        main(2.05);
        main(true);
    }

    public static void main(int args) {
        System.out.println("B");
    }

    public static void main(double args) {
        System.out.println("C");
    }

    public static void main(boolean args) {
        System.out.println("D");
    }
}
