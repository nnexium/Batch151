package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        //kullanıcıdan alacaginiz 4 basamakli sayinin ilk ve son rakaminin toplamini ekrana
        //programi yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi girini...");

        int sayi = input.nextInt();

        int sonRakam = sayi%10;
        int ilkRakam = sayi/1000;

        System.out.println("ilkRakam+sonRakam="+(ilkRakam+sonRakam ));





    }//main


}//class
