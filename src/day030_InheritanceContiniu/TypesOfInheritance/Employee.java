package Java_Programming_Muhtar.day030_InheritanceContiniu.TypesOfInheritance;

import java.time.LocalDate;

public class Employee extends Person {

    private String jobTitle;
    private double salary ;
    private String employeeId;

    public Employee(String name, char gender, LocalDate DOB, String jobTitle, double salary, String employeeId) {
        super(name, gender, DOB);
        setJobTitle(jobTitle);
        setSalary(salary);
        setEmployeeId(employeeId);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void work(){
        System.out.println(getName() + " is working");
    }
}
