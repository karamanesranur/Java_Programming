package Java_Programming_Muhtar.day028_OOPEncapsulation.Encapsulation;

public class Student {

    public String name ;
    private int age;

    public int getAge() { // READ ONLY

        return age;
    }


    public void setAge(int age) { //WRITE ONLY

        boolean hasDigit = false;
        for ( char each : name.toCharArray() ) {

        }
        if (age < 1 || age > 100) {
            System.err.println("Invalid Age: " + age);
            // return; // exiting the method
            System.exit(1);

        }
        this.age = age;
    }
}