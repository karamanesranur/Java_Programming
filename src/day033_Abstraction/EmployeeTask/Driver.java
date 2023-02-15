package Java_Programming_Muhtar.day033_Abstraction.EmployeeTask;

public abstract class Driver extends Employee{



    public Driver(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);


    }

    @Override
    public void work() {
        System.out.println(getName() + " is driving.");
    }
}
