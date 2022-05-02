package CollectionFrameWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("A", 4);

        System.out.println(map);
        System.out.println("Size of map: " + map.size());

        //객체 찾기
        System.out.println("Value of key A: " + map.get("A"));

        //객체를 하나씩 처리
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());

        }
        //객체 삭제
        map.remove("A");
        System.out.println("Size of map: " + map.size());

        //객체를 하나씩 처리
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        //객체 전체 삭제
        map.clear();
        System.out.println("Size of map: " + map.size());
    }
}
