package Java_Programming_Muhtar.day006_IfStatements;

public class ChooseLanguage {
    public static void main(String[] args) {
        /*
         Create a class named ChooseLanguage, Given an integer
          variable named selection that has
          a number between 1~5, Write a program that can
          select the language based on the number that's given
           in selection and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel

         */

        int a = 6;
       String result =" " ;

       boolean b = a >=1 || a<= 5 ;

       if(a==1){
           result = " Hello, thank for your call" ;
       }
        if(a==2){
            result = " Hola, gracias para llamar" ;
        }
        if(a==3){
            result = " Merhaba, aradiginiz icin tesekkurler" ;
        }

        if(a==4){
            result = " Privet, spasibo za vash zvonok " ;
        }
        if(a==5){
            result = " Merci ,pour votre appel" ;
        }else{
            result = "Don't Call Me!!!";
        }
        System.out.println(result);
    }
}
