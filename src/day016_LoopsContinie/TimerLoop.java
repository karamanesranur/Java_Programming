package Java_Programming_Muhtar.day016_LoopsContinie;

public class TimerLoop {
    public static void main(String[] args)throws InterruptedException {



        for (int m = 2; m >=0 ; m--) {

            for (int s = 59; s >= 0 ; s--) {
                System.out.println(m + " minute " + s + " seconds ");
                Thread.sleep(100);
            }

        }
























    }
}
