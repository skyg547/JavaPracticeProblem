package Stream;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {
        List<String> inputList1 = Arrays.asList("java 8", "java 9", "java 10");

        inputList1.stream().flatMap(mapper -> Arrays.stream(mapper.split(" "))).forEach(System.out::println);

        System.out.println("--------------------------------");

        List<String> inputList2 = Arrays.asList("10, 20, 30", "40, 50, 60");

        inputList2.stream().flatMapToInt(mapper -> {
            String[] strArr = mapper.split(",");
            int[] intArr = new int[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                intArr[i] = Integer.parseInt(strArr[i].trim());
            }
            return Arrays.stream(intArr);
        }).forEach(System.out::println);

    }

}
