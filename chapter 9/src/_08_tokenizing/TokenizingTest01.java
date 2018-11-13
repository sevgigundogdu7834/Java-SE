package _08_tokenizing;

public class TokenizingTest01 {

    public static void main(String[] args) {

        //StringTokenizer sınıfı herhangi bir metni belirlediğimiz herhangi bir
        // kritere veya kriterlere göre parçalamak (parse etmek ,parsing) için kullanılır.
        String content="test1,test2;test3,test4.test5";

        String[] array=content.split(",|;");

        for(String a:array){

            System.out.println(a);
        }

}}
