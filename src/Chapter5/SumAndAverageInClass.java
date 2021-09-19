package Chapter5;

import java.util.Scanner;

public class SumAndAverageInClass {

    public static void main(String[] args) {
        boolean run = true;
        int studentNum = 0;
        int[] scores = null;
        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("--------------------------------------");
            System.out.println("1. 학생수 | 2.점수입력 | 3.점수리스트| 4. 분석 | 5. 종료");
            System.out.println("--------------------------------------");
            System.out.println("선택 >");

            int selectNo = scanner.nextInt();

            if (selectNo == 1) {
                System.out.println("학생 수 > ");
                scanner.nextInt();


            } else if (selectNo == 2) {
                scores = new int[studentNum];

                for (int i = 0; i < scores.length; i++) {
                    System.out.print("score[0]");

                }
                scanner.nextInt();


            } else if (selectNo == 3) {


            } else if (selectNo == 4) {


            } else if (selectNo == 5) {

                run = false;
                break;
            }
        }


        System.out.println("프로그램 종료");
    }
}
