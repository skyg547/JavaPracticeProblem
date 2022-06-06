package Stream;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(new Student("홍길동", 91),
        new Student("제길동", 94),
        new Student("애길동", 93));

        // 방법 1 sum()
        int sum1 = studentList.stream().mapToInt(Student::getScore).sum();

        // 방법 2 reduce()
        int sum2 = studentList.stream().map(Student :: getScore).reduce((a,b)-> a+b).get();

        // 방법 3 reduce()
        int sum3 = studentList.stream().map(Student :: getScore).reduce(0, (a,b)-> a+b);

        System.out.println("sum1 : " + sum1);
        System.out.println("sum2 : " + sum2);
        System.out.println("sum3 : " + sum3);
    }
    
}
