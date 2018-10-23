package _01_Garbage_Collector;

public class Notes {

    //Garbage Collection mekanizması ,kaynak yönetiminin adıdır.
    //memory yönetimi
    //herhangi bir program çalıştığında mutlaka ram kullanımı söz konusu olacaktır.

    //C gibi bir dilde calloc,malloc,free gibi fonksiyonlarla yaparız.
    //Javada ise kaynak/memory yönetimi Garbage Collector tarafından yapılmaktadır.
    //Böylece memory leak lerin önüne geçilir.Bu da javanın robust olama özelliğini sağlar.


    //Bir başka nokta olarak calloc, malloc,free gibi kavramlarla uğraşmayız bu da javanın simple(basit) olama özelliğini gösterir.
    //JVM(jAVA VİRTUAL MACHİNE) ,mini bir işletim sistemi gibi çalışır.
    //İşletim sistemleri kaynak paylaşımı yapar,JVM de kendine ayrılmış kaynaklardan sorumludur.

    //Javada objeler heap memory de yaşarlar.
    //İnstance değişkenlerde objeyle birlikte heap te yaşarlar.

    //Garbage Collector, Heap te bulunan ve ulaşılamayan/sahipsiz objeleri heapten temizlemektan sorumludur.
    //Böylece yeni objeler için yer ayrılır.

    //Garbage Collector,JVM İN kontrolü altındadır.
    //Garbage Collector mekanizmasının ne zaman çalışacağı JVM kontrolü altındadır.

}
