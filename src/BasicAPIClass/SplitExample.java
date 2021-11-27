package BasicAPIClass;

import java.util.StringTokenizer;

public class SplitExample {

    public static void main(String[] args) {
        String str = "아이디, 이름, 패스워드";

        //방법 (split() 메소드 이용)
        String[] splitArray =str.split(",");

        for (String strs : splitArray
             ) {
            System.out.println(strs);

        }

        System.out.println();

        StringTokenizer st = new StringTokenizer(str, ",");

        while(st.hasMoreTokens()){

            System.out.println(st.nextToken());
        }
        //방법 2 (StringTokennizer 이용)
    }
}
