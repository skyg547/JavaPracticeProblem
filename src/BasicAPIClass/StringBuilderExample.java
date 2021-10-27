package BasicAPIClass;

public class StringBuilderExample {

    public static void main(String[] args) {
        String str = "";
        for (int i = 1; i <= 100; i++) {

            str += i;

        }
        System.out.println(str);

        StringBuilder strBuider = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            strBuider.append(i);
        }
        System.out.println(strBuider);

    }
}
