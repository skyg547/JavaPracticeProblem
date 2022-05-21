package CollectionFrameWork;

import Chapter14.Fruit;

public class DescendingCompartor implements java.util.Comparator<Fruit> {

    @Override
    public int compare(Fruit o1, Fruit o2) {
        if(o1.getPrice() > o2.getPrice()) return -1;
        else if(o1.getPrice() < o2.getPrice()) return 1;
        else return 0;
    }
}
