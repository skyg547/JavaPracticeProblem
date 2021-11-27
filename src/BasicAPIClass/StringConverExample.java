package BasicAPIClass;

public class StringConverExample {

    public static void main(String[] args) {
        String strData1 = "200";
        int intData1 = Integer.parseInt(strData1);

        int intData2 = 150;
        String strData2 = Integer.toString(intData2);

        System.out.println(intData1 +"|"+ strData2);

    }
}
