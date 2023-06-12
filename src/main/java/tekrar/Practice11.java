package tekrar;

import java.util.Arrays;
import java.util.Scanner;

public class Practice11 {
    public static void main(String[] args) {



 /*
          Kullanıcıdan aldığınız 'c' ve 'a' iceren bir String değer içerisindeki
       'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.
       */

        Scanner input = new Scanner(System.in);

        System.out.println("C ve a harfi içeren bir kelime girin");

        String str = input.next().toLowerCase();

        int counter=0;




        for (int i = 0; i <str.indexOf("c") ; i++) {
            if (str.charAt(i)=='a'){
                counter++;
            }else{

            }




        }
        System.out.println("C den önce "+ counter +"vardır");



    }
}
