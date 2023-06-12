package practice.day_06_practice;

import java.util.Scanner;

public class C06_While {
    public static void main(String[] args) {


// kullanıcıdan bir sayı girmesini isteyiniz, girdiğiniz sayıyı 10 un katı olacak şekilde ardışık yazdırınız

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");

        int sayi= input.nextInt();

       while (sayi%10!=0) {
           System.out.print( sayi+" ");
           sayi++;

       }



    }
}
