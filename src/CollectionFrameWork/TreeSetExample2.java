package CollectionFrameWork;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(10);
        ts.add(20);
        ts.add(30);
        ts.add(40);
        ts.add(50);
        ts.add(15);

        NavigableSet<Integer> ns = ts.descendingSet();
        for (Integer i : ns) {
            System.out.println(i);
        }

        System.out.println("-------------------------------");
        NavigableSet<Integer> ns2 = ts.subSet(10, true, 40, true);
        for (Integer i : ns2) {
            System.out.println(i);
        }
        System.out.println("-------------------------------");
        NavigableSet<Integer> ns1 = ns.descendingSet();

        for (Integer i : ns1) {
            System.out.println(i);
        }


    }
}
