package Chapter13;

public interface Storage<T> {
    public void add(T item, int index);
    public T get(int index);
    public void remove(int index);
    public int size();
}
