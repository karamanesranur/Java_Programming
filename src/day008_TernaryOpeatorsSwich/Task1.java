package Java_Programming_Muhtar.day008_TernaryOpeatorsSwich;

public class Task1 {
    public static void main(String[] args) {

        int num =1;
        String result = (num >=1 && num <=9)?
                (num == 1)?"One":(num == 2)?"Two":(num == 3)?"Three":(num==4)?
                        "Four":(num == 5)?"Five":(num == 6)?"Six":(num == 7)?"Seven":
                        (num== 8 )?"Eight":"Nine" : "Invalid";

        System.out.println(result);
    }
}
