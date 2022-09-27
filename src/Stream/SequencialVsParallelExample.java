package Stream;

import java.util.Arrays;
import java.util.List;

public class SequencialVsParallelExample {

    // 요소 처리
    public static void work(int value) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
    }

    // 순차 처리
    public static long testSequencial(List<Integer> list) {
        long start = System.nanoTime();
        list.stream().forEach((a) -> work(a));
        long end = System.nanoTime();
        return end - start;
    }

    // 순차 처리
    public static long testParallel(List<Integer> list) {
        long start = System.nanoTime();
        list.parallelStream().forEach((a) -> work(a));
        long end = System.nanoTime();
        return end - start;
    }

    public static void main(String[] args) {
        // 소스컬렉션
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        // 순차 스트림 처리 시간 구하기
        long timeSequencial = testSequencial(list);
        // 병렬 스트림 처리 시간 구하기
        long timeParallel = testParallel(list);

        System.out.println("성능 테스트 결과 " + (timeSequencial < timeParallel ? "순차 처리" : "병럴 처리") + "가 더 빠름");
    }
}
