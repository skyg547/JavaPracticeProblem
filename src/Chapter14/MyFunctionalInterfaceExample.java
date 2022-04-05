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
    }
}
