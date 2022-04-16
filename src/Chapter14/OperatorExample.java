package Chapter14;

import java.util.function.IntBinaryOperator;

public class OperatorExample {

    private static int[] scores = {92, 95, 87};

    public static int maxOrMin(IntBinaryOperator operator){
        int max = operator.applyAsInt(scores[0], scores[1]);
        for (int i = 2; i < scores.length; i++) {
            max = operator.applyAsInt(max, scores[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Max: " + maxOrMin(Integer::max));
        System.out.println("Min: " + maxOrMin(Integer::min));
    }
}
