package Stream;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExample {
    public static void main(String[] args) {
        List<Student> totalList = Arrays.asList(new Student("홍길동", 10, "MALE"), new Student("홍길동", 10, "MALE"),
                new Student("홍길동", 10, "MALE"));

        MaleStudent maleStudent = totalList.stream().filter(s->s.getSex().equals("MALE")).collect(MaleStudent :: new, MaleStudent :: accumlate, MaleStudent :: combine);

        maleStudent.getList().stream().forEach(s->System.out.println(s.getName()));
    }

}