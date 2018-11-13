package _01_date;

import java.util.Date;

public class Notes {

    public static void main(String[] args) {

        //java.util.Date;
        //java.util.Calendar;


        Date date=new Date();
        System.out.println(date);

        //Sat Oct 20 11:29:37 EET 2018

        System.out.println(date.getTime());

        //1540024414327

        //Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT
             //  * represented by this <tt>Date</tt> object.

        System.out.println(System.currentTimeMillis());

    }
}
