package Java_Programming_Muhtar.day024_ArrayListContinue_DataTimesIntro;

import Java_Programming_Muhtar.day017_ClassAndObject.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {


        ArrayList<Employee> employees = new ArrayList<>();

        employees.addAll(Arrays.asList(new Employee(), new Employee(), new Employee(), new Employee(), new Employee()));

        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");


        for (Employee each : employees) {
            System.out.println(each.name + " : " + each.jobTitle);
        }

        System.out.println("--------------------------------------------------------------------");

        for (Employee each : employees) {
            if (each.jobTitle.equals("Java Developer")) { //if the job title of the employee is Java Developer
                System.out.println(each.name);//  prints the name of employee
            }
        }
        System.out.println("--------------------------------------------------------------------");


        double max = employees.get(0).salary;
        double min = employees.get(0).salary;

        for (Employee each : employees) {
            if (each.salary > max) {
                max = each.salary;
            }
            if (each.salary < min) {
                min = each.salary;
            }
        }


        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("--------------------------------------------------------------------");


        ArrayList<Employee> femaleEmployees = new ArrayList<>();
        ArrayList<Employee> maleEmployees = new ArrayList<>();

        for (Employee employee : employees){
            if (employee.gender == 'M'){ // if the employee is male
            }else {
                femaleEmployees.add(employee);
            }
        }

        System.out.println("Total number of female employees: " + femaleEmployees);
        System.out.println("Total number of male employees: " + maleEmployees);







    }
}
