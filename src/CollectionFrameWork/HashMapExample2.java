package CollectionFrameWork;

import BasicAPIClass.Student;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<>();

        map.put(new Student("11", "John", 18, "Doe"), 1);
        map.put(new Student("11", "John", 18, "Doe"), 2);

        System.out.println(map);
    }
}
