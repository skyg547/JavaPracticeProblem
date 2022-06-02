package Stream;

import java.util.Arrays;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("홍길동", 10), new Student("임꺽정", 20), new Student("유관순", 30));
        
        students.stream().mapToInt(Student::getScore).forEach(System.out::println);
 
    }
}
