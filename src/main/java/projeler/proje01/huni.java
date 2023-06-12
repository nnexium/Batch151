package projeler.proje01;

import java.util.Scanner;

public class huni {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Koninin yarıçap ve uzun kenarının uzunluğunu giriniz");
        int yaricapKoni = input.nextInt();
        int yukseklikKoni = input.nextInt();

        //Hacim = (1/3)πr2h
        double koniHacim = Math.PI/3*yaricapKoni*yaricapKoni*yukseklikKoni;


        //Alan = πr(r+√(r2+h2))
        double koniAlan= Math.PI*yaricapKoni*(yaricapKoni+Math.sqrt(yaricapKoni*yaricapKoni+yukseklikKoni*yukseklikKoni));

        System.out.println("koninin hacmi:" + koniHacim + " Koninin yüzey alanı:" + koniAlan);









    }



}
