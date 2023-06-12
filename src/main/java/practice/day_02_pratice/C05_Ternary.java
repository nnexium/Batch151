package practice.day_02_pratice;

import java.util.Scanner;

public class C05_Ternary {
    public static void main(String[] args) {


    /*
            Kullanıcıdan bir tam sayı sisteme girmesini isteyin
            Ternary kullanarak;
            Girilen sayı çift ise konsola "Cift Sayi" yazdirin
            Girilen Sayi tek ise girilen sayıyı 3 artırarak konsola yazdırınız.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz");

        int sayi1 = scanner.nextInt();

        System.out.println(sayi1%2==0 ? "Cift Sayi" : (sayi1+3));
















    }//main

}
