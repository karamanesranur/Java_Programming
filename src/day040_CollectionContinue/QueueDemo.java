package Java_Programming_Muhtar.day040_CollectionContinue;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<Integer> queue1 = new PriorityQueue<>();
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        queue1.addAll(Arrays.asList(10,200,300,40,90));
      //  queue1.addAll(Arrays.asList(null, null, null));

        System.out.println(queue1);

       int num1 =  queue1.poll();  // ===> FIFO
        System.out.println(queue1);

        Queue<Integer> queue2 = new ArrayDeque<>();

        Queue<Integer> queue3 = new LinkedList<>();

        System.out.println("-------------------------------------------------");








    }
}
