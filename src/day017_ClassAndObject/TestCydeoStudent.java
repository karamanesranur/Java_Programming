package Java_Programming_Muhtar.day017_ClassAndObject;

public class TestCydeoStudent {
    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent();

    student1.setInfo("Josh",25 , 'M' , true , false,28, "Java","Encapsulation");


        CydeoStudent student2 = new CydeoStudent();
        student2.setInfo("Daniel",25 , 'M' , true , false,28, "Java","Encapsulation");


        CydeoStudent student3 = new CydeoStudent();
      student3.setInfo("Emily",25 , 'M' , true , false,28, "Java","Encapsulation");

      student1.name = "Said";



        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());

        CydeoStudent student4 = new CydeoStudent();
        System.out.println(student4);

   student4.study();

        System.out.println("---------------------------------------");


    }


}
