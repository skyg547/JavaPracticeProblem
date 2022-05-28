package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapAndReduceExample{
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(new Student("g",54), new Student("gs",554), new Student("gh",58));

        Double stream = list.stream().mapToInt(mapper -> mapper.getScore()).average().getAsDouble();

        System.out.println(stream);



    }


}