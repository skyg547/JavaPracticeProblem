package Stream;

import java.util.stream.IntStream;

public class FromIntRangeExample {
    public static int sum;

    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1, 10);
        stream.forEach(i -> sum += i);
        System.out.println(sum);
    }
}
