package BasicAPIClass;

import java.util.regex.Pattern;

public class PatternMatcherExample {
    public static void main(String[] args) {
        String id = "dAngel1004";
        String regExp = "[a-zA-z]\\w{8,12}";

        boolean isMatch = Pattern.matches(regExp,id);
        if(isMatch){
            System.out.println("ID로 사용할수 있습니다.");

        } else {

            System.out.println("ID로 사용할수 없습니다.");
        }
    }

}
