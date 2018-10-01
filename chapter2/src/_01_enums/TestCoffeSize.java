package _01_enums;

public class TestCoffeSize {

//enumlarda == karşılaştırma işlemi yapılabilir.
    //enumlar method içerisinde tanımlanamazlar.
    //enumlar varsayılan olarak public,satatic,final bir yapıya sahiptir.
    //java.lang.Enum

    public static void main(String[] args) {

        CoffeSize hugeSize=CoffeSize.HUGE;
        CoffeSize middleSize=CoffeSize.HUGE;
        System.out.println(hugeSize);
        System.out.println(hugeSize.name());
        System.out.println(hugeSize.ordinal());
        System.out.println(hugeSize.equals(middleSize));
        System.out.println(hugeSize == middleSize);

        for(CoffeSize e:CoffeSize.values()){

            System.out.println(e + " " + ":" +e.getPrice());
        }
    }
}
