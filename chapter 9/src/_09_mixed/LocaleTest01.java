package _09_mixed;

import java.util.Locale;

public class LocaleTest01 {

    public static void main(String[] args) {

        Locale[] loc=Locale.getAvailableLocales();

        for(Locale a:loc){

            System.out.println(a);
        }

        Locale loc1=new Locale("tr","Turkey");
        System.out.println(loc1.getDisplayLanguage());
        System.out.println(loc1.getDisplayCountry());
    }
}
