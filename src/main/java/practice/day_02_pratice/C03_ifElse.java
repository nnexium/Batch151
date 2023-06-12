package practice.day_02_pratice;

import java.util.Scanner;

public class C03_ifElse {
    public static void main(String[] args) {

/*
        Kullanıcıdan 3 karakterden daha uzun bir kelime sisteme girmesini isteyin
        Eger kelimenin karakter sayısı 3 ve 3'den daha kucuk ise konsola " 3 Karakterden Daha Uzun Bir Kelime Girmelisiniz " yazdırınız
        Degilse kelimenin basına ve sonuna, kelimenin son uc harfini ekleyerek yazdırınız
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("En az üc harflik Kelime Girmelisiniz");

        String kelime = scan.next();

        if (kelime.length() <= 3) {
            System.out.println("3 Karakterden Daha Uzun Bir Kelime Girmelisiniz");
        }else {
           String sonUcharf = kelime.substring(kelime.length()-3);

           System.out.println(sonUcharf+kelime+sonUcharf);
        }












    }
}
