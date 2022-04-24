package Chapter14;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class ConstructorReferenceExample {

    public static void main(String[] args) {
        Function<String, String> f = String::new;
        String s = f.apply("Hello");
        System.out.println(s);
    }
}
