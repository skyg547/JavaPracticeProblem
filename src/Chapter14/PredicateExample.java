package Chapter14;

import BasicAPIClass.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {


    private static List<Student> student = Arrays.asList(
            new Student("John", "Doe", 1, "M"),
            new Student("Jane", "Doe", 2, "F"),
            new Student("John", "Smith", 3, "M"),
            new Student("Jane", "Smith", 4, "F"),
            new Student("John", "Doe", 5, "M"),
            new Student("Jane", "Doe", 6, "F"),
            new Student("John", "Smith", 7, "M"),
            new Student("Jane", "Smith", 8, "F")
    );

    public static double avg(Predicate<Student> p) {
        int count = 0, sum = 0;
        for (Student s : student) {
            if(p.test(s)) {
                count++;
                sum += s.getStudentAge();

            }

        }
        return (double) sum / count;

    }

    public static void main(String[] args) {
        double avg = avg(s -> s.getStudentSex().equals("M"));
        System.out.println("Average age of " + avg);

    }


}
