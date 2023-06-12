package projeler.proje01;

import java.util.Scanner;

public class ucgenprizma {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Piramitin taban kenarı ve yuksekligini giriniz");
        Double PiramitTabankenarı = input.nextDouble();
        Double PiramitYukseklik = input.nextDouble();


        double PiramitHacim = PiramitTabankenarı*PiramitTabankenarı*PiramitYukseklik/3;

        double PiramitAlan= PiramitTabankenarı*(PiramitTabankenarı+Math.sqrt(PiramitTabankenarı*PiramitTabankenarı+4*PiramitYukseklik*PiramitYukseklik));


        System.out.println("Piramit hacmi:" + PiramitHacim + " Piramita alanı:" + PiramitAlan);


    }
}
