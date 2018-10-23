package _01_flow_control;

public class Notes {

    //kodumuzda eğer çok fazla if-else bloğu varsa birşeyleri yanlış yapıyor olabiliriz.

    //tekrar düşün , daha iyi yazabilir miyim?

    //if-else bloğunu çok fazla kullanmamız gerekiyorsa switch- case yapısını tercih edebiriz.

    //if(booleanexpression)
    //olabildiğince sade olmalıdır.

    static boolean nameCheck="Sevgi".equalsIgnoreCase(getName());
    static boolean notCheck=getNot()>50;
    static boolean ageCheck=getAge()>20;
    static boolean test=false;


    public static void main(String[] args) {

        if(test){   //test=false olduğundan aşağıdaki koşul sağlanmaz.

            if("Sevgi".equalsIgnoreCase(getName()) && getNot()>50 && getAge()>20){

                System.out.println("Koşullar sağlandı");
            }
        }


        if(nameCheck && notCheck &&ageCheck){    //Bunu tercih ederiz......******

            System.out.println("Koşullar kolaylıkla ve daha sade bir şekilde sağlandı.");
        }


    }

    public static String getName(){

        return "Sevgi";
    }

    public static int getNot(){

        return 80;
    }

    public static int getAge(){

        return 24;
    }

}
