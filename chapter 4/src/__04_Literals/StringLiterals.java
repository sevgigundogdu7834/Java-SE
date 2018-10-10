package __04_Literals;

public class StringLiterals {

    // " ile kullnırız.
    //String tipindeki değişkenler reference typedır,primitive değildir.
    //String objelrini == ile kontrol etme equals ile kontrol et.
    //String objeleri immutable özellik gösterir.

    String a="Ali";
    String b="Ali";

    public static void main(String[] args) {

        StringLiterals stringLiterals=new StringLiterals();
        System.out.println(" "+stringLiterals.a.equals(stringLiterals.b));
    }
}
