package switchCase02;

import java.util.Scanner;

public class C05_switch {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Portakal Turizm A.S. Sunar");
        System.out.println("(1) Orta Avrupa Turu");
        System.out.println("(2) Amerika Turu");
        System.out.println("(3) Uzak Dogu Turu");
        System.out.println("Seciminiz?");
        int secenek= scan.nextInt();

        switch (secenek){
            case 1:
                System.out.println("ucak ile viyana,budapeste,prag");
                System.out.println("3 yildizli otellerde fiyat : 150£");
                break;
            case 2:
                System.out.println("ucak ile new york,boston,florida");
                System.out.println("5 yildizli otellerde fiyat : 500$");
                break;
            case 3:
                System.out.println("ucak ile hong kong,tokyo,wuhan");
                System.out.println("5 yildizli otellerde fiyat 50$");
                break;
            default:
                System.out.println("lutfen gecerli bir işlem seciniz");



        }




    }
}
