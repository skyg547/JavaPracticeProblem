package Chapter13;

import java.util.ArrayList;
import java.util.List;

public class Generic {

    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("hello");
        String str = (String) list.get(0); // 타입변환 필수

        // 타입 변환 불필요
        List<String> genericList = new ArrayList<>();
        genericList.add("hello2");
        String genericString = genericList.get(0);

    }
}
