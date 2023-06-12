package javaders.day10stringmanipulations;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {

    //If it rains: I will cancel the picnic.
    //eger yagmur yagarsa piknigi iptal edecegim.

/*
    //Ex: Verilen karakterin buyuk harf ise ekrana "Buyuk harf" yazdiran kodu yaziniz.

        char ch = 'A';

        if(ch>='A' && ch<='Z'){
            System.out.println("Buyuk Harf");
        }


        //Ex: Verilen sayı çift sayı ise ekrana "Cift Sayi" yazdiran kodu yazdirin.

        int num = 6;

        if(num%2==0){
            System.out.println("Cift Sayi");
        }

        //ex: asal sayı olup olmadığını kontrol eden kodu yaziniz.


        //verilen sayi 300 den kucuk veya 1200 den buyuk ise "Harika Sayı yazdiran kodu yaziniz.

        int num1 = 565;

        if(num1< 300 || num1>1200){
            System.out.println("Harika Sayi");
        }

        //kullanıcıdan alınan sayının tek mi çift mi olduğunu yazan kodu yazınız

        //1.yol bagimsiz if statement
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int num2 = scanner.nextInt();
        if(num2%2==0){
            System.out.println("Çift SAYI");
        }
        if(num2%2!=0){
            System.out.println("TEK SAYI");
        }
        //2.yol  if else

        int num3 = 5;
        if(num3%2==0){
            System.out.println("Çift SAYI");
        }
        else{
            System.out.println("TEK SAYI");
        }
*/
        // EX: verilen sayının negatif mi pozitif mi yada nötr mü olduğunu yazinir.
        //3lü KONTROL
        int numara = 10;

        if (numara<0){
            System.out.println("Negatiftir");
        } else if (numara==0) {
            System.out.println("Notr");
        } else {
            System.out.println("Pozitiftir");
        }



    }//main

}//class
