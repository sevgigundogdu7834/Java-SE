package _01_Thread;

public class Notes {

    public static void main(String[] args) {

        //Thread dediğimizde aklımıza 2 kavram gelir;

        // 1) java.lang.Thread sınıfı ve objesi
        // 2) çalışan iş parcacığı / lightweight proses

        // Java.lang.Thread IS-A java.lang.Object önermesi doğrudur.

        //çalışan iş parcacığı olarak, kendi stack alanına sahip lightweight prosesler.

        //proses -> işletim sistemi açısından , çalışan programlar uygulamalardır. ( eclipse, word,chrome...)

        //Bir proses için N tane thread koşabilir/çalışabilir.

        //javada basit bir hello word uygulamasında bile thread oluşur. ( main threadi oluşur.)

        //JVM (Java Virtual Machine) , bir nevi işletim sistemi gibi çalışır.
        //Threadlerin yönetiminden / schedule edilmesinden JVM sorumludur.

        //Thread oluşturmak için 2 farklı yaklaşım vardır;

        // 1) Java.lang.Thread sınıfını kalıtmak (extends)
        // 2) Java.lang.Runnable arabirimini uygulamak (implement)


    }
}
