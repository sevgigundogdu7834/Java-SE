package _07_class_members_declaration_package1;

public class SubData extends Data {

    public static void main(String[] args) {

        Data data=new Data();

        System.out.println(" "+ data.protectedVar );
        System.out.println(" "+ data.defaultVar);
        System.out.println(" "+ data.publicVar );

        //private değişkenler ve methodlar o sınıfa özgüdür.görünür değildir.(visible)
        //Sadece içerinde bulunduğu sınıf tarafından erişilirler.
    }
}
