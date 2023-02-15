package Java_Programming_Muhtar.day006_IfStatements;

public class NumberToWord {
    public static void main(String[] args) {

        int num = 52; // 1~~9
        String result = " ";
        if (num==1){ result = "One";
        } else if (num==2) { result = "Two";
        } else if (num==3) { result = "Three";
        } else if (num==4) { result = "Four";
        } else if (num==5) { result = "Five";
        } else if (num==6) { result = "Six";
        } else if (num==7) { result = "Seven";
        } else if (num==8) { result = "Eight";
        } else if (num==9) { result = "Nine";
        } else { result = "NO VALID NUMBER.";
        }
        System.out.println(result);
    }
}
