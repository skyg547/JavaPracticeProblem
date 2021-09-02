package Chapter4;

public class MathSumJava {
/*
*   챕터 : 4
*   주사위 문제 만들기
*
* */
    public static void main(String[] args) {
//        System.out.println("h2");

        int sum = 0;
        while(sum != 5){

            sum = ((int)(Math.random() * 6) + 1) + ((int)(Math.random() * 6) + 1); // 1 ~ 6
            System.out.println(sum);
        }



    }


}
