package _05_InıtıalızeBlock;

public class EXample {

    static {

        System.out.println("This is a Static Inıtıalize Block");
    }

    {
        System.out.println("This is a Instance Inıtıalıze Block");
    }

    public EXample() {

        System.out.println("This is a constructor");
    }

    public static void main(String[] args) {

        System.out.println("This is a main block");

        EXample eXample=new EXample();


    }
}
