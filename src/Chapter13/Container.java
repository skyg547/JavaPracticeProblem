package Chapter13;


public class Container<K, V> {

    private K key; // generic type
    private V Value;
    public void set(K key, V value){
        this.key = key;
        this.Value = value;
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return Value;
    }

    public static void main(String[] args) {
        Container<String, String> c = new Container<>();
        c.set("key", "value");
        System.out.println(c.getKey());
        System.out.println(c.getValue());
    }

//
//    public static void main(String[] args) {
//
//        Container<String> container1 = new Container<>();
//        container1.set("Hello");
//        String str = container1.get();
//        System.out.println(str);
//
//        Container<Integer> container2 = new Container<>();
//        container2.set(100);
//        Integer i = container2.get();
//        System.out.println(i);
//
//    }

}
