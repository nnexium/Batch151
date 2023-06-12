package practice.day_03practice;

import java.util.Scanner;

public class C01_Switch {
    public static void main(String[] args) {

         /*

         Kullanıcıdan 0-4 arasi sınav puanını sisteme girmesini isteyiniz.

         Eger puanı 0,0-1,0 arasında ise KALDI seviyesi veriniz
              puanı 1,0-2,0 arasında ise GECTI seviyesi veriniz
              puanı 2,0-2,5 arasında ise IYI seviyesi veriniz
              puanı 2,5-3,5 arasında ise UST seviyesi veriniz
              puanı 3,5-4,0 arasında ise HARİKA seviyesi veriniz

        switch case kullanarak KALDI seviyesine F harf notu veriniz
                               GECTİ seviyesine D harf notu veriniz
                               IYI seviyesine C harf notu veriniz
                               UST seviyesine B harf notu veriniz
                               HARİKA seviyesine A harf notu veriniz
        */


        Scanner scan = new Scanner(System.in);
        System.out.println("0 ile 4 arası puanınızı giriniz.");

        double puan = scan.nextDouble();

        String seviye ="";

        if (puan>=0 && puan<1){
            seviye="Kaldı";
        } else if (puan>=1 && puan<2) {
            seviye="Geçti";
        } else if (puan>=2 && puan<2.5) {
            seviye="İYİ";
        } else if (puan>=2.5 && puan<3.5) {
            seviye="ÜST";
        } else if (puan>=3.5 && puan<=4) {
            seviye="HARİKA";
        }

        switch(seviye){
            case "Kaldı":
                System.out.println("F");
                break;
            case "Geçti":
                System.out.println("D");
                break;
            case "İYİ":
                System.out.println("C");
                break;
            case  "ÜST":
                System.out.println("B");
                break;
            case  "HARİKA":
                System.out.println("A");
                break;
            default:
                System.out.println("Doğru puanı giriniz");

        }






    }
}
