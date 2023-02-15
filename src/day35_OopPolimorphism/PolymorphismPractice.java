package Java_Programming_Muhtar.day35_OopPolimorphism;

import Java_Programming_Muhtar.day034_AbstractionCont.Animal.Tiger;

public class PolymorphismPractice {
    public static void main(String[] args) {

        Tiger tiger = new Tiger("Khan" , "Bengal",'M' , 5, "Large" , "Orange");

        tiger.eat();
        tiger.drink();
        tiger.sleep();



    }
}
