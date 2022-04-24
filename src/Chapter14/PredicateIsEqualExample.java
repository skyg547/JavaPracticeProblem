package Chapter14;

import java.util.function.Predicate;

public class PredicateIsEqualExample {

    public static void main(String[] args) {
        Predicate<String> predicate = Predicate.isEqual(null);

        System.out.println(predicate.test(null));
        System.out.println(predicate.test(""));

        Predicate<String> predicate2 = Predicate.isEqual("");
        System.out.println(predicate2.test(""));
        System.out.println(predicate2.test(null));


    }

}
