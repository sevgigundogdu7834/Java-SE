package _07_polymorphism._override;

//override kavramından bahsedebilmek için metot isimlerinin aynı olması gerekir.
//kalıtım / extends implements durumlarının olması gerekir.
//override metotlarda parametrelerin aynı olması gerekir.
//override metotlarda access level azalamaz fakat artabilir.

//final ve private metotlar override edilemezler.
//private metotlar classa özgü visible olmayan metotlardır.
public class Example02 {


}

class Car{

    public String GetModelIntId(int id){

        return "Model Car";
    }

    String getColor(int id){

        return "Blue";
    }

    final String getName(int tc){

        return "Sevgi ";
    }

    private String getSurname(int tc){

        return "Gündoğdu";
    }
}

class BMW extends Car{

    // @Override
    public String GetModelIntIdx(int id){  //metot adı aynı değil

        return "Model Car";
    }

    // @Override
    public String GetModelIntId(int id ,String name){

        return "Model Car";
    }

    @Override
    public String GetModelIntId(int id){   //metot adı aynı,parametreler aynı ,LEGALDİR

        return "Model Car";
    }

    //public >protected >default >private

    @Override
     protected String getColor(int id){

        return "Blue";
    }

   // @Override                         //******final metotlar override edilemez.
     /* final String getName(int tc){

        return "Sevgi Gündoğdu";
    }

    */

     // @Override
    private String getSurname(int tc){  //*****private metotlar override edilemezler.

        return "Gündoğdu";
    }



}