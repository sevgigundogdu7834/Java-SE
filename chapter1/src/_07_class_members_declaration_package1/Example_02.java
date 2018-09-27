package _07_class_members_declaration_package1;

public class Example_02 {

    public static void main(String[] args) {


        Data data=new Data();

        System.out.println(""+data.publicVar);
        System.out.println(""+data.defaultVar);
        System.out.println(""+data.protectedVar);

        //aynı paket içerisinde yalnızca public,default,protected access levellere erişim sağlanır.
        //private değişkenlere ve methodlara aynı paket dahi olsa erişim sağlanamaz.

        //System.out.println(""+data.privateVar);

    }
}
