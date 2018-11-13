package _04_Thread;

class MyThread extends Thread{

    @Override
    public void run() {

        for(int i=0;i<100;i++){

            System.out.println("Thread name: "+Thread.currentThread().getName() + ": " +i);

            try {
                Thread.sleep(2000);        //o an çalışan thread 1 sn bekletilecek.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

}}
public class ThreadSleepTest02 {

    public static void main(String[] args) {

        MyThread thread1=new MyThread();
        MyThread thread2=new MyThread();
        MyThread thread3=new MyThread();
        MyThread thread4=new MyThread();

        thread1.setName("thread1");
        thread2.setName("thread2");
        thread3.setName("thread3");
        thread4.setName("thread4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }

}
