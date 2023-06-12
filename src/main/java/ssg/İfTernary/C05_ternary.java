package ifStementsTernary01;

import java.util.Scanner;

public class C05_ternary {
    public static void main(String[] args) {
        //Kullanicidan bir tam sayi isteyin tek mi cift mi kontrol edin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        int sayi= scan.nextInt();
        String str= sayi%2==0 ? "sayi cift":"sayi tek";
        System.out.println(str);







    }
}
