package javaders.day14loops;

import java.util.Scanner;

public class Loops03SULEYMANHOCA {
    public static void main(String[] args) {

        //while loop
        int i = 1;

        while (i<1){ // while loop da loop body sinin hic calısmaması mümkündür (zero exocution is possible)
            System.out.println("while loop");
            i++;
        }


        //do while loop; MAYIN TARLASI GİBİ DÜŞÜN, ÜSTÜNE BASARSAN PATLAR
        int k = 1;
        do{
            System.out.println("do while loop"); //while kontrol yapar kodu oyle calistir.
                                                // do-while  calistirir sonra kontrol eder.
            k++;
        }while(k<=1);


        // kullanıcı bir sayı girsin sayı 100 den kucuk ise kullanıcı kazandınız mesajı alsin, diger durumlarda
        // kaybettiniz mesajı alsın

        Scanner input = new Scanner(System.in);


        do{// do while loop da loop body sinin en az bir kere çalışır
            System.out.println("Please enter an integer");
            int n = input.nextInt();

            if (n < 100){
                System.out.println("Kazandiniz");

            }else {
                System.out.println("Kaybettiniz");
                break;
            }

        }while (true);//loop sürekli çalıştırmak için içine TRUE yazdık, sonsuz loop yaptık


        //Kullanıcıdan alinan bir cumlenin buyuk harfle baslayıp nokta ile bittiğini kontrol eden kodu yaziniz.

        Scanner input2 = new Scanner(System.in);

        do {

            System.out.println("Please enter a word");
            String s = input2.next();

            if(s.endsWith(".") && (s.charAt(0) >= 'A' && s.charAt(0)<='Z')){
                System.out.println("Your sentence is correct grammatically");


            }else{

                System.out.println("Your sentence is incorrect grammatically");
                break;
            }

        }while (true);









    }//main
}//class
