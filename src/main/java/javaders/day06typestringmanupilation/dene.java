package javaders.day06typestringmanupilation;

import java.util.Scanner;

public class dene {

    public static void main(String[] args) {

    short num = 260;
    byte numByte= (byte) num;

    System.out.println("numByte = " + numByte);

    short num2 = 1023;
    byte num2Byte = (byte) num2;
        System.out.println("num2Byte = " + num2Byte);
    
    short num3 = 1000;
    byte num3Byte = (byte) num3;

        System.out.println("num3Byte = " + num3Byte);
    
    int intSayi = 8880;
    short numShort  = (short) intSayi;
    System.out.println("numShort = " + numShort);

    String a = "Tek Rakibim Dunku Ben .";


    String aUpper=a.toUpperCase();

    System.out.println("aUpper = " + aUpper);

    String aLower=a.toLowerCase();
    System.out.println("aLower = " + aLower);

    System.out.println("ilk karakter = " + a.charAt(0));

    System.out.println( a.charAt(10));

    System.out.println(a.charAt(0));

    System.out.println(a.charAt(19));

    System.out.println(a.length());

        //İNTERVİEW SORUSU
        //Bir stringdeki tekrarsız karakterleri ekrana yazdırınız.

        // String y = "aabbccdc";

        //Ex aşağıdaki stringdeki tekrarsız karakterleri ekrana yazdırınız.

        String password = "123456";

        System.out.println("Bir sifre giriniz");
        Scanner scanf = new Scanner(System.in);
        String userpas = scanf.nextLine();

        if(userpas.equals(password)){
            System.out.println("Giriş Başarılı");
        }else {
            System.out.println("Giriş Başarısız");
        }




    }//main


}//class
