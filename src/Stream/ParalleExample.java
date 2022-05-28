package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParalleExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");

        Stream<String> stream = list.stream();
        Stream<String> stream2 = list.parallelStream();

        stream.forEach(ParalleExample::print);
        stream2.forEach(ParalleExample::print);

    }

    public static void print(String s){
        System.out.println(s+ ":" + Thread.currentThread().getName());
    }
}
