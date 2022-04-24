package Chapter14;

import java.util.function.IntBinaryOperator;

public class MethodReferenceExample {

    public static void main(String[] args) {
        IntBinaryOperator operator;

        // 정적 메소드 참조
        operator = (x,y) -> Calculator.staticMethod(x,y);
        System.out.println(operator.applyAsInt(10,20));

        operator = Calculator::staticMethod;
        System.out.println(operator.applyAsInt(10,20));
        // 인스턴스 메소드 참조
        Calculator c = new Calculator();
        operator = c::instanceMethod;
        System.out.println(operator.applyAsInt(10,20));

        operator = (x,y) -> c.instanceMethod(x,y);
        System.out.println(operator.applyAsInt(10,20));


    }

}
