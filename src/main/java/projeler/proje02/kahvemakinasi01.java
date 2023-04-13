package projeler.proje02;

import java.util.Scanner;

public class kahvemakinasi01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hoşgeldiniz Hangi kahveyi istersiniz?");
        System.out.println("A-Turkish Coffee," +
                            "B-Filter Coffee, " +
                            "C-Espresso Coffee");


        String coffee = input.nextLine();
        if (!coffee.equalsIgnoreCase("Turkish Coffee") && !coffee.equalsIgnoreCase("Filter Coffee") && !coffee.equalsIgnoreCase("Espresso Coffee")) {
            System.out.println("Hatalı tuşlama yaptınız!Lütfen doğru ürünü seçiniz.");
        }


        System.out.println(coffee+" "+"hazirlaniyor");
        /*
        if (coffee.equalsIgnoreCase("Turkish Coffee")) {
            System.out.println("Turkish Coffee hazirlaniyor");
        } else if (coffee.equalsIgnoreCase("Filter Coffee")) {
            System.out.println("Filter Coffee hazirlaniyor");
        } else if (coffee.equalsIgnoreCase("Espresso Coffee")) {
            System.out.println("Espresso Coffee hazirlaniyor");
        }
*/

        System.out.println("Kahveniz için süt istermisiniz?");
        System.out.println("Evet yada Hayır giriniz");
        String sut = input.next();

        if (sut.equalsIgnoreCase("Evet")) {
            System.out.println("Sut ekleniyor");
        } else if (sut.equalsIgnoreCase("Hayir")) {
            System.out.println("Sut eklenmiyor");
        }
        ;


        System.out.println("Kahveniz icin şeker istermisiniz?");
        System.out.println("Evet yada Hayır giriniz");
        String seker = input.next();
        if (sut.equalsIgnoreCase("Evet")) {
            System.out.println("Kac seker istersiniz");
            String seker2 = input.next();
            System.out.println(seker2 + " Adet Şeker ekleniyor");
        } else if (sut.equalsIgnoreCase("Hayır")) {
            System.out.println("Seker eklenmiyor");
        }
        ;

        System.out.println("Kahveniz hangi boyutta İstersiniz");
        System.out.println("Büyük, Orta yada Küçük giriniz?");
        String boyut = input.next();

        System.out.println("Kahveniz " + boyut + " boy olarak hazirlaniyor");
        /*
        if (boyut.equalsIgnoreCase("Büyük")) {
            System.out.println("Kahveniz Büyük Boyutta hazirlanıyor");
        } else if (boyut.equalsIgnoreCase("Orta")) {
            System.out.println("Kahveniz Orta Boyutta hazirlanıyor");
        } else if (boyut.equalsIgnoreCase("Küçük")) {
            System.out.println("Kahveniz Küçük boyutta hazırlanıyor");
        */

            System.out.println("Kahveniz " +" "+ coffee + " "+ boyut +"boy olarak hazırlanmıştır" + "\n        *** AFİYET OLSUN ***");
    }

}