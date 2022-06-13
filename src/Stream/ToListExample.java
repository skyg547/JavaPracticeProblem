package Stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.ho.Main;

public class ToListExample {

    public static void main(String[] args) {
        List<Student> totalList = Arrays.asList(new Student("홍길동", 10), new Student("임꺽정", 20), new Student("유관순", 30),
                new Student("안중근", 40));

        // 10점 이상 리스트 생성
        List<Student> highScoreList = totalList.stream()
                .filter(student -> student.getScore() >= 10).collect(Collectors.toList());

        highScoreList.stream().forEach(student -> System.out.println(student.getName()));

        // 10 점 이상 리스트 해쉬 셋 생성 (중복 제거)
        Set<Student> hiStudents = totalList.stream()
                .filter(student -> student.getScore() >= 10).collect(Collectors.toCollection(HashSet::new));

        hiStudents.stream().forEach(student -> System.out.println(student.getName()));

    }
}
