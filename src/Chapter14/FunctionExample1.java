package Chapter14;

import BasicAPIClass.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {

    private final static List<Student> list = Arrays.asList(
            new Student( "2","John", 18, "F" ),
            new Student("3","Mary" , 13, "M"),
            new Student("4","Peter", 34, "M"),
            new Student("5", "Paul", 22, "M"),
            new Student("6", "Mike", 23, "M")


    );

    public static void printString(Function<Student, String> f) {
        list.forEach(s -> System.out.println(f.apply(s)));
    }

    public static void printInt(ToIntFunction<Student> f) {
        list.forEach(s -> System.out.println(f.applyAsInt(s)));


    }



    public static void main(String[] args) {
        printString(Student::getStudentNum);

        printInt(Student::getStudentAge);
    }
}
