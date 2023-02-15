package Java_Programming_Muhtar.day010_ScannerContinues;


import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadFilesWithScanner {
    public static void main(String[] args)throws IOException {

        Scanner scan =new Scanner(Path.of("Java_Programming_Muhtar/day010_ScannerContinues/Test.txt"));



       // System.out.println(scan.hasNext());
       // true/false
        scan.close();

    }
}
