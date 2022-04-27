package CollectionFrameWork;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExmaple {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        int size = list.size();
        System.out.println("Size of list is : " + size);
        System.out.println();

        String skip = list.get(2);
        System.out.println("Element at index 2 is : " + skip);
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println("Element at index " + i + " is : " + str);
        }
        System.out.println();

        list.remove(2);
        System.out.println("After removing element at index 2 : ");
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
        }
        list.remove("A");
        System.out.println("After removing element A : ");
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
        }
    }
}
