package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Lutfen maasinizi giriniz");

    long maas = input.nextLong();

    System.out.println("maas = " + maas);


    System.out.println("Lutfen cinsiyetinizi kadin ise K Erkek ise E giriniz");
    char cinsiyet = input.next().charAt(0);

    System.out.println("cinsiyet = " + cinsiyet);

    System.out.println("Lutfen memleketinizi giriniz");
    String memleket = input.next();

    System.out.println("lutfen boyunuzu giriniz");
    double boy = input.nextDouble();

    System.out.println("Lutfen yasadiginiz ulkeyi sevip sevmediginizi True/False olarak giriniz");
    boolean seviyorMu = input.nextBoolean();


    System.out.println("*************** Tolgahan *****************");
    System.out.println("cinsiyet : "+cinsiyet+"\nmemleket : "+memleket+"\nboy : "+boy+"\nseviyorMu : "+seviyorMu);








    }//main
}//class
