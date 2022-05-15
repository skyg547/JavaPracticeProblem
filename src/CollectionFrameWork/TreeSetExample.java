package CollectionFrameWork;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(new Integer(90));
        scores.add(new Integer(80));
        scores.add(new Integer(70));
        scores.add(new Integer(60));
        scores.add(new Integer(50));
        scores.add(new Integer(40));
        scores.add(new Integer(30));
        scores.add(new Integer(203));

        System.out.println("TreeSet: " + scores);

        System.out.println("TreeSet: " + scores.first());
        System.out.println("TreeSet: " + scores.last());
//        System.out.println("TreeSet: " + scores.pollFirst());
//        System.out.println("TreeSet: " + scores.pollLast());

        System.out.println("TreeSet: " + scores.lower(new Integer(50)));
        System.out.println("TreeSet: " + scores.higher(new Integer(50)));
        System.out.println("TreeSet: " + scores.floor(new Integer(50)));
        System.out.println("TreeSet: " + scores.ceiling(new Integer(50)));
        System.out.println("TreeSet: " + scores.headSet(new Integer(50)));

        while (scores.size() > 0) {
            System.out.println("TreeSet: " + scores.pollFirst());

        }

        System.out.println("TreeSet: " + scores);



    }
}
