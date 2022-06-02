package Stream;

import java.rmi.StubNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {
    public static void main(String[] args) {
        // 숫자 요소 일 경우
        IntStream intStream = Arrays.stream(new int[] { 1, 2, 3, 4, 5 });

        intStream.sorted().forEach(num -> System.out.println(num));

        System.out.println("==================================================");

        //객체 요소일 경우
        List<Student> students = Arrays.asList(new Student("홍길동", 10), new Student("임꺽정", 20), new Student("유관순", 30));

        students.stream().sorted().forEach(student -> System.out.println(student.getName() + " : " + student.getScore()));

        students.stream().sorted(Comparator.reverseOrder()).forEach(student -> System.out.println(student.getName() + " : " + student.getScore()));
    }

}
