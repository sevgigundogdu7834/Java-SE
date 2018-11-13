package _01_toString;

public class Test02 {
    public static void main(String[] args) {

        Test01 person=new Test01("Züleyha","Kaya",24,"Bilgisayar Mühendisi");
        System.out.println(person);    //_01_toString.Test01@2f0e140b analmsız bir çıktı toString metodu olmadan

    //toString metodu override edildiğinde Test01{name='Züleyha', surname='Kaya', age=24, meslek='Bilgisayar Mühendisi'} çıktısı verir.

        int [] numbers={3,4,5};

        for(int i=0;i<numbers.length;i++){

            System.out.println("Dizinin"+ i+ ". elemanı -> " +numbers[i]);
        }

    }


}
