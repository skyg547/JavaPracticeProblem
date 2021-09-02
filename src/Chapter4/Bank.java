package Chapter4;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        boolean run = true;
        int balacne = 0;

        System.out.println("--------------");
        System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4, 종료");
        System.out.println("--------------");

        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.print("선택> ");
            int act = scanner.nextInt();

            switch (act) {
                case 1:
                    System.out.print("예금액>");
                    int inputMoney = scanner.nextInt();
                    balacne += inputMoney;
                    break;
                case 2:
                    System.out.print("출금액>");
                    int outputMoney = scanner.nextInt();
                    balacne -= outputMoney;
                    break;
                case 3:
                    System.out.print("잔고>" + balacne);
                    break;
                case 4:
                    run = false;
                    break;
            }
        }
        System.out.println("프로그램 종료 ");
    }
}
