package _09_class_members_nonaccess_modifiers;

public abstract class Notes {

    public abstract void testMethod();

    //final

    //final sınıflar extends edilemez.kalıtım yapılamaz.
    //final methodlar override edilemezler.
    //final değişkenler yalnızca bir kez assign işlemi yaparlar.Değşştirilemezler.sabitlerdir.

    //abstract
    //abstract sınıflar kalıtılmak zorundadırlar.
    //Bir sınıfın methodu abstract tanımlandıysa sınıflarda abstract tanımlı olmalıdır.override edilmek zorundadır.abstract methodlar gövdesiz olurlar.
}

class Foo extends Notes{


    @Override
    public void testMethod() {

    }
}
