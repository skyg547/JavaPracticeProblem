package Chapter13;

public class BoxExample {

    // 제네릭 변경 전
//    public static void main(String[] args) {
//        Box box = new Box();
//        box.setObject("홍길동");
//
//        String name = (String) box.get(); // 강제 타입 변환
//
//
//        box.setObject(new Apple()); // 자동 타입 변환
//        Apple apple = (Apple)  box.get(); // 강제 타입 변환
//    }

    /**
    * @package : Chapter13
    * @name : BoxExample.java
    * @date : 2022-02-13 오후 4:26
    * @author : H.sung.ho
    * @version : 1.0.0
    * @modifyed : 제네릭 변경 후
    **/
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();

        box.setT(6);
        System.out.println(box.getT());

    }
}
