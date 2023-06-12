package ifStementsTernary01;

import java.util.Scanner;

public class C02_ifStements {
    public static void main(String[] args) {
        /*
        //Soru 1) Kullanicidan bir tamsayi isteyin
        // ve sayinin tek veya cift oldugunu yazdirin
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 1 tam sayi giriniz");
        int sayi= scan.nextInt();
        if (sayi%2==0)
            System.out.println("sayi cifttir");
        if (sayi%2==1)
            System.out.println("sayi tektir");

        if (sayi%2==0){
            System.out.println("sayi cifttir");
        }else System.out.println("sayi tektir");


        System.out.println(sayi);




    }
}
