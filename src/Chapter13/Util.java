package Chapter13;

public class Util {

    public static <T> Box<T> booxing(T t) {

        Box<T> box = new Box<>();

        box.setT(t);
        return box;
    }
}
