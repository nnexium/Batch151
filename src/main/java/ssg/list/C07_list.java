package list03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C07_list {
    public static void main(String[] args) {
        /*
        icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun
        kullanicidan bir sayi isteyip
        listede var olup olmadigini kullaniciya yazin
        */
        Random randomSayilar=new Random();
        int sayi=0;
        List<Integer>sayiListesi=new ArrayList<>();
        while (sayiListesi.size()<200){
            sayi= randomSayilar.nextInt(1000);
            if (!sayiListesi.contains(sayi)){
                sayiListesi.add(sayi);
            }
        }
        System.out.println(sayiListesi);
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen aramak istediginiz sayiyi giriniz");
        int sayi2= scan.nextInt();
        System.out.println(sayi);
        if (sayiListesi.contains(sayi2)){
            System.out.println("bu sayi mevcut");
        }else System.out.println("bu sayi mevcut degil");

    }
}
