package practice.day_02_pratice;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {

    /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("a tam sayisini giriniz");
        int a = scan.nextInt();
        System.out.println("b tam sayisini giriniz");
        int b = scan.nextInt();


        String result = (a == b ? (("Sayılar birbirine esit")) : (a>b ? ("Buyuk Sayı" +a) : ("Buyuk Sayi"+ b)));

        System.out.println(result);

















    }
}
