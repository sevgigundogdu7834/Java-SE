package _02_NullPointException;

public class NPE {

    public static void main(String[] args) {


        Person person=new Person();
        int uzunluk=person.getName().length();
        System.out.println(uzunluk);

        //Exception in thread "main" java.lang.NullPointerException
        //	at _02_NullPointException.NPE.main

        //person.getName() nulldur.
        //String name; instance değişkenlere java tarafından varsayılan olarak null değer assign edilir.
        //null değişken üzerinden length() methoduna gitmek istersek NULLPOİNTEXCEPTİON hatası alırız.
    }
}
