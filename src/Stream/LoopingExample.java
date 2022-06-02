package Stream;

import java.util.Arrays;

public class LoopingExample {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};

        System.out.println("peek를 마지막에 호출한 경우");
        Arrays.stream(intArray).filter(a->a%2 ==0).peek(System.out::println);// 동작 X

        System.out.println("최종 처리 메서드는 마지막에 호출한 경우");
        int total = Arrays.stream(intArray).filter(a->a%2 ==0).peek(System.out::println).sum();
        System.out.println("total : " + total);

        System.out.println("==================================================");
        System.out.println("forEach를 마지막에 호출한 경우");

        Arrays.stream(intArray).filter(a->a%2 ==0).forEach(System.out::println); // 최종처리 메서드로 동작 
    }
}
