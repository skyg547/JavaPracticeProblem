package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
    public static void main(String[] args) {
        List<reMakeStudent> totalList = Arrays.asList(
                new reMakeStudent("홍길동", 10, reMakeStudent.Sex.MALE, reMakeStudent.City.Seoul),
                new reMakeStudent("김동주", 14, reMakeStudent.Sex.FEMALE, reMakeStudent.City.Pusan),
                new reMakeStudent("하징더", 12, reMakeStudent.Sex.FEMALE, reMakeStudent.City.Pusan),
                new reMakeStudent("오쟝가", 11, reMakeStudent.Sex.MALE, reMakeStudent.City.Seoul));

        Map<reMakeStudent.Sex, List<reMakeStudent>> mapBySex = totalList.stream()
                .collect(Collectors.groupingBy(reMakeStudent::getSex));

        System.out.println("남학생");
        mapBySex.get(reMakeStudent.Sex.MALE).stream().forEach((s) -> System.out.println(s.getName() + " "));
        System.out.println();

        System.out.println("여학생");
        mapBySex.get(reMakeStudent.Sex.FEMALE).stream().forEach((s) -> System.out.println(s.getName() + " "));

        System.out.println();

        Map<reMakeStudent.City, List<String>> mapByCity = totalList.stream().collect(Collectors
                .groupingBy(reMakeStudent::getCity, Collectors.mapping(reMakeStudent::getName, Collectors.toList())));

        System.out.println("서울");
        mapByCity.get(reMakeStudent.City.Seoul).stream().forEach(s -> System.out.println(s + " "));
        System.out.println();

        System.out.println("부산");
        mapByCity.get(reMakeStudent.City.Pusan).stream().forEach(s -> System.out.println(s + " "));
    }

}
