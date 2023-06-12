package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary03 {
    /*
    Verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
   1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
   2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please ennter a year...");
        int year = input.nextInt();

        String result= year%100==0 ? (year%400==0 ?"Leap" : "Not Leap") : (year%4 == 0 ? "Leap" : "Not Leap");


        System.out.println("result = " + result);


    }//main


}//class
