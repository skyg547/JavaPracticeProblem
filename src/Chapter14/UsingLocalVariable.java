package Chapter14;

public class UsingLocalVariable {
    void method(int arg) { // arg는 final 특성을 가진다
        int localVar = 40; //localVar는 final 특성을 가진다 자바 1.8 이상 부터

        //arg = 31 ; //컴파일 오류

        MyFunctionalInterface myFunctionalInterface = () -> {
          // 로컬 변수 읽기
            System.out.println(localVar);
            System.out.println(arg);

        };

        myFunctionalInterface.method();

    }

    public static void main(String[] args) {
        new UsingLocalVariable().method(31);
    }
}
