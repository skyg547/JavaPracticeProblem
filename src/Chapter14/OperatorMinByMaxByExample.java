package Chapter14;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxByExample {
    public static void main(String[] args) {

        BinaryOperator<Fruit> binaryOperator = BinaryOperator.minBy((f1,f2) ->Integer.compare((f1.getPrice()),(f2.getPrice())));
        Fruit friut1 = binaryOperator.apply(new Fruit("Apple", 10), new Fruit("Orange", 20));
        System.out.println(friut1.getName());

        BinaryOperator<Fruit> binaryOperator1 = BinaryOperator.maxBy((f1,f2) ->Integer.compare((f1.getPrice()),(f2.getPrice())));
        Fruit friut2 = binaryOperator1.apply(new Fruit("Apple", 10), new Fruit("Orange", 20));
        System.out.println(friut2.getName());
    }
}
