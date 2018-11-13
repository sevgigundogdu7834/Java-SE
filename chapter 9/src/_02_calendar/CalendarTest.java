package _02_calendar;

import java.util.Calendar;

public class CalendarTest {

    public static void main(String[] args) {

        Calendar cal= Calendar.getInstance();
        System.out.println(cal);


        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH)); // [0 -11 ]
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //[1-7] 1->Sunday 7->Saturday


        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));
        System.out.println(cal.get(Calendar.MILLISECOND));

        cal.add(Calendar.MONTH,3);
        System.out.println(cal.get(Calendar.MONTH));

        cal.roll(Calendar.MONTH,4);
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.YEAR));

        //ROLL TAŞIRMAZ..şuan 24.10.2018 4 ay eklediğimizde 2019 a geçer.







    }

}
