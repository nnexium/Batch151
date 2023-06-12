package practice.day_02_pratice;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        // Kullanıcından adını, ikinci adını ve soyadını arasında bosluk olacak sekilde tek bir String olarak sisteme girmesini isteyiniz.
        // adının ilk karakterini, ikinci adının ilk karakterini ve soyadının ilk karakterini BUYUK harfle yazdırınız.

            Scanner scanner = new Scanner(System.in);

        System.out.println("Adinizi, ikinci adinizi ve soyadinizi aralarında boslukolacak sekilde giriniz");
        String str = scanner.nextLine().toUpperCase().trim();

        char adIlkkarakter = str.charAt(0);

        char adIkıncakarakter = str.charAt(str.indexOf(" ")+1);

        char soyadIlkkarakter = str.charAt(str.lastIndexOf(" ")-1);


        System.out.println("" + adIlkkarakter+adIkıncakarakter+soyadIlkkarakter);


    }//main


}
