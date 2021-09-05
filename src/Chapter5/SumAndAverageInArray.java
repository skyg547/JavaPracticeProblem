package Chapter5;

public class SumAndAverageInArray {

    public static void main(String[] args) {

        int[][] array = {

                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88},
        };

        int sum = 0;
        double avg ;
        int cnt = 0;
        for (int[] indexArray : array
        ) {
            for (int element : indexArray
            ) {
                sum += element;
                cnt += 1;
            }

        }

        avg = sum / (double) cnt;
        System.out.println("sum: " + sum);
        System.out.println("avg: " + avg);

    }
}

