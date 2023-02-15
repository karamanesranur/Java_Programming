package Java_Programming_Muhtar.day022_WrapperClasses_ArrayIntro;

import java.util.ArrayList;

public class ArrayListMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);   //0
        list.add(20);  // 1
        list.add(30); // 2
        list.add(20);// 3

        System.out.println(list);

        list.add(1, 15);

        System.out.println(list);

        list.add(2, 25);

        System.out.println(list);

        System.out.println("-------------------------------------------------------------");

        ArrayList<String> studentsList = new ArrayList<>();
        studentsList.add("Esra");
        studentsList.add("Ayse");
        studentsList.add("Fatma");
        studentsList.add("Hayriye");

        System.out.println(studentsList.size());
        System.out.println(studentsList);

        String firstStudents = studentsList.get(0);
       String lastStudent=  studentsList.get(studentsList.size() - 1 );

        System.out.println(firstStudents);
        System.out.println(lastStudent);
    }
}
