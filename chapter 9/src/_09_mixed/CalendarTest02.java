package _09_mixed;

import java.util.Calendar;

public class CalendarTest02 {

    public static void main(String[] args) {


        Calendar calendar= Calendar.getInstance();

        System.out.println(calendar);

        System.out.println(calendar.get(Calendar.YEAR));            //2018
        System.out.println(calendar.get(Calendar.HOUR));            //0
        System.out.println(calendar.get(Calendar.MONTH));           //9
        System.out.println(calendar.get(Calendar.MILLISECOND));     //757
        System.out.println(calendar.get(Calendar.FRIDAY));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
    }
}
