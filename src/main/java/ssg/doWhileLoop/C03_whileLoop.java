package doWhileLoop02;

import java.util.Scanner;

public class C03_whileLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int sayilar=0;
        int toplam=0;

        while (toplam<500){
            System.out.println("lutfen toplamak istediginiz sayilari giriniz");
            sayilar= scan.nextInt();
            toplam+=sayilar;
        }
        System.out.println(toplam);

    }
}
