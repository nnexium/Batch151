package javaders.day12switchloops;

import java.util.Scanner;

public class switch02SULEYMANHOCA {
    public static void main(String[] args) {
        // kullanicidan aldiğiniz characterin sesli harf olup olmadığını yazan kodu yaziniz.

//1.yol
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a letter ");
        char letter = input.next().charAt(0);
//tolowercase çalışmıyor char da o yüzden büyük harfleri de aşağıya eklemeliyiz
        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'u':
            case 'o':
            case 'A':
            case 'E':
            case 'I':
            case 'U':
            case 'O':
                System.out.println("a is a vowel");
                break;
            default:
                System.out.println("a is not a vowel");
                break;


                       }
        //2. Way:
        System.out.println("Please enter a letter");
        String letter2 = input.next().substring(0,1).toLowerCase();

        switch(letter2){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("It is a vowel");
                break;
            default:
                System.out.println("It is not a vowel");

        }

        //3. Way:
        System.out.println("Please enter a letter");
        String letter3 = input.next().substring(0,1);

        switch(letter3){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println(letter3 + " is a vowel");
                break;
            default:
                System.out.println(letter3 + " is not a vowel");

        }


    }//main

}//class
