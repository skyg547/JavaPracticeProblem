package Chapter14;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {

    public static void main(String[] args) {
        // Create a new bounded buffer with 10 slots
        Consumer<String> consumer = t-> System.out.println(t);
        consumer.accept("Hello");

        BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t + " " + u);
        biConsumer.accept("Hello", "World");

        DoubleConsumer doubleConsumer = t -> System.out.println(t);
        doubleConsumer.accept(1.0);

        ObjIntConsumer objIntConsumer = (t, u) -> System.out.println(t + " " + u);
        objIntConsumer.accept("Hello", 1);
    }
}
