package _05_Locales;

import java.util.Locale;

public class LocaleTest01 {

    public static void main(String[] args) {

        Locale [] locales=Locale.getAvailableLocales();

        int i=1;
        for(Locale loc:locales){

            System.out.println(i + " : " +loc);
            i++;


        }

      Locale localeTR=new Locale("tr","TR");
        System.out.println(localeTR.getDisplayLanguage());
        System.out.println(localeTR.getDisplayCountry());


    }
}
