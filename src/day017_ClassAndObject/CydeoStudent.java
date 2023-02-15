package Java_Programming_Muhtar.day017_ClassAndObject;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;
    public boolean isMarried ,isEmployed;
    public  int batchName ;
    public String programmingLanguage;
    public String groupName;


    // public static String schoolName = "Cydeo";


    public void setInfo(String name, int age, char gender, boolean isMarried, boolean isEmployed, int batchName, String programmingLanguage, String groupName) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
        this.batchName = batchName;
        this.programmingLanguage = programmingLanguage;
        this.groupName = groupName;

    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", isMarried=" + isMarried +
                ", isEmployed=" + isEmployed +
                ", batchName=" + batchName +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                ", groupName='" + groupName + '\'' +
                '}';
    }


    public void study(){
        System.out.println(name + " is studying " + programmingLanguage);
    }



}
