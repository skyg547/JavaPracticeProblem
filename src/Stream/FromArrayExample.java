package Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class FromArrayExample{

    public static void main(String[] args) {
        Student[] students = {new Student("g",54), new Student("gs",554), new Student("gh",58)};
        
        Stream<Student> stream = Arrays.stream(students);
        stream.forEach(s -> System.out.println(s.getName()+ " " + s.getScore()));
    }

}