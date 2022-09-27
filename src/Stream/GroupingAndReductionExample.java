package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupingAndReductionExample {

    public static void main(String[] args) {
        List<reMakeStudent> totalList = Arrays.asList(
                new reMakeStudent("홍길동", 10, reMakeStudent.Sex.MALE),
                new reMakeStudent("김수애", 12, reMakeStudent.Sex.FEMALE),
                new reMakeStudent("신용권", 10, reMakeStudent.Sex.FEMALE),
                new reMakeStudent("박수미", 12, reMakeStudent.Sex.MALE));

        // 성별로 평균 점수를 저장하는 Map 얻기
        Map<reMakeStudent.Sex, Double> mapBySex = totalList.stream().collect(
                Collectors.groupingBy(reMakeStudent::getSex, Collectors.averagingDouble(reMakeStudent::getScore)));

        System.out.println("남한색 평균 점수" + mapBySex.get(reMakeStudent.Sex.MALE));

        System.out.println("여한색 평균 점수" + mapBySex.get(reMakeStudent.Sex.FEMALE));

        // 성별을 쉼표로 구분한 이름을 저장하는 Map 얻기
        Map<reMakeStudent.Sex, String> mapByName = totalList.stream().collect(Collectors.groupingBy(
                reMakeStudent::getSex, Collectors.mapping(reMakeStudent::getName, Collectors.joining(","))));
        System.out.println("남학생 전체 이름 " + mapByName.get(reMakeStudent.Sex.MALE));

        System.out.println("여학생 전체 이름 " + mapByName.get(reMakeStudent.Sex.FEMALE));

    }

}
