package Stream;

import java.util.Arrays;
import java.util.List;

public class StreamPipLinesExample {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(new Member("홍길동", Member.MALE, 3340), new Member("test", Member.FEMALE, 320),
                new Member("ha", Member.MALE, 30));

        double ageAvg = list.stream().filter(m->m.getSex() == Member.MALE).mapToInt(Member::getAge).average().getAsDouble();

        System.out.println("man average age " + ageAvg);

}

}
