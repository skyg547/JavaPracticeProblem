package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionExample{

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(new Student("g",54), new Student("gs",554), new Student("gh",58));

        Stream<Student> stream = list.stream();
        stream.forEach(s -> System.out.println(s.getName()+ " " + s.getScore()));
    }

}