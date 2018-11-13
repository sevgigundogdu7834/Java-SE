package _02_Thread;

class MyThread extends Thread{

    @Override
    public void run() {

        System.out.println("My thraed....");
        System.out.println(Thread.currentThread());

        for(int i=0;i<5;i++){

            System.out.print(i + " ");
        }

        System.out.println();
    }

}
public class ThreadExampleTest01 {

    public static void main(String[] args) {

        System.out.println(" main.....");
        System.out.println(Thread.currentThread());     //Thread[main,5,main]

        MyThread myThread=new MyThread();  //yeni bir Thread objesi oluşturduk.

        myThread.start();  // yeni bir thread oluşturur. ( iş parçacığı olarak/lightweight olarak)

      //  myThread.start();  //java.lang.IllegalThreadStateException

        //start methodunu aynı thread objesi için kullanamayız legal değildir.

        myThread.run();
        myThread.run();
        myThread.run();


    }
}
