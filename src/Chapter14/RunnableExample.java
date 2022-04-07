package Chapter14;

public class RunnableExample {
    public static void main(String[] args) {
        Runnable r =  () -> {
            for(int i = 0; i < 10; i++) {
                System.out.println("Hello from thread " + Thread.currentThread().getName());
            }
        };

        Thread t = new Thread(r);
        t.start();
    }
}
