package practice.day_01;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
/*
        Kullanıcıdan adını, soyadını, yaşını, boyunu ve kilosunu ayrı ayrı sisteme girmesini isteyin
        ve bunları şu şekilde konsola yazdırın:

        Adı: ...
        Soyadı: ...
        Yas: ...
        Boy: ...
        Kilo: ...

    */
        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen adinizi giriniz.");
        String name = scan.nextLine();

        System.out.println("lutfen soyadinizi giriniz.");
        String surname = scan.nextLine();

        System.out.println("lutfen yaşını giriniz.");
        int age = scan.nextInt();

        System.out.println("lutfen boyunu giriniz.");
        int boy = scan.nextInt();

        System.out.println("lutfen kilosunu giriniz.");
        int kilo = scan.nextInt();

        System.out.println("Adi="+name + "\n"+ "Soyadi= " +surname + "\n" + "Yaş:" + age + "\n"+ "boy:" + boy + "\n"+ "kilo:" + kilo);



    }
}
