package deneme;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class denemewhileloops {
    public static void main(String[] args) {

/*
        //size  verilen  kucuk harfle yazılmış stringn index cift sayı olan characterleri yazdırın

        String s="miami";

        int m= 0;

        while(m<s.length()){

            String ch= s.substring(m,m+1);

            if(m%2==0){

                System.out.print(ch.toUpperCase());
            }else {

                System.out.print(ch);
            }
            m++;

        }
        System.out.println();
        //size verilen tam sayinin rakamları toplamını console a yazdiran kodu yaziniz.

        int r = 578;

        int sum = 0;

        while(r>0){
            sum = sum + r%10;
            r = r/10;

        }

        System.out.println(sum);

        //kullanıcıdan aldığınız sayı icin carpım tablosu oluşturan kodu yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int n = input.nextInt();

        int u =1;

        while(u<11){

            System.out.println(n+"x"+u+"="+(n*u));
            u++;
        }

        System.out.println();


        // Kullanıcıdan aldığınız stringde bulunan sessiz harfleri console a yazdiriniz



        System.out.println("Bir kelime giriniz");

        String y= input.next();

        int z= 0;

        while(z<y.length()){

            char ch= y.charAt(z);

            boolean x=ch=='a'||ch=='e' ||ch=='i' ||ch=='u' ||ch=='o' ||ch=='A' ||ch=='E' ||ch=='İ' ||ch=='U' ||ch=='O';

            if(!x){



                System.out.print(ch);
            }

            z++;
        }
        System.out.println();

        // kullanıcı bir sayı girsin sayı 100 den kucuk ise kullanıcı kazandınız mesajı alsın
        //diger durumlarda kaybettiniz mesajı alsın



        do{
            System.out.println("Bir sayi giriniz");
            int n2 = input.nextInt();
            if(n2<100){
                System.out.println("Sayı 100'dan küçük olamaz");
            }else{
                System.out.println("kaybettiniz");
                break;
            }



        }while (true);



        //kullanıcıdan alinan bir cumlenin buyuk harfle baslayıp nokta ile bittigini kontrol eden kodu yaziniz


        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Bir kelime giriniz");
            String s1= input.next();

            if(s1.endsWith(".")&&s1.charAt(0)>='A'&& s1.charAt(0)<='Z'){

                System.out.println("Kelimedir");
            }else {
                System.out.println("Kelime yanlış");
                break;
            }




        }while(true);

*/

        //Kullanıcı username ve password girsin 3 kereden fazla girerse hesabiniz bloke olmustur mesajı alsın
        // 3 kereye kadar hesabınıza hosgeldiniz

        Scanner input = new Scanner(System.in);
        int counter = 0;
        String validUsername = "nnexium";
        String validPassword = "Ahmetgul1";


        do{
            if(counter==3){
                System.out.println("hesabınız bloke oldu");
                break;
            }

            System.out.println("Kullanıcı adını giriniz");
            String username = input.next();
            System.out.println("Şifre giriniz");
            String password = input.next();


            counter++;
            if(username.equals(validUsername)&&validPassword.equals(validPassword))
            {
                System.out.println("Giriş Başarılı");
                break;
            }else{
                System.out.println("Kullanıcı adı veya şifre hatalı");
            }



        }while(counter<4);






















    }//main
}
