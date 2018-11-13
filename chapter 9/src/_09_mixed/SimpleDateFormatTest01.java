package _09_mixed;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {

    public static void main(String[] args) {

        Date date=new Date();

        SimpleDateFormat sp=new SimpleDateFormat();       //31.10.2018 14:28
        System.out.println(sp.format(date));

        sp=new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        System.out.println(sp.format(date));              //2018.10.31 MS at 14:31:20 EET

        sp=new SimpleDateFormat("h:mm a");
        System.out.println(sp.format(date));             //2:32 PM

    }
}
