package Chapter12;

import java.util.function.DoubleToIntFunction;

public class MovieThread extends Thread {
    /**
     * 1번
     *
     */
//    @Override
//    public void run() {
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println("동영상을 재생합니다.");
//
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//            }
//
//        }
//
//    }

    /**
     * 8번
     */




    @Override
    public void run(){
        while (true){

            System.out.println("동영상을 재생합니다");

            // 방법 1
            try {
                Thread.sleep(1);
            } catch (Exception e){

                break;
            }
            // 방법 2
            // this.isInterrupted() 같다
            if(Thread.interrupted()){
                break;

            }

        }


    }

    // 10
//    @Override
//    public void run(){
//
//        while (true){
//
//            System.out.println("동영상을 재생합니다");
//
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {}
//        }
//    }


}
