package team8;

import java.util.Scanner;

public class day03 {
    public static void main(String[] args) {

        //Kullanicidan alinan bir tamsayinin tekrarsiz rakamlarinin toplamini bulunuz
        //1838 ==> 1 + 3 = 4


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Sayı giriniz");


        String a = scanner.next();

        int sum = 0;

        for(int i=0; i<a.length(); i++) {
            String d = a.substring(i, i+1);
            if(a.indexOf(d)!=a.lastIndexOf(d)) {
                 sum = sum + Integer.valueOf(d);
            }

        }
        System.out.println(sum);


        //Bir String'deki tekrarli character'leri ekrana yazdiran kodu yaziniz.

        String t = "Alalam";

        String result = "";

        for(int i=0; i<t.length(); i++) {

            char ch = t.charAt(i);


            if (t.indexOf(ch) != t.lastIndexOf(ch)) {

                result = result + ch;

            }

        }
        System.out.println(result);







    }//main
}
