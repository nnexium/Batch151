package practice.day_01;

import java.util.Scanner;

public class C07_IfElse {
    public static void main(String[] args) {

        // Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
        // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın

        Scanner scan = new Scanner(System.in);

        System.out.print("İlk Sayıyı giriniz: ");

        int ilksayi =  scan.nextInt();

        System.out.print("İkinci Sayıyı giriniz: ");

        int ikincsayi =  scan.nextInt();

        if (ilksayi>ikincsayi){
            System.out.println("İlk sayi Daha büyük");

        } else {
            System.out.println("İkinci sayi Daha büyük");


        }


    }

}
