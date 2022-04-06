package Chapter14;

public class UsingThisExample {
    public static void main(String[] args) {
        UsingThis u = new UsingThis();
        UsingThis.Inner i = u.new Inner();
        i.method();
    }
}
