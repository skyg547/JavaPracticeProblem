package Chapter12;

public class ThreadExample {

    public static void main(String[] args) {
        Thread thread1 = new MovieThread();

        thread1.start();

        Thread thread2 = new Thread(new MusicRunnalbe());
        thread2.start();
    }
}
