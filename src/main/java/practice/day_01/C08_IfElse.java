package practice.day_01;

import java.util.Scanner;

public class C08_IfElse {
    public static void main(String[] args) {
        /*

    Kullanicidan hizmet yılını ve maasını ayri ayri sisteme girmesini isteyin.
    Eger 5 ve 5 yıldan daha fazla calısmıssa %10 zamlı maasını konsolda yazdırın.
    5 yıldan daha az calısanların zam alabilmek icin kac yıl daha calısması gerektigini konsola yazdırın

    */
        Scanner scan = new Scanner(System.in);

        System.out.println("Kullanıcının hizmet yılını giriniz: ");
        int hizmet = scan.nextInt();

        System.out.println("Kullanıcının maasini giriniz: ");
        int maas = scan.nextInt();

        if(hizmet>=5){
            System.out.println("Maas: " + (maas+maas%10));
        }else{}



    }

}
