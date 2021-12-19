package Chapter12;

public class ThreadExample10 {
    public static void main(String[] args) {
        Thread thread = new MovieThread();
        thread.setDaemon(true);

        thread.start();

        try{
            Thread.sleep(3000);
        } catch (InterruptedException e){}

    }

}

