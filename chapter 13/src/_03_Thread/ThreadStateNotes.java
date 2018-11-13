package _03_Thread;

public class ThreadStateNotes {

    public static void main(String[] args) {

        //-----> NEW

        //Yeni bir thread objesi oluşturduğumuzda threadin durumu new'dir.
        // Thread state for a thread which has not yet started.
        //Thread thread1=new Thread();

        //-----> RUNNABLE

        //start metodunu çağırdığımızda ilgili thread için NEW->RUNNABLE durumuna geçiş olacaktır.
        //Thread, RUNNABLE durumunda alive durumundadır.
        //Runnable durumu, threadin elveişli olduğu durumdur.
        //Bir threadin , thread schedular tarafından seçilebilmesi için mutlaka RUNNABLE durumda olması gerekir.

        //-----> RUNNİNG

        //Thread Schedular tarafından seçilebilen runnable thraeddir.
        //Hali hazırda çalışan threadin durumu.

        //------> WAİTİNG

        //waiting durumundaki bir thread çalışmaya uygun halde değildi.Yani thread schedular tarafından seçilemez.
        //burada thread alive(canlı) durumdadır.

        //java.lang.Object
        //public final void wait() throws InterruptedException

        //java.lang.Thread
        // public final void join() throws InterruptedException

        //--------> TİMED_WAİTİNG

        //bu durumda WAİTİNG state gibi, threadin çalışmasına uygun olmadığı bir state

        //

        //belli bir zamana kadar waiting durumu olur.

        // public final void wait(long timeout, int nanos) throws InterruptedException
        //public final native void wait(long timeout) throws InterruptedException

        //  public final synchronized void join(long millis, int nanos)

        //    public static void sleep(long millis, int nanos)


        //-----------> BLOCKED

        //synchronized bir block ' a ya da bir methoda aynı anda sadece 1 thread girebilir.
        //N tane thread olsun, aynı X objesi üzerinde çalışsın.
        //synchronized bir methoda sadece 1 adet thread girebilir, N-1 thread blocked durumundadır.
        //ilgili thraed işini bitirene kadar başka bir thread/ablock a giriş yapılamaz.

        //objenin kilidini ele geçirir.

        //TERMİNATED



    }
}
