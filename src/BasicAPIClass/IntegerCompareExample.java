package BasicAPIClass;

public class IntegerCompareExample {
    public static void main(String[] args) {
        Integer obj1 = 100;
        Integer obj2 = 100;
        Integer obj3 = 300;
        Integer obj4 = 300;

        System.out.println(obj1 == obj2);

        System.out.println(obj3 == obj4);
        // -127 -128 까지는 박싱해서 비교 허용 이다 . 그래서 이걸 언박싱후 바꿔주어야 한다
    }
}
