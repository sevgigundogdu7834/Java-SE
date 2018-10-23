package _02_operators;

public class Test {

    public static void main(String[] args) {

        boolean value=false;
        boolean değer=false;

        //bu gibi sorunlarla karşılaşmamak için value==true tercih edilmez.
        //if(value) kullanmak daha iyidir.******


        //

        if(value=true){   //value==true yerine value=true yapıyoruz derleyici hata vermez BUG!!*****


            System.out.println("value is true");
        }

        else

            System.out.println("value is false");




        if(değer){

            System.out.println("deger is true");
        }

        else

            System.out.println("deger is false");
    }


}
