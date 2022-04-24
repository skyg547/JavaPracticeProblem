package Chapter14;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferencesExample {
    public static void main(String[] args) {
        ToIntBiFunction<String, String> function;

        function = (a,b) -> a.compareToIgnoreCase(b);
        print(function.applyAsInt("JAVA7", "JAVA8"));
    }

    public static void print(int order) {
        if(order < 0) {
            System.out.println("a comes before b");
        }
        else if(order == 0) {
            System.out.println("a and b are the same");
        }
        else {
            System.out.println("b comes before a");
        }
    }
}
