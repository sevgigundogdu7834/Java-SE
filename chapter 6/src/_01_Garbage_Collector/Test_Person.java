package _01_Garbage_Collector;

public class Test_Person {

    public static void main(String[] args) {

        Person person=new Person("Sevgi","Gündoğdu");

        //
        //
        //

        person=null;

        //Bu adıma kadar person referans değişkeni heapteki objeyi göstermektedir.
        //objenin bir sahibi olduğu için obje bu adıma kadar temizlenmez/silinemz.
        //Burada person=null yaptığımız zaman aradaki bağlantı kopar Obje sahipsiz kalır.
        //Bu adımdan sonra obje temizlenme/silinmeye uygun hale gelecektir.
        //Ancak hemen bu adımdan sonra temizleneceğin bir garantisi yoktur.
        //

    }
}
