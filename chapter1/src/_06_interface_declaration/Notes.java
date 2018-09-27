package _06_interface_declaration;

public interface Notes {

//   void writeNotes();

public abstract void writeNotes();

}

interface Person extends A{


}

interface A{

public static final int number=3;

//interfacelerin değişkenleri public static final dır.

}

//interface ->keyword
//interface->şablon,taslak özelliği gösterirler.
//interfacelerin methodları public ve abstract tır.

//Bir sınıf birden fazla interfaceyi implement edebilir.extends edemez.
//Bir sınıf birden fazla sınıfı extends edemez.Sadece bir sınıfı extends edebilir.

//bir interface birden fazla interfaceyi implement edemez.fakat kalıtabilir.

//________________________________________________________
 class MyRunnable implements Runnable,Cloneable,Notes{

     @Override
     public void run() {

     }

    @Override
    public void writeNotes() {

    }
}


class C extends MyRunnable implements A{


}



