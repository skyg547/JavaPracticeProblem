public class ActionExample {

    public static void main(String[] args) {

        Action action = () -> System.out.println("복사를 합니다.");

//      람다 바꾸기 전
//        new Action() {
//            @Override
//            public void work() {
//                System.out.println("복사를 합니다.");
//
//            }
//        };
        action.work();


    }


}