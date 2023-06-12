package projeler.proje01;

import java.util.Scanner;

public class Dikdortgen {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Dikdortgen prizmanın üç uzunluğunu giriniz");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        double dikdortgenHacim = (a*b*c);

        double dikdortgenAlan= 2*(a*b+b*c+a*c);

        System.out.println("Dikdortge prizmanın hacmi:" + dikdortgenHacim + " Dikdortgen prizmanın yüzey alanı:" + dikdortgenAlan);




    }
}
