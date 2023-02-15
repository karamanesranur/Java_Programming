package Java_Programming_Muhtar.day038_ExceptionHandling;

public class TestPersonObject {
    public static void main(String[] args) {

        Person person1 = new Person("Daniel" , 32, 'M');
        System.out.println(person1);

        person1.setAge(-25);

        System.out.println(person1);
    }
}
