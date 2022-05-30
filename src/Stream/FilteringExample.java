package Stream;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("adam", "adam", "adam", "anna", "jack", "jenny");

        names.stream().distinct().forEach(n -> System.out.println(n));

        System.out.println("--------------------------------");

        names.stream().filter(n -> n.startsWith("a")).forEach(n -> System.out.println(n));

        System.out.println("--------------------------------");
        names.stream().distinct().filter(predicate -> predicate.startsWith("a")).forEach(n -> System.out.println(n));

    }

}
