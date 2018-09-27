package _02_naming_standard;

public class Notes {

    private String name;
    private String surname;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    // Class ve İnterface için isimlendirme standardı;

    // 1)class ve interface isimleri büyük harfle başlamalıdır.
    //camelcase yapısına uygun olmalı,Her kelimenin ilk harfi büyük olmalıdır.

    // 2)class isimleri ->isim/noun

    //CustomerAccount
    //Person


    //Student

    // 3)İnterface isimleri->adjective/sıfat

    //public interface Runnable
    //public interface Comporable
    //public interface Closable extende AutoClosable
    //public interface Serializable

    // 4)Methodlar

    //Küçük harfle başlamalı,camelCase yapıda olmalı,fiil-isim(verb-noun) çifti şeklinde olmalıdır.

    //getCostomerOrder
    //calculateCustomerOrder
    //saveExcelFile

    // 5)değişkenler için;

    //camelcase yapıda olmalı ve küçük harfle başlamalıdır.

    int i;

    //mümkün olduğunca değişken,class,interfacelere mantıklı düzgün isimler verilmelidir.

    // 6) sabitler/constant

    //sabitler/constant javada genel olarak static final olarak tanımlanır.

    //Bütün harfler büyük yazılır.

    //public static final int MIN_VALUE;
}
