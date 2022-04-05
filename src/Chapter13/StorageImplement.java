package Chapter13;

public class StorageImplement<T> implements Storage<T> {
    private T[] array;
    public StorageImplement(int capacity) {
        this.array = (T[]) new Object[capacity];
    }

    @Override
    public void add(T item, int index) {
        array[index] = item;
    }

    @Override
    public T get(int index) {
        return array[index];
    }

    @Override
    public void remove(int index) {
        array[index] = null;
    }

    @Override
    public int size() {
        return array.length;
    }
}
