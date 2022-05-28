package Stream;


import java.util.Arrays;
import java.util.List;

public class LambdaExpressionsExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(new Student("g",54), new Student("gs",554), new Student("gh",58));
        list.stream().filter(s -> s.getScore() > 50).forEach(s -> System.out.println(s.getName()+ " " + s.getScore()));
    }
}
