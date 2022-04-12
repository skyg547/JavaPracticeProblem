package Chapter14;

import BasicAPIClass.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample1 {

    private static List<Student> list = Arrays.asList(
            new Student("John"),
            new Student("Mary"),
            new Student("Peter"),
            new Student("Paul")
    );

    public static void printString(Function<Student, String> f) {
        list.forEach(s -> System.out.println(f.apply(s)));
    }

    public static void main(String[] args) {
        printString(Student::getSudentNum);
    }
}
