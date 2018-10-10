package _02_static;

public class HelloWorld {

    public String message="Hoş geldiniz";

    //değişken instance değişkendir.İnstance değişkenler objeye aittir.
    //Static ve method içerisinde tanımlı olmayan değişkenler instance dır.

    public static void main(String[] args) {

       //****iNSTANCE METHODLAR VE DEĞİŞKENLERE DİREKT OLARAK ERİŞİM SAĞLANAMAZ.

      //  System.out.println(helloWorld.message);     //***** LEGAL DEĞİLDİR.


        HelloWorld helloWorld=new HelloWorld();
        System.out.println(helloWorld.message);      //Obje oluşturulup daha sonra erişim sağlandı.
    }
}
