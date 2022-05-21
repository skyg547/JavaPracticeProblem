package CollectionFrameWork;

import Chapter14.Fruit;

import java.util.TreeSet;

public class CompatorExample {
    public static void main(String[] args) {
        TreeSet<Fruit> treeSet = new TreeSet<>(new DescendingCompartor());
        treeSet.add(new Fruit("Apple", 200));
        treeSet.add(new Fruit("Banana", 305));
        treeSet.add(new Fruit("Orange", 100));

        for (Fruit fruit : treeSet) {
            System.out.println(fruit.getName() + ":" + fruit.getPrice());
        }
    }

}

