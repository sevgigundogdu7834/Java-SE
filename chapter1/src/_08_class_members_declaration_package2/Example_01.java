package _08_class_members_declaration_package2;

import _07_class_members_declaration_package1.Data;

public class Example_01 {

    public static void main(String[] args) {

        Data data=new Data();

        System.out.println(""+data.publicVar);


        //farklı paketten yalnızca public değişkenlere ve public methodlara erişim sağlanır.
        //protected,default ve private access levellere erişim sağlanamaz.

        //______________________________________________

       // System.out.println(""+data.defaultVar);
       //  System.out.println(""+data.protectedVar);

    }
}
