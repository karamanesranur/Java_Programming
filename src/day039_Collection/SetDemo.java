package Java_Programming_Muhtar.day039_Collection;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(10,200,300,40,90));
        list.addAll(Arrays.asList(null,null,null,null,null));

        System.out.println("-----------------------------------------------");
        Set<Integer> set1 = new HashSet<>(); // order is random
        set1.addAll(Arrays.asList(10,200,300,40,90));
        set1.addAll(Arrays.asList(10,200,300,40,90));
        set1.addAll(Arrays.asList(10,200,300,40,90));
        set1.addAll(Arrays.asList(10,200,300,40,90));

        Set<Integer> set2 = new LinkedHashSet<>();

        Set<Integer>set3 =new TreeSet<>();
    }
}
