package javaders.methodcreation;

import java.util.Scanner;

public class deneme {

    public static void main(String[] args) {

        String str = "Bizimle Java Ogrenmek Cok Kolay";
        String str2 = str.replaceFirst("i","e");
        System.out.println(str2);

        String str1 = str.replace("i","e");
        System.out.println(str1);

        //ex aşağıda verilen ürünlerin toplam fiyatını bulunuz

        String tv = "599$";
        String laptop = "299$";

        String tv2 = tv.replace("$","");
        System.out.println("tv2 = " + tv2);
        String laptop2 = laptop.replace("$","");
        System.out.println("laptop2 = " + laptop2);

        Double totalPrice = Double.valueOf(tv2)+Double.valueOf(laptop2);
        System.out.println("totalPrice = " + totalPrice);


        //verilen ismin ilk harfi ile ikinci ismin ilk harfini ekrana büyük harf olarak yazdır

        String tamIsim = "  mehmet fatih  ";
        char first = tamIsim.trim().toUpperCase().charAt(0);
        char second = tamIsim.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println("first = " + first);
        System.out.println("second = " + second);


        /*
        Kullanicidan email adresini girmesini isteyin,
        Asagidaki kurallara gore kullanicinin
        girdigi email adresini kontrol ediniz.
       i)mail adresi "gmail" icermeli
       ii)Space characteri mail'de olmamali
       iii)mail adresinde buyuk harf olmamali
       iv)En az bir tane noktalama isareti bulunmali
        */

        Scanner input = new Scanner(System.in);

        //Ex: verilen karakter buyuk harf ise "Buyuk harf" yazdiran kodu yaziniz.
/*
        char ch = 'B';
        if ( ch >='A' && ch<='Z'){
            System.out.println("Buyuk harf");
        }

        // verilen sayı çift sayı ise ekrana "çift sayı" yazısını yazdıran kodu yazınız.

        byte sayi = (byte) 300;

        if (sayi%2==0){
            System.out.println("çift sayı");
        }

        // verilen sayi 300 den kucuk veya 1200 den buyuk ise "Harika Sayi" yazan kodu yazdırın

        int sayi2 = 35;
        if ( sayi2<300 || sayi>1200 ){
            System.out.println("Harika Sayi");
        }

        // kullanıcıdan alınan sayının tek mi cift mi olduğunu yazan kodu yaziniz

        Scanner input2 = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int num = input2.nextInt();
        if (num%2==0) {
            System.out.println("çift sayı");
        } else System.out.println("tek sayı");
 */
        // verilen bir sayinin negatif mi pozitif mi notr mü olduğunu yaziniz
/*
        int numara =-9;
        if (numara<0){
            System.out.println("negatif sayı");
        } else if (numara == 0){
            System.out.println("Notr Sayi");
        } else {
            System.out.println("pozitif");
        }
        */

        Scanner input2 = new Scanner(System.in);

        System.out.println("Lütfen maaşınızı giriniz");

        long maas = input2.nextLong();
        System.out.println("maas = " + maas);

        // Kullaniciya cinsiyetini, adini, memleketini , yasini,boyunu,
        // ulkesini sevip sevmedigini soran bir program yaziniz

    /*
        System.out.println("Lütfen cinsiyetinizi erkek ise E kadın ise K olarak giriniz");
        input.nextLine();
        char cinsiyet = input.next().charAt(0);

        System.out.println("Lütfen adınızı giriniz");
        String isim = input.nextLine();
        input.nextLine();

        System.out.println("Memleketinizi giriniz");
        String memleket = input.nextLine();


        System.out.println("Yaşınızı giriniz");
        byte yas = input.nextByte();


        System.out.println("Boyunuzu giriniz");
        double boy = input.nextDouble();


        System.out.println("Lutfen yasadiginiz ulkeyi sevip sevmediginizi True/ False seklinde giriniz");
        boolean seviyorMu = input.nextBoolean();
        */


    }//main
}//class
