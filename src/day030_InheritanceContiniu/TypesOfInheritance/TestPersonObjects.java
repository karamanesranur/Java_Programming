package Java_Programming_Muhtar.day030_InheritanceContiniu.TypesOfInheritance;

import java.time.LocalDate;

public class TestPersonObjects {
    public static void main(String[] args) {

        Student student = new Student("Lucy", 'F', LocalDate.of(1990, 5, 12), 'A', "A01");

        President president = new President("Daniel", 'M', LocalDate.of(1980, 12, 1), LocalDate.of(2020, 5, 9));


    }
}