package Chapter14;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {

    public static void main(String[] args) {
        IntPredicate predicateA = a -> a%2 == 0;

        IntPredicate predicateB = a -> a%3 == 0;

        IntPredicate predicateC = a -> a%5 == 0;

        IntPredicate predicateABC;
        boolean result;

//        and()

        predicateABC = predicateA.and(predicateB).and(predicateC);

        result = predicateABC.test(15);
        System.out.println("15 is divisible by 2, 3 and 5: " + result);
    }
}
