package _01_enums;

//enumlar başka bir sınıfı kalıtamaz.
//enumların constructorları private ya da default olabilir.
public enum CoffeSize {

    SHORT(3),TALL(5),HUGE(10),MİDDLE(7);

    private int price;

    public int getPrice() {
        return price;
    }

    private CoffeSize(int price) {
        this.price = price;


    }
}
