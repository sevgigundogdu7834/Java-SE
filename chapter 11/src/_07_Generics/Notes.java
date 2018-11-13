package _07_Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Notes {

    public static void main(String[] args) {

        //Jenerikler(Generics),veri tiplerini tek bir çatı altında toplayarak,kodun tekrar tekrar yazılmasını önleyen mekanizmalardır.
        // Jenerikler Java'ya JDK 5 ile eklenmiştir.

        List list=new ArrayList();
        list.add(100);
        list.add("String");
        list.add(34.4);

      // int number=(int) list.get(1);
       // System.out.println(number);           //java.lang.ClassCastException:

        //generic yapısı:

        //derleme zamanında tip kontrolü/type check sağlar.
        //cast etme işlemini ortadan kaldırır ve run time da hata almamızı engeller.

        List<Integer> listNumber=new ArrayList<Integer>();

        //public interface List<E> extends Collection<E> {
        //boolean add(E e);
        //E get(int index);

        listNumber.add(23);
        listNumber.add(56);
        listNumber.add(89);

        System.out.println(listNumber.get(2));        //89



    }
}
