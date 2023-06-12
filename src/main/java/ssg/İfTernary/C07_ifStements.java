package ssg.İfTernary;

import java.util.Scanner;

public class C07_ifStements {
    public static void main(String[] args) {

        /*
        Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
        değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
        1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
        Sesli harfler: a,e,i,o,u
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        String str= scan.next().toLowerCase();
        str=str.replaceAll("[^a-zA-Z]","*");
        if (str.length()==1&&!(str.contains("*"))){
        System.out.println(str.equals("a") ||
                str.equals("e") ||
                str.equals("i") ||
                str.equals("u") ||
                str.equals("o") ? "sesli harf girdiniz" : "Sessiz Harf girdiniz");

    }else System.out.println("yanliş veya fazla karakter girdiniz");
    }
}
