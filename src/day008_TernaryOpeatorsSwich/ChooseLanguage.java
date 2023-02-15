package Java_Programming_Muhtar.day008_TernaryOpeatorsSwich;

public class ChooseLanguage {
    public static void main(String[] args) {
        /*
        reate a class called ChooseLanguage,
 		Given an integer variable named selection that has a number between 1~5.
 		Write a program that can select the language based on the number
 		that's given in selection and prints the following message:

			for 1: Hello, thank for your call
			for 2: Hola, gracias para llamar
			for 3: Merhaba, aradiginiz icin tesekkurler
			for 4: Privet, spasibo za vash zvonok
			for 5: Merci ,pour votre appel

			for any other numbers print "Invalid Number"

		Solution 1: Must use ternary
		Solution 2:	MUST use switch statement

         */

        int a = 9;
        String result = "";
      /*
        String Language =(a >= 1 &&  a <=5)?
                (a == 1)?"Hello, thank for your call":
                (a == 2)?"Hola, gracias para llamar":
                 (a == 3)?"Merhaba, aradiginiz icin tesekkurler":
                 (a == 4)?"Privet, spasibo za vash zvonok":
                         "Merci ,pour votre appel" :"Invalid Language";
        System.out.println("Language = " + Language);
        */

        switch (a ){
            case 1 :
              result =  "Hello, thank for your call";
              break;
            case 2 :
                result = "Hola, gracias para llamar";
                break;
            case 3 :
                result =  "Merhaba, aradiginiz icin tesekkurler";
                break;
            case 4 :
                result = "Privet, spasibo za vash zvonok";
                break;
            case 5 :
                result = "Merci ,pour votre appel";
                break;
            default:
                result="Invalid Language";
        }
        System.out.println("result = " + result);

    }
}
