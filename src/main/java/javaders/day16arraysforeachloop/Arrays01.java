package javaders.day16arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {

// Kullanıcının coklu datayı bir array'e yerleştirabilmesi icin gereken kodu yazınız.
        /*
       1- Kullanıcıdan data almak icin Scanner object oluştur
       2- Coklu datayı yerleştirmek icin bir array oluşturmaliyim.
       3- Array oluşturabilmek icin kullanıcıdan array'e kac tane eleman koyacağını almalıyım



         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen eklemek istediginiz eleman sayısını giriniz");
        int numOfElements = input.nextInt();


        String stdNames[] = new String[numOfElements];
        System.out.println("eklemeyi durdurmak icin q ya basın");

        for (int i = 0; i < stdNames.length; i++) {
            System.out.println("Enter the" + (i + 1) + ".student name");

            String name = input.next();


            if (name.equalsIgnoreCase("q")){
                break;
            }else {
                stdNames[i] = name;
            }
        }
        System.out.println(Arrays.toString(stdNames));



            /*
Kullanıcıdan ayrı ayrı iki kelime sisteme girmesini isteyin.
Eger İlk kelimenin karakter sayısı çift ise,
 ikinci kelimeyi birinci kelimenin ortasına koyun.
İlk kelimenin karakter sayısı tek ise, konsola
"ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli" yazdırın.
*/

        System.out.println("Lutfen iki kelime giriniz");
        String kelime = input.next();
        String kelime1 = input.next();

        if (kelime.length()%2==0){

            String orta=kelime.substring(0,kelime.length()/2);
            System.out.println();


        }

















    }//main

}
