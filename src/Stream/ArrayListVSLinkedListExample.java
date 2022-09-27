package Stream;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.sound.sampled.SourceDataLine;

public class ArrayListVSLinkedListExample {

    // 요소 처리
    public static void work(int value) {
    }

    // 병렬처리
    public static long testParallel(List<Integer> list) {
        long start = System.nanoTime();
        list.stream().parallel().forEach((action) -> work(action));
        long end = System.nanoTime();
        return end - start;
    }

    public static void main(String[] args) {
        // 소스 컬렉션
        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
            linkedList.add(i);

        }

        // 워밍업
        long arrayListListParallel = testParallel(arrayList);
        long linkedListParallel = testParallel(linkedList);

        arrayListListParallel = testParallel(arrayList);
        linkedListParallel = testParallel(linkedList);

        System.out.println(
                "성능 테스트 결과 : " + (arrayListListParallel < linkedListParallel ? "ArrayList" : "LinkedList") + "가 더 빠름");
    }
}
