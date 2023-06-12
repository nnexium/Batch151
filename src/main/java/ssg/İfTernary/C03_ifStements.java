package ssg.İfTernary;

import java.util.Scanner;

public class C03_ifStements {
    public static void main(String[] args) {
        /*
       Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir gun ismi giriniz");
        String gunIsmi= scan.next().toLowerCase();
       if (gunIsmi.equals("cumartesi")||gunIsmi.equals("pazar")){
                System.out.println("Hafta Sonu");
        }
        if (gunIsmi.equals("cuma")||
                gunIsmi.equals("persembe")||
                gunIsmi.equals("carsamba")||
                gunIsmi.equals("sali")||
                gunIsmi.equals("pazartesi")){
            System.out.println("Haftaici");
        }
        if (!(gunIsmi.equals("cuma")||
                gunIsmi.equals("persembe")||
                gunIsmi.equals("carsamba")||
                gunIsmi.equals("sali")||
                gunIsmi.equals("pazartesi")||gunIsmi.equals("cumartesi")||gunIsmi.equals("pazar"))){
            System.out.println("Hatali bir giris yaptiniz lutfen bir gun ismi giriniz");
        }

        if (gunIsmi.equals("cumartesi")||gunIsmi.equals("pazar")){
            System.out.println("HaftaSonu");
        }else if (gunIsmi.equals("cuma")||
                gunIsmi.equals("persembe")||
                gunIsmi.equals("carsamba")||
                gunIsmi.equals("sali")||
                gunIsmi.equals("pazartesi")){System.out.println("Haftaici");
        }else System.out.println("Hatali Giris yaptiniz");






    }
}
