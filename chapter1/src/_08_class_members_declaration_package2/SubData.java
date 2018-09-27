package _08_class_members_declaration_package2;

import _07_class_members_declaration_package1.Data;

public class SubData extends Data {

    public void testMethod(){

        //farklı pakette kalıtım yapıldığında public ve protected memberlara erişim sağlanır.Diğer üyelere erişim sağlanamaz.

        System.out.println(""+publicVar);
        System.out.println(""+protectedVar);
        System.out.println("");
    }
}
