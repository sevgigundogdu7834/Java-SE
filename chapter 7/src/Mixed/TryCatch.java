package Mixed;

import java.util.Random;

public class TryCatch
{
    public static void main(String[] args) {

        int a=0,b=0,c=0;

        Random r=new Random();

        for(int i=0;i<1320;i++){

            try{

                b=r.nextInt();
                c=r.nextInt();
                a=12345/(b/c);

            }

            catch (ArithmeticException e){

                System.out.println(e);
                a=0;
            }

            System.out.println("a :" +a);


        }
    }
}
