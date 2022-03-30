package Chapter13;

public class CompareMethodExample {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("A", 1);
        Pair<String, Integer> p2 = new Pair<>("A", 1);

        boolean result = Util.<String, Integer>compare(p1, p2);

        if (result) {
            System.out.println("p1 is greater than p2");
        } else {
            System.out.println("p1 is less than p2");
        }

        Pair<String, Integer> p3 = new Pair<>("A", 1);
        Pair<String, Integer> p4 = new Pair<>("A", 1);

        boolean result2 = Util.compare(p1, p2);

        if (result2) {
            System.out.println("p1 is greater than p2");
        } else {
            System.out.println("p1 is less than p2");
        }

    }

}
