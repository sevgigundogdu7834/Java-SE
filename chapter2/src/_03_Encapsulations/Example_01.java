package _03_Encapsulations;

public class Example_01 {

    public static void main(String[] args) {

        BadEncapsulation badEncapsulation=new BadEncapsulation();
        badEncapsulation.number=12;
        badEncapsulation.number=98;

        int negativeNumber=-32;

        if(negativeNumber<0){

            badEncapsulation.number=-34;


        }

        GoodEncapsulation goodEncapsulation=new GoodEncapsulation();
        goodEncapsulation.setAge(-56);


    }


}
