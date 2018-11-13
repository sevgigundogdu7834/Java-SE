package _07_NestedClass;

public class AnonymClassTest01 {

    public static void main(String[] args) {

        Member member=new Member();
        member.showAge();

        Member member1=new Member(){    //anonymous class declaration

            @Override
            public void showAge(){

                System.out.println("24");
            }


        };

        member1.showAge();

        Myİnterface myİnterface=new Myİnterface() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
    }
}

class Member{

    private int age=21;
    public void showAge(){

        System.out.println(age);
    }
}

interface Myİnterface{


}
