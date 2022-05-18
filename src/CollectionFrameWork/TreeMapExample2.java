package CollectionFrameWork;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExample2 {

    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

        tm.put(1, "A");
        tm.put(2, "B");
        tm.put(3, "C");
        tm.put(4, "D");
        tm.put(5, "E");

        NavigableMap<Integer, String> ntm = tm.descendingMap();
        System.out.println("Descending Map");
        System.out.println(ntm);

        NavigableMap<Integer, String> ntm1 =  ntm.descendingMap();
        System.out.println("Ascending Map");
        System.out.println(ntm1);



    }
}
