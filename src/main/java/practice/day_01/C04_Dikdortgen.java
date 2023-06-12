package practice.day_01;

import java.util.Scanner;

public class C04_Dikdortgen {
    public static void main(String[] args) {


        // Kullanicidan dikdortgenin a ve b kenarlarinin uzunluklarini ayri ayri sisteme girmesini isteyiniz.
        // ve Dikdorgenin cevresini hesaplayarak ekrana yazdiriniz

        Scanner scaan= new Scanner(System.in);

        System.out.println("Dikdortgenin a kenarinin uzunlugunu giriniz");

        int a = scaan.nextInt();
        System.out.println("Dikdortgenin b kenarinin uzunlugunu giriniz");
        int b = scaan.nextInt();

        System.out.println("Dikdortgenin cevresi= " +(2*a+2*b));



    }

}
