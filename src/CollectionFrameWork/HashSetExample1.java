package CollectionFrameWork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("A");

        int size = set.size();
        System.out.println("Size of HashSet is: " + size);

        Iterator<String> itr = set.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        set.remove("A");

        System.out.println("After removing A");

        System.out.println(set.size());
        itr = set.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        set.clear();
        System.out.println("After clearing");
        System.out.println(set.size());
    }
}
