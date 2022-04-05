package Chapter13;

import java.awt.*;

public class ChildProductAndStorageExample {
    public static void main(String[] args) {
        ChildProduct<Box, String, String> product = new ChildProduct<>();

        product.setKind(new Box());
        product.setModel("Box");
        product.setCompany("");

        Storage<Box> storage = new StorageImplement<>(100);
        storage.add(new Box(), 11);
        Box box = storage.get(11);
        System.out.println(box.toString());
        System.out.println(product);
    }
}
