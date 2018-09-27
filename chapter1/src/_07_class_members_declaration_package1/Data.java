package _07_class_members_declaration_package1;

public class Data {

    public int publicVar=10;
    int defaultVar=9;
    protected int protectedVar=9;
    private int privateVar=6;

    public void publicMethod(){



    }

    public void testMethod(){

        //aynı sınıf içerisinde private memberlarda dahil olmak üzere tüm access levellere erişim sağlanır.

        Data dataObject=new Data();
        dataObject.publicVar=30;
        dataObject.defaultVar=98;
        dataObject.protectedVar=34;
        dataObject.privateVar=32;


    }
}
