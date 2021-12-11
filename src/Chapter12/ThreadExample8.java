package Chapter12;

public class ThreadExample8 {

    public static void main(String[] args){
        Thread thread = new MovieThread();
        thread.start();

        try {
            Thread.sleep(1000);

        } catch (InterruptedException e){


        }
        thread.interrupt();
    }
}
