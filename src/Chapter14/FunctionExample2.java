package Chapter14;

import BasicAPIClass.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionExample2 {

    private static List<Student> list = Arrays.asList(
            new Student("John", "Doe", 2 , ""),

            new Student("John", "Doe", 4, ""),

            new Student("John", "Doe", 6 , "")
    );

    public static double avg(ToIntFunction<Student> f) {
        return list.stream()
                .mapToInt(f)
                .average()
                .getAsDouble();
    }

    public static void main(String[] args) {
        System.out.println(avg(Student::getStudentAge));
    }
}
