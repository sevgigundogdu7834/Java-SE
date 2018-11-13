package _05_NestedClass;

public class OuterClass {

    //Outer class İnner Class' ın private değişkenlere erişim sağlayabilir.
    //İnner Class Outer Class' ın private değişkenlerine erişim sağlayabilir.

    private String userName="user 1";
    private static String password="1234";


    private class RegularInnerClass{

        private String surname="Öztürk";
       // private static int age="21";        // Static değişken tanımlanamaz.
          //OuterClass§RegularInnerClass
        private void getUserName(){

            System.out.println(userName);
        }


    }

    protected static class StaticInnerClass{


        //OuterClass§StaticInnerClass

        private static int age=23;

        //Static nested class içerisinde static değişkenler tanımlanabilir.
    }

    public static void main(String[] args) {

        OuterClass outer=new OuterClass();

        System.out.println(outer.userName);

      //  RegularInnerClass regularInnerClass=new RegularInnerClass();
        // compiler error Önce Outer class türünde obje oluşup daha sonra erişilmelidir.

        OuterClass.RegularInnerClass regularInnerClass=new OuterClass().new RegularInnerClass();

        RegularInnerClass regularInnerClass1=outer.new RegularInnerClass();

        System.out.println(outer.userName);
        // System.out.println(regularInnerClass.getUserName());

        StaticInnerClass staticInnerClass=new StaticInnerClass();

        System.out.println(password);

    }

    public void getSurNmae(){

        RegularInnerClass regularInnerClass=new RegularInnerClass();
        System.out.println(regularInnerClass.surname);
    }
}
