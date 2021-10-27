package BasicAPIClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrintExample {

    public static void main(String[] args){

        Date now = new Date();
        System.out.println(new SimpleDateFormat("yyyy년 MM월 dd일 E요일 H시 m분").format(new Date(

        )));
    }
}
