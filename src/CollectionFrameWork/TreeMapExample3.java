package CollectionFrameWork;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExample3 {

    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("apple", new Integer(10));
        treeMap.put("cd", new Integer(30));
        treeMap.put("bar", new Integer(40));
        treeMap.put("fire", new Integer(20));
        treeMap.put("danger", new Integer(14));

        System.out.println("c-f 사이의 단어 검색");

        NavigableMap<String, Integer> reangeMap = treeMap.subMap("c", true, "f", true);
        System.out.println(reangeMap);
    }
}