package Chapter13;

import javafx.util.Pair;

public class Util {

    public static <T> Box<T> booxing(T t) {

        Box<T> box = new Box<>();

        box.setT(t);
        return box;
    }

    public static <K,V> boolean compare(Pair<K, V> p1, Pair<K,V> p2){

        boolean keyCompare = p1.getKey().equals(p2.getKey());
        boolean valueCompare = p1.getValue().equals(p2.getValue());
        return keyCompare && valueCompare;

    }
}
