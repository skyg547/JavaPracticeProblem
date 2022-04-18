package Chapter14;

import BasicAPIClass.Member;

import java.util.function.Consumer;

public class ConsumerAndThenExample {

    public static void main(String[] args) {
        Consumer<Member> consumerA = (m) -> System.out.println("Consumer A" + m.toString());

        Consumer<Member> consumerB = (m) -> System.out.println("Consumer B" + m.hashCode());

        Consumer<Member> consumerAD = consumerA.andThen(consumerB);

        consumerAD.accept(new Member("John", "Doe"));
    }
}
