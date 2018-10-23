package _02_operators;

public class Example {

    public static void main(String[] args) {

        int exam=90;

        System.out.println(exam<50 ? "fail" : "success");

        //açık bir şekilde yazımı

        if(exam<50){

            System.out.println("fail");
        }

        else

            System.out.println("success");
    }
}
