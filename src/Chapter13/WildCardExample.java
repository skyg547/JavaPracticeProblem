package Chapter13;

import BasicAPIClass.Student;

import java.util.Arrays;

public class WildCardExample {

    // 모든 과정
    public static void register(Course<?> course) {
        System.out.println(course.getName() + " 수강생: "
+ Arrays.toString(course.getStudents())
        );
    }

    // 학생 과정
    public static void registerCouresStudent(Course<? extends Student> course) {
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
    }

    // 직장인 과정과 일반인 과정 // 학생과 부모 클래스만 가능
    public static void registerCouresWorker(Course<? super Student> course) {
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
    }

    public static void main(String[] args) {
        Course<Student> course = new Course<Student>("자바 과정", 5);

//        course.addStudent(new Student("홍길동"));
//        course.addStudent(new Student("임꺽정"));


        register(course); // 모든 과정 등록 가능
        registerCouresStudent(course); // 학생 과정만 등록 가능
        registerCouresWorker(course); // 직장인 과정과 일반인 과정 등록 가능


    }
}
