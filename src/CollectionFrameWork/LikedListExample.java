package CollectionFrameWork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LikedListExample {
    public static void main(String[] args) {
        List list = new LinkedList();
        List arrayList = new ArrayList();

        long startTime = System.currentTimeMillis();


        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println(startTime - endTime);
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println(endTime1 - endTime);
    }
}
