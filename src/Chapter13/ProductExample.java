package Chapter13;

public class ProductExample {
    public static void main(String[] args) {

        Product<String, String> product1 = new Product<>();

        product1.setKind("SmartTv");
        product1.setModel("Samsung");

        String tv = product1.getKind();
        String model = product1.getModel();

        Product<String, String> product2 = new Product<>();

        product2.setKind("SmartCar");
        product2.setModel("Tesla");

        String car = product1.getKind();
        String model2 = product1.getModel();

        System.out.println(tv+ model + car+ model2);


    }
}
