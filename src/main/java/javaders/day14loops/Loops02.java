package javaders.day14loops;

import java.util.Scanner;

public class Loops02 {

    public static void main(String[] args) {
        //3 den 8 e kadar tum tamsayilari console a yazdiran kodu yazdirin

/*
        // 1.WAY

        for (int i = 3; i <9 ; i++) {
        System.out.print(i+" ");

        }

        //2.way
        int i = 3;
        while (i <9){
            System.out.print(i+" ");
            i++;
        }


        //21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari console'a yazdiran kodu yaziniz
        for(int k=21; k<181; k++){
            if(i%4==0 && i%6==0){
                System.out.print(i + " ");
            }
        }

        //2way

        int k=21;
        while(k<181){
            if(k%4==0 && k%6==0){
                System.out.print(k + " ");
            }
            k++;
        }

        //Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz
//miami ==> MiAmI

        String s = "miami";
        int m=0;

        while(m<s.length()){

            String ch = s.substring(m,m+1);

            if(m%2==0){
                System.out.print(ch.toUpperCase());
            }else{
                System.out.print(ch);
            }
            m++;//Bu kismi unutmayin yoksa "infinite loop" olusur. Yani; "sonsuz loop" olusur.
            // "sonsuz loop"lar application'in donmasina sebep olur.
        }


*/
        //size verilen tamsayinin rakamlari toplamini console yazdiran kodu yaziniz

        int r=578;
        int sum= 0;


        while(r>0){
            sum=sum+r%10;
            r=r/10;
        }
        System.out.println(sum);


//kullanıcıdan aldığınız sayı için çarpım tablosu olusturan kodu yaziniz
        // 3*1  3*2
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = input.nextInt();

        int u=1;

        while(u<11){
            System.out.println(n + "*" +u+ "=" + (n*u));
            u++;
        }

        //Kullanicidan aldiginiz String'deki sessiz harfleri console'a yazdiran kodu yaziniz
        //Alabama ==> lbm
        System.out.println("Please enter a word");
        String y = input.next();

        int z=0;

        while(z<y.length()){

            char ch = y.charAt(z);
            boolean x = ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U';

            if(!x) {
                System.out.print(ch);
            }
            z++;
        }




    }
}