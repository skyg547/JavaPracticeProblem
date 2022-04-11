package Chapter14;

import java.util.function.IntSupplier;

public class SupplierExample {

    public static void main(String[] args) {
        IntSupplier supplier = () -> {
            int num = (int) (Math.random() * 10);
            return num;
        };

        int num = supplier.getAsInt();

        System.out.println("Random number: " + num);
    }
}
