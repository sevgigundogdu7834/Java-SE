package _07_Generics;

import java.util.ArrayList;
import java.util.List;

public class MixedGenericsTest01 {

    public static void main(String[] args) {

        List<Integer> alist=new ArrayList<>();
        alist.add(10);
        alist.add(20);
       // alist.add("elma"); compile error
        //generic yapısı sadece compiler time da çalışmaktadır.
        //run time da generic yapısı silinir diamond işaretleri uçar.
        //böylece ilgili collection yapısı nonGeneric hale gelir.

        //****** NonGeneric yapısı ile Generic yapısını karıştırmayalım. Böylece hata almayız.

        addElement(alist);

        System.out.println(alist);         //[10, 20, elma, ayva sıkıntı çıkmadı.

        //ClassCastException hatası verir.
        for(int a:alist){

            System.out.println(a);
        }

    }

    public static void addElement(List nonGenerics){

        nonGenerics.add("elma");
        nonGenerics.add("ayva");
    }
}
