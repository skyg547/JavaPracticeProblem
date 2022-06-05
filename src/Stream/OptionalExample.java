package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        /*
         * 예외 발생
         * 
         * double avg
         * =list.stream().mapToint(Integer::intValue).average().getAsDouble();
         * 
         */

        // 방법 1

        OptionalDouble OptionalDouble = list.stream().mapToInt(Integer::intValue).average();

        if (OptionalDouble.isPresent()) {
            System.out.println(OptionalDouble.getAsDouble());
        } else {
            System.out.println("No value");

        }

        // 방법 2
        double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println("avg : " + avg);

        //방법3 
        list.stream().mapToInt(Integer::intValue).average().ifPresent(System.out::println);
        
    }

}