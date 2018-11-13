package _04_Thread;

public class SleepTest01 {

    // public static native void sleep(long millis) throws InterruptedException;
    // public static void sleep(long millis, int nanos)  throws InterruptedException

    //sleep methodu static metottur.
    //InterruptedException bir checkedException dır.

    //1000 ms -> 1 s
    //10 ^ 6 nanosaniye -> 1 ms

    //Thread/sleep methodu verilen süre kadar ilgili threadi suspend/uyutur. (TİMED_WAİTİNG)
    //belirtilen süre bittiğinde thread o anda çalışmaya devam etmez / bunun bir garantisi yoktur.

    //TİMED_WAİTİNG -> RUNNABLE a geçer.
    //Thread schedular ilgili threadi tekrar seçer ve çalıştırır.
}
