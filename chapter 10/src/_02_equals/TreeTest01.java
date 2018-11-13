package _02_equals;

public class TreeTest01 {

    public static void main(String[] args) {

        Tree meşe=new Tree(100,20,"Meşe");
        Tree gürgen=new Tree(140,24,"Gürgen");

        String name="Sevgi";
        String name1="Sevgi";

        System.out.println(meşe == gürgen);  //false -- iki obje heapte farklı alanlara işaret eder bundan dolayı false döner.
        System.out.println(meşe.equals(gürgen)); // false -- döner çünkü equals == gibi çalışır.
        System.out.println("______________________");

        System.out.println(name==name1);  // true - String pool da yer aldığından iki String objesi aynı alana işaret eder.
        System.out.println(name.equals(name1));
    }

    //equals methodunun contractları;

    //reflexive(yansımalı)
    //x.equals(x) -> true olmalıdır.

    //symetric/simetrik
    //x.equals(y) ise
    //y.equals(x) olmalıdır.

    //transitive(geçişli)
    //x.equals(y)
    //y.equals(z) ise
    //x.equals(z) olmalıdır.

    //consistent(tutarlı)
    //x.equals(y) true ise her zaman true olmalıdır.

    //null reference
    //x.equals(null) olmalıdır.
}
