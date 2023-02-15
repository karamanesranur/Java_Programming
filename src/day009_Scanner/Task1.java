package Java_Programming_Muhtar.day009_Scanner;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many people do you live with?");
        int people=input.nextInt();
        input.close(); // we no longer need scanner after this line
        String howMany="";

      if (people >= 1) {
          if (people < 3) {
              howMany = "Live with less than 3 people";
          } else if (3 <= people && people <= 6) {
              howMany = "Live with 3 - 6 people";

          } else {
              howMany = "Live with \"more than 6 people";
          }
      }

        System.out.println(howMany);
        /*
         Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"


         */
    }
}
