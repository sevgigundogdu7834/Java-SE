package _01_String;

public class Example_StringPool {

    public static void main(String[] args) {

        String username="admin";
        String username2="admin";

        System.out.println(username == username2);
    }

}

//Javada String objeleri için özel durumlar vardır.  (String Pool)
//Verimlilik için String pool kullanılır.