package Chapter13;

public class Util {

    public static <T> Box<T> boxing(T t) {

        Box<T> box = new Box<>();

        box.setT(t);
        return box;
    }

    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {

        boolean keyCompare = p1.getKey().equals(p2.getKey());
        boolean valueCompare = p1.getValue().equals(p2.getValue());
        return keyCompare && valueCompare;

    }

    public static <T extends Number> int compare(T t1, T t2) {

        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();

        return Double.compare(v1, v2);
    }

//    public static <K, V> V getValue(Pair<K, V> t1, K t2) {
//
//        return t1.getKey() == t2 ? t1.getValue() : null;
//    }

    public static <P extends Pair<K, V>,K, V> V getValue(P t1, K t2) {

        return t1.getKey() == t2 ? t1.getValue() : null;
    }
}
