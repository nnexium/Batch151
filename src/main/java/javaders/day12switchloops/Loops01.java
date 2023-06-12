package javaders.day12switchloops;

public class Loops01 {
    public static void main(String[] args) {

        for(int i=11; i<15 ; i++) {
            System.out.println(i);
        }

    // 3:40 dan 23 e kadar tum cift sayiları ekrana yazdiriniz

        for(int i=40; i>22 ; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //ex: 18 den 56 ya kadar tüm tek sayilari ekrana y

        for(int i=18; i<56; i++) {
            if (i % 2 == 1) {
            System.out.print(i +" ");}
        }
    }//main
}//class


// 11 DEN 14 E KADAR OLAN SAYILARI EKRANA YAZDIRINIZ

