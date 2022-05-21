package CollectionFrameWork;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<>();

        coinBox.push(new Coin(1));
        coinBox.push(new Coin(2));
        coinBox.push(new Coin(3));

        while (!coinBox.isEmpty()) {
            System.out.println(coinBox.pop());
        }
    }
}
