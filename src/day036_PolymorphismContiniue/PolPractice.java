package Java_Programming_Muhtar.day036_PolymorphismContiniue;

import Java_Programming_Muhtar.day030_InheritanceContiniu.PhoneTask.IPhone;
import Java_Programming_Muhtar.day030_InheritanceContiniu.PhoneTask.Nokia;
import Java_Programming_Muhtar.day030_InheritanceContiniu.PhoneTask.Phone;
import Java_Programming_Muhtar.day030_InheritanceContiniu.PhoneTask.Samsung;

public class PolPractice {

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        Phone[] phones = {
                new Java_Programming_Muhtar.day030_InheritanceContiniu.PhoneTask.IPhone("IPhone", "Iphone 11 Pro", "Large", "Black", 900),
                new Java_Programming_Muhtar.day030_InheritanceContiniu.PhoneTask.IPhone("IPhone", "Iphone 12 Pro Max", "Large", "Black", 1200),
                new Java_Programming_Muhtar.day030_InheritanceContiniu.PhoneTask.IPhone("IPhone", "Iphone 9", "Medium", "Gold", 800),
                new Samsung("Samsung", "Galaxy S19", "Medium", "Pink", 700),
                new Samsung("Samsung", "Galaxy S20", "Large", "Silver", 850),
                new Samsung("Samsung", "Galaxy S21", "Large", "Black", 950),
                new Nokia("Nokia", "XR20", "Small", "Blue", 350),
                new Nokia("Nokia", "G10", "Medium", "Gray", 99),
                new Nokia("Nokia", "G50", "Large", "Silver", 250),
                new Java_Programming_Muhtar.day030_InheritanceContiniu.PhoneTask.IPhone("IPhone", "Iphone 12 Pro", "Large", "Black", 1200),
                new Java_Programming_Muhtar.day030_InheritanceContiniu.PhoneTask.IPhone("IPhone", "Iphone 11 Pro Max", "Large", "Silver", 1100),
                new Samsung("Samsung", "Galaxy S18", "Medium", "White", 750),
                new Samsung("Samsung", "Galaxy S17", "Large", "Silver", 650),
                new Nokia("Nokia", "G10", "Medium", "Black", 99),
                new Java_Programming_Muhtar.day030_InheritanceContiniu.PhoneTask.IPhone("IPhone", "Iphone 6", "Smalle", "Gold", 400),
                new Java_Programming_Muhtar.day030_InheritanceContiniu.PhoneTask.IPhone("IPhone", "Iphone 7", "Smalle", "White", 500)
        };

        // model - color - price
        for (Phone eachPhone : phones) {
            System.out.println(eachPhone.getModel() + " - " + eachPhone.getColor() + " - " + eachPhone.getPrice());
        }

        System.out.println("----------------------------------------------------------------");

        int countIphone = 0;
        int countSamsung = 0;

        for (Phone each : phones) {
            if (each instanceof Java_Programming_Muhtar.day030_InheritanceContiniu.PhoneTask.IPhone) { // if the phone object is Iphone
                countIphone++;
            }

            if (each instanceof Samsung) { // if the phone is samsung
                countSamsung++;
            }
        }

        System.out.println(countIphone);
        System.out.println(countSamsung);

        System.out.println("----------------------------------------------------");

        for (Phone each : phones) {
            if (each instanceof IPhone || each instanceof Samsung) {// if the phone is iphone or samsung
                if (each.getPrice() >= 700){
                    System.out.println(each.getModel());
                }
            }
        }

    }
}
