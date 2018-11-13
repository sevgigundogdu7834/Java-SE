package _06_NestedClass;

public class NestedClassTest01 {

    public static void main(String[] args) {


        NestedClassTest01 nestedClassTest01=new NestedClassTest01();
        nestedClassTest01.getLocalClass();
    }

    public void getLocalClass(){

        String localName="local";

        class LocalClass{

            private void getLocalMethod(){

                System.out.println(localName);
            }

        }

        LocalClass localClass=new LocalClass();
        localClass.getLocalMethod();
    }
}
