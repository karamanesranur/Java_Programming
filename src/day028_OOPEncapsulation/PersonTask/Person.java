package Java_Programming_Muhtar.day028_OOPEncapsulation.PersonTask;

public class Person {

    public String name; // instance variable
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman, hasNose; //static variable
    public static int numberOfWings, numberOfHeads;


    public Person(String name){//Allows us to create Person object just by setting the name of the person
        this.name =name;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }

    public Person(String name , String language){
        this(name);
        this.language = language;
    }

    public Person(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
        this(name, age);
      //  this(name, gender);
        this.gender = gender;
    }

    public Person(String name, int age, char gender, String language) {
      this(name, age, gender);
        this.language = language;
    }
    static {
        planet = "Earth";
        isHuman=true;
        hasNose = true;
        numberOfWings=0;
        numberOfHeads =1;


    }

    public static void printPlanetName(){
        System.out.println("Planet name is: " + planet);
    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                '}';
    }







}
