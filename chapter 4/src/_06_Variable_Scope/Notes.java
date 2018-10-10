package _06_Variable_Scope;

public class Notes {

    public static int a=12;
    int number=10;

    //static --> class , JVM tarafından yüklendiğinde (load) oluşur,proje var olduğu sürece yaşar.(classa bağlıdır.)
    //instance -->obje var olduğu sürece yaşar,obje garbage collector tarafından temizlendiğinde instance değişkenin yaşamı son bulur.
    //local -->

    public static void main(String[] args) {



        for (int i=0;i<10;i++){

            // i IS_A local variable
        }

       // System.out.println("naber: "+i); // i'ye erişemiyorum yaşam alanı for ile sınırlı idi.
    }
}
