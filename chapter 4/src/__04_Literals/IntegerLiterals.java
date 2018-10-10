package __04_Literals;

public class IntegerLiterals {

    public static void main(String[] args) {

        int sayi=100_000_000;   //sayıyı ayırabiliriz.

        //decimal -> 10'luk tabanda bir sayı
        int number=100;  //100-> integer literali varsayılan olarak int tipindedir.
        //[0,9]
        //_________________________
        //octal->8'lik taban
        //[0,7]
        //sayının başında 0 bulunur.

        int eight=010;
        System.out.println("Sekiz :"+eight);

        int nine=011;
        System.out.println("Dokuz :"+nine);

       // int error=08;   //***LEGAL DEĞİLDİR.
        int ellialtı=070;
        System.out.println(""+ellialtı);
       //___________________________

        //hexadecimal->16 'lık taban
        //A->10
        //B->11
        //C->12
        //F->15

        //0x ya da 0X ile başladığında bir tamsayı literali hexadecimal olur.

        int number1=0x11;
        System.out.println("number1 :"+number1);

        int number2=0x22;
        System.out.println("number2 :"+number2);

        //_____________________________

        //binary literal->2'lik taban    //java 7 ile beraber geldi.
        //[0,1]

        //0b ya da 0B ile başlar.

        int number3=0b00001;
        System.out.println("number3 :"+number3);
    }






    //tamsayı literalleri;

    //decimal;
    //octal;
    //hexadecimal;
    //binary;


}
