package projeler.proje01;

import java.util.Scanner;


/*
***********GEOMETRİK HESAP MAKİNASI**********
1-Dikdörtgen pirizma, Küre, Silindir, Piramit, Koni nin Hacim ve Alan bilgilerini bulma
2-Önce hangi şekil ile ilgili işlem yapılmak istendiği istenecek,
3-Şekile ilişkin verilerin girilmesi istenecek
 */
public class Proje1GeometrikHesapMakinası {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Geometrik Hesap Makinasına Hoşgeldiniz");

        int counter = 0;

        do {
            System.out.println("Hesaplanmasını istediğiniz şekli seçiniz "+"\nDiktörtgenPrizma, Küre, Silindir, Piramit, Koni");
            String sec = input.next();


            if (!sec.equalsIgnoreCase("DiktörtgenPrizma") && !sec.equalsIgnoreCase("Küre") && !sec.equalsIgnoreCase("Silindir") && !sec.equalsIgnoreCase("Piramit") && !sec.equalsIgnoreCase("Koni")) {
                System.out.println("Gecersiz Tanım!Lütfen seçeneklerde bulunan şekillerden birini seçiniz.");
            }


            switch (sec) {
                case "DiktörtgenPrizma":
                    System.out.println("Dikdortgen prizmanın üç uzunluğunu giriniz");
                    int a = input.nextInt();
                    int b = input.nextInt();
                    int c = input.nextInt();
                    double dikdortgenHacim = (a * b * c);
                    double dikdortgenAlan = 2 * (a * b + b * c + a * c);
                    System.out.println("Dikdortge prizmanın hacmi:" + dikdortgenHacim + " Dikdortgen prizmanın yüzey alanı:" + dikdortgenAlan);
                    break;
                case "Küre":
                    System.out.println("Kurenin yariçapını yaziniz");
                    int r = input.nextInt();
                    double hacim = (4 * Math.PI * r * r * r / 3);
                    double alan = (4 * Math.PI * r * r);
                    System.out.println("Kürenin Hacmi:" + hacim + "Kürenin Alani:" + alan);
                    break;
                case "Silindir":
                    System.out.println("Silindirin yarıçap ve uzun kenarın uzunluğunu giriniz");
                    Double yarıCapSil = input.nextDouble();
                    Double uzunSil = input.nextDouble();
                    double silindirHacim = Math.PI * yarıCapSil * yarıCapSil * uzunSil;
                    double silindirAlan = 2 * Math.PI * yarıCapSil * (yarıCapSil + uzunSil);

                    System.out.println("Silindirin hacmi:" + silindirHacim + " Silindirin  yüzey alanı:" + silindirAlan);
                    break;
                case "Piramit":
                    System.out.println("Piramitin taban kenarı ve yuksekligini giriniz");
                    Double PiramitTabankenarı = input.nextDouble();
                    Double PiramitYukseklik = input.nextDouble();
                    double PiramitHacim = PiramitTabankenarı * PiramitTabankenarı * PiramitYukseklik / 3;
                    double PiramitAlan = PiramitTabankenarı * (PiramitTabankenarı + Math.sqrt(PiramitTabankenarı * PiramitTabankenarı + 4 * PiramitYukseklik * PiramitYukseklik));
                    System.out.println("Piramit hacmi:" + PiramitHacim + " Piramita alanı:" + PiramitAlan);
                    break;
                case "Koni":
                    System.out.println("Koninin yarıçap ve uzun kenarının uzunluğunu giriniz");
                    int yaricapKoni = input.nextInt();
                    int yukseklikKoni = input.nextInt();
                    //Hacim = (1/3)πr2h
                    double koniHacim = Math.PI / 3 * yaricapKoni * yaricapKoni * yukseklikKoni;
                    //Alan = πr(r+√(r2+h2))
                    double koniAlan = Math.PI * yaricapKoni * (yaricapKoni + Math.sqrt(yaricapKoni * yaricapKoni + yukseklikKoni * yukseklikKoni));
                    System.out.println("koninin hacmi:" + koniHacim + " Koninin yüzey alanı:" + koniAlan);
                    break;
            }counter ++;

        }while (counter<5);








    }//main
}
