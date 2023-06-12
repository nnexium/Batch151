package operation02;

import java.util.Scanner;

public class C01_operation {
    public static void main(String[] args) {
        //kullanicidan 2 sayi isteyin ve bu sayilara aritmatic operation yapiniz

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 1. sayiyi giriniz");
        int sayi1= scan.nextInt();
        System.out.println("lutfen 2. sayiyi giriniz");
        int sayi2=scan.nextInt();
        System.out.println("sayi 1 : "+sayi1);//5
        System.out.println("sayi 2 : "+sayi2);//2
        System.out.println("toplama : "+(sayi1+sayi2));//7
        System.out.println("cikartma : "+(sayi1-sayi2));//3//-3
        System.out.println("carpma : "+(sayi1*sayi2));//10
        System.out.println("bolme : "+(sayi1/sayi2));//2//0
        System.out.println("modulus : "+(sayi1%sayi2));//1//2
        System.out.println(sayi1);//5//2
        System.out.println(sayi2);//2//5


    }
}
