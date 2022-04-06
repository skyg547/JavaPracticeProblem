package Chapter14;

public class UsingThis {

    public int outerField = 10;

    class Inner {
        int innerField = 20;

        void method() {

            MyFunctionalInterface myFunctionalInterface = () -> {
                System.out.println("outerField = " + UsingThis.this.outerField); // 바깥 객체의 참조를 얻기 위해서는 클래스명 this 사용
                System.out.println("outerField = " + outerField);

                System.out.println("innerField = " + this.innerField); // 람다식 내부에서 this 는 inner를 참조
                System.out.println("innerField = " + innerField);

            };
            myFunctionalInterface.method();
        }

    }
}
