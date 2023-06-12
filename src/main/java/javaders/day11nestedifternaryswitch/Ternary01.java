package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
       /*
       kullanıcıdan alınan iki sayidan kucuk olanın ekrana yazdiriniz.
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two integers...");
        int first = input.nextInt();
        int second = input.nextInt();
        // 1.yol
        if(first<second){
            System.out.println("first");}
            else {System.out.println("second");}


        // 2.yol
        int result = first<second ? second : first;

            System.out.println(result);







    }//main


}//class
