package _01_String;

public class Example_03 {

    public static void main(String[] args) {

        String name=new String("elma");  //new anahtar kelimesi ile her zaman yeni bir obje oluşur.

        //Burada 2 tane obje oluşur.
        //String pool da
        //Non pool heap

        //değişken her zaman non-pool u gösterir.

        String str2=new String("elma");

        //burada 1 tane obje oluşur.
        //String pool da zeten mevcut sadece non-pool(heap) te oluşur.

        System.out.println(name==str2); //false ikisi farklı objelere işaret eder.



    }

}
