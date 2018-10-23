package _01_flow_control;

import java.util.Scanner;

public class Switch_case {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen Uzunluğunu test etmek istediğiniz kelimeyi giriniz..");
        String textLine =input.nextLine();

        int textLength=textLine.length();

        switch (textLength){

            case 1 :

                System.out.println("Kısa kelime"); break;

            case 2:

                System.out.println("Kısa kelime"); break;

            case 3:

                System.out.println("Kısa kelime"); break;

            case 4:

                System.out.println("Orta uzunlukta bir kelime"); break;
            case 5:

                System.out.println("Orta uzunlukta bir kelime"); break;
            case 6:

                System.out.println("Orta uzunlukta bir kelime"); break;
            case 7:

                System.out.println("Orta uzunlukta bir kelime"); break;
            case 8:

                System.out.println("Uzun kelime");break;
            case 9:

                System.out.println("Uzun kelime");break;
            case 10:

                System.out.println("Uzun kelime");break;
        }
    }
}
