package BasicAPIClass;

import java.util.regex.Pattern;

public class FindAndReplaceExample {
    public static void main(String[] args) {
        String str = "모든 프로그램은 자바 언어로 개발될 수 있다.";
       // int index = Pattern.matches("?자?바", str);
        System.out.println(str.indexOf("자바"));
        int index = str.indexOf("자바");

        if(index == -1){
            System.out.println("자바 문자열이 포함되어 있지 않습니다. ");
        } else {
            System.out.println("자바 문자열이 포함되어 있습니다");
            str = str.replaceAll("자바", "java");
            System.out.println("-->" + str);
        }
    }
}
