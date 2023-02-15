package Java_Programming_Muhtar.day033_Abstraction.EmployeeTask;

public class TestEmployeeObject {

    public static void main(String[] args) {

       // Employee employee = new Employee("Daniel", 54, 'M', "A1", "SDET", 85000) {
           // we can not create objects from an abstract class , Object must be created from a concrete class


       Teacher teacher = new Teacher("James",45,'M',"B1","Math Teacher" , 75000);


       Developer developer = new Developer("James",45,'M',"B1","Math Teacher" , 75000 , "Java");

    }
}
