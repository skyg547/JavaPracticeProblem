package Chapter14;

public class MyFunctionalInterfaceExample {

    public static void main(String[] args) {

        MyFunctionalInterface functionalInterface = () -> {
            String str = '\u00A9' + " " + "Java";
            System.out.println(str);

        };

        functionalInterface.method();

        functionalInterface = () -> {

            System.out.println("Hello World");
        };
        functionalInterface.method();

        functionalInterface = () -> System.out.println("Hello World");
        functionalInterface.method();


        MyFunctionalInterface2 functionalInterface2 = (x) -> {
            int result = x * x;
            System.out.println(result);

        };

        functionalInterface2.method(5);

        functionalInterface2 = x -> {
            System.out.println(x * x);
        };

        functionalInterface2.method(5);

        functionalInterface2 = x -> System.out.println(x * x);
        functionalInterface2.method(5);


        MyFunctionalInterface3 functionalInterface3 = (x, y) -> {
            int result = x * y;
            return result;
        };

        System.out.println(functionalInterface3.method(5, 6));

        functionalInterface3 = (x, y) -> {
            return x * y;
        };
        System.out.println(functionalInterface3.method(5, 6));

        functionalInterface3 = (x, y) -> x * y;
        System.out.println(functionalInterface3.method(5, 6));

        functionalInterface3 = (x, y) -> sum(x, y);
        System.out.println(functionalInterface3.method(5, 6));
    }

    public static int sum(int x, int y) {
        return x + y;
    }
}
