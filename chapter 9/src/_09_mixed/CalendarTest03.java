package _09_mixed;

import java.util.Calendar;

public class CalendarTest03 {

    public static void main(String[] args) {

        String [] months={"Jan","Feb","Mar","April","May","Jun","Jul","Aug","Sep","Oct ","Nov","Dec"};

        Calendar cal=Calendar.getInstance();

        System.out.print("Date :");
        System.out.print(months[cal.get(Calendar.MONTH)]);
        System.out.print(cal.get(Calendar.DAY_OF_WEEK) + " ");
        System.out.println(cal.get(Calendar.YEAR) +" ");

        System.out.print("Time : ");
        System.out.print(cal.get(Calendar.HOUR )+" ");
        System.out.print(cal.get(Calendar.MINUTE)+" ");
        System.out.println(cal.get(Calendar.SECOND)+" ");

        cal.set(Calendar.HOUR,13);
        cal.set(Calendar.MINUTE,11);
        cal.set(Calendar.SECOND,43);

        System.out.print("Updated Time :");
        System.out.print(cal.get(Calendar.HOUR)+" ");
        System.out.print(cal.get(Calendar.MINUTE)+" ");
        System.out.print(cal.get(Calendar.SECOND)+" ");

    }
}
