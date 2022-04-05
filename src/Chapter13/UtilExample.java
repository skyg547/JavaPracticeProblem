package Chapter13;

public class UtilExample {

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Hello", 5);
        Integer age = Util.getValue(pair, "Hello");

        System.out.println(age);

        ChildPair<String, Integer> childPair = new ChildPair<>("Hello2", 10);
        Integer age2 = Util.getValue(childPair, "Hel3lo2");
        System.out.println(age2);


    }
}
