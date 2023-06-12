package practice.day_06_practice;

import java.util.Scanner;

public class C05_For {
    public static void main(String[] args) {

        /*
         Kullanıcıdan sisteme 5 adet sayi girmesini isteyiniz
         Bu sayilardan 5 ile 10 arasındakiler haric, digerlerinin toplamını bulunuz

      */
        Scanner input = new Scanner(System.in);
        System.out.println("Sisteme 5 adet sayın giriniz");

        int toplam = 0;

        for (int i = 0; i <5 ; i++) {
            int sayi = input.nextInt();


            if (sayi >= 5 && sayi <= 10) {
                System.out.println("Girdiğiniz sayı 5 ile 10 arasında olduğu için toplama dahil edilmeyecektir");
            } else
                toplam = sayi + toplam;

        }
        System.out.println("toplam = " + toplam);



    }
}
