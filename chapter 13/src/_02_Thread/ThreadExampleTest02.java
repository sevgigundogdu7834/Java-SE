package _02_Thread;

class MyRunnable implements Runnable{

    @Override
    public void run() {

        System.out.println();
        System.out.println("My thraed....");
        System.out.println(Thread.currentThread());

        for(int i=0;i<11;i++){

            System.out.print(i + " ");
        }

        System.out.println();
    }
}
public class ThreadExampleTest02 {

    public static void main(String[] args) {

        MyRunnable myRunnable=new MyRunnable();
        myRunnable.run();                           //yeni bir thread başlatmaz...

        Thread thread=new Thread(myRunnable);
        thread.start();

        MyRunnable myRunnable1=new MyRunnable();

        Thread thread1=new Thread(myRunnable1);
        thread1.start();

        //Örneği çalıştırdığımızda OUTPUT ' un hangi sırada olacağının bir garantisi yoktur.
        //Çünkü hengi threadin ne kadar, ne zaman çalışacağını bilmiyoruz.
        //Bunun yönetimi JVM in kontrolü altındadır.

        //JVM içerisinde Thread Schedular mekanizması vardır.
        //Hangi thread in ne zaman  çalışacağına bu yapı karar verir.
        //Threadlerin stateleri vardır, runnable state sahip thread arasından seçim yapar ve thread çalışır.
    }



}
