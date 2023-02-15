package Java_Programming_Muhtar.day021_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {
    public static void main(String[] args) {

        String[] group1 = {"James", "Daniel", "Mike", "Luke"};//4 names
        String[] group2 = {"Leo", "Hannah", "Mona"};//3 names
        String[] group3 = {"Hatice", "Kingston", "Camilo", "Rose", "Juan"};//5 names
        String[] group4 = {"Luna", "Luca"};//2 names

        String[][] groups = {group1, group2, group3, group4};
        //                   0         1       2         3
        for (int i = 0; i < groups.length; i++) {
                   String[] eachGroup =  groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (int j = 0; j < eachGroup.length; j++) {
                String eachStudent = eachGroup[j];
                System.out.println(eachStudent);
            }
        }
        System.out.println("------------------------------------------------------");

        for (String[]  eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup));
            for (String eachStudents : eachGroup) {
                System.out.println(eachStudents);
            }
        }
        System.out.println("------------------------------------------------------");

        for (int i = groups.length - 1; i >= 0; i--) {

            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);

            }
        }

        System.out.println("------------------------------------------------------");

        System.out.println(groups);

        System.out.println(Arrays.toString(groups)); // toString() ==> for single dimensional array ONLY

        System.out.println(Arrays.deepToString(groups));// deepToString() ==> for multi dimensional array ONLY



    }
}
