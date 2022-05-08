package CollectionFrameWork;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {


    public static void main(String[] args) {
        Map<Integer, String> map = new Hashtable<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the key to search");
            int key = sc.nextInt();
            if (map.containsKey(key)) {
                if (map.get(key) != null) {
                    System.out.println("Value is " + map.get(key));
                }
                System.out.println("Key found");
            }
            else {
                System.out.println("Key not found");
            }

        }
    }
}
