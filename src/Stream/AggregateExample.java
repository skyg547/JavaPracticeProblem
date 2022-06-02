package Stream;

import java.util.Arrays;

public class AggregateExample {
    public static void main(String[] args) {
        long count = Arrays.stream(new int[] {2,4,6,8,10}).filter(n->n%2 ==0).count();
        System.out.println("count : " + count);

        long sum = Arrays.stream(new int[] {1,2,3,4,5}).filter(predicate -> predicate % 2 == 0).sum();
        System.out.println("sum : " + sum);

        double average = Arrays.stream(new int[] {1,2,3,4,5}).filter(predicate -> predicate % 2 == 0).average().getAsDouble();
        System.out.println("average : " + average);

        int max = Arrays.stream(new int[] {1,2,3,4,5}).filter(predicate -> predicate % 2 == 0).max().getAsInt();
        System.out.println("max" + max);

        int min = Arrays.stream(new int[] {1,2,3,4,5}).filter(predicate -> predicate % 2 == 0).min().getAsInt();
        System.out.println("min" + min);

        int first = Arrays.stream(new int[] {1,2,3,4,5}).filter(predicate -> predicate % 2 == 0).findFirst().getAsInt();
        System.out.println("first" + first);
    }
}
