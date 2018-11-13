package _09_mixed;

import sun.util.calendar.LocalGregorianCalendar;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;

public class DateFormatTest04 {

    public static void main(String[] args) {

        Date date=new Date();

       DateFormat[] dfDizi=new DateFormat[5];

       dfDizi[0]=DateFormat.getInstance();                             //31.10.2018 14:19
       dfDizi[1]=DateFormat.getDateInstance(DateFormat.FULL);          //31 Ekim 2018 Çarşamba
       dfDizi[2]=DateFormat.getDateInstance(DateFormat.MEDIUM);        //31.Eki.2018
       dfDizi[3]=DateFormat.getDateInstance(DateFormat.LONG);          //31 Ekim 2018 Çarşamba
       dfDizi[4]=DateFormat.getDateInstance(DateFormat.SHORT);         //31.10.2018

       for(int i=0;i<dfDizi.length;i++){

           System.out.println(dfDizi[i].format(date));
       }

    }
}
