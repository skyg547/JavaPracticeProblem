package Chapter13;

public class BoxExample {

    public static void main(String[] args) {
        Box box = new Box();
        box.setObject("홍길동");

        String name = (String) box.get(); // 강제 타입 변환


        box.setObject(new Apple()); // 자동 타입 변환
        Apple apple = (Apple)  box.get(); // 강제 타입 변환
    }
}
