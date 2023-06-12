package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {
        /*
        kullanıcıdan bir sayi aliniz, o sayi pozitif ise ekrana "pozitif" yazdirin, değil ise
        ekrana "pozitif degil"yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer.. ");
        int num = scanner.nextInt();

        String result = num>0 ? "Pozitif" : "Pozitif degil";

        System.out.println(result);



    }//main
}//class
