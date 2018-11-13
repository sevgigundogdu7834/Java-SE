package _09_mixed;

import java.util.Date;

public class DateTest01 {

    public static void main(String[] args) {

        Date date=new Date();

        System.out.println(date.toString());     //Wed Oct 31 12:14:45 EET 2018
        System.out.println(date);

        System.out.println("timestamp : "+date.getTime());     // timestamp : 1540977361390
        System.out.println(System.currentTimeMillis());        //1540977386741

    }
}
