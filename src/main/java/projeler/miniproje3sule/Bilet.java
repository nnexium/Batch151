package projeler.miniproje3sule;

import java.util.Scanner;

public class Bilet {

       static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int km=0;
        int yas=0;
        int yolculukTipi=1;
        System.out.println("Lutfen gideceğiniz mesafiyi km olarak veriniz");
        km=input.nextInt();

        System.out.println("Lutfen yasinizi giriniz");
        yas=input.nextInt();

        System.out.println("Lutfen yolculuk tipini giriniz"+"Sadece Gidis ise 1\nGidis-Donus ise 2");

        yolculukTipi=input.nextInt();

        String plakaNumarasi= "01 ZD 866";
        if (km>0&& yas>0 && (yolculukTipi==1 || yolculukTipi==2)){

            double biletUcreti=km*0.1;
            double yasIndirimOrani=0;
            if(yas<12){
                yasIndirimOrani=0.5;
            } else if (yas<24) {
                yasIndirimOrani=0.1;
            } else if (yas>65) {
                yasIndirimOrani = 0.3;

            }
                biletUcreti-=biletUcreti*yasIndirimOrani;

            if(yolculukTipi==2){
                biletUcreti-=biletUcreti*0.2;
                biletUcreti*=2;
            }

            biletDokum(plakaNumarasi,km,yolculukTipi, biletUcreti,yasIndirimOrani);
         //   System.out.println("biletUcreti = " + biletUcreti);

            }else
            System.out.println("Hatalı veri girdiniz....");





    }//main

    private static void biletDokum(String plakaNumarasi, int km, int yolculukTipi, double biletUcreti, double yasIndirimOrani) {
        System.out.println("======================== Bilet Dokum ========================= ");
        System.out.println("Otubusun Plakası"+ plakaNumarasi);
        System.out.println("Mesafe " + km);
        System.out.println("YolculukTipi " + (yolculukTipi==1 ? "Tek Yön" : "Gidiş Dönüş"));
        System.out.println("Bilet Ucreti "+biletUcreti);


        slowPrint("Keyifli Yolculuklar Dileriz", 345);

    }

    public static void slowPrint(String text, int delay){
        for(char c : text.toCharArray()){
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

}
