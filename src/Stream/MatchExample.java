package Stream;

import java.util.Arrays;

public class MatchExample {
    public static void main(String[] args) {
        int[] intArray = {2,4,6,8,10};
        
        boolean result = Arrays.stream(intArray).allMatch(predicate -> predicate % 2 == 0);
        System.out.println("is 2,4,6,8,10 all even? : " + result);

        result = Arrays.stream(intArray).anyMatch(predicate -> predicate % 2 == 0);
        System.out.println("is 2,4,6,8,10 any even? : " + result);

        result = Arrays.stream(intArray).noneMatch(predicate -> predicate % 7 == 0);
        System.out.println("is 2,4,6,8,10 none 7? : " + result);
    }
}
