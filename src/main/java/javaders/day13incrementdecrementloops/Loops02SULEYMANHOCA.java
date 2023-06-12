package javaders.day13incrementdecrementloops;

public class Loops02SULEYMANHOCA {
    public static void main(String[] args) {
    //break ile loop un farki break loop u kirar continue sizi tekrar koda atar
    // break switch statement da ya da loop da kullaniriz
    //switchde break bellidurumlarda kodu durdurmak icin kullaniriz
    //case 1 biit is yapmak istemezsek break yazariz
    //looplar da break loop u kirmak icin kullanriiz
    //continue ise loop yaparken bazi elemanlar isleme sokmama da kullaniliri. mesele yukari ornekte kucuk harf kullanmak istemiyoruz
    // kucuk harfleri isleme sokmamak icin continue

        // verilen bir string de kucuk harfleri konsola yazmayiniz

        String s = "Pwd12?Ab";
             for (int i = 0; i <s.length(); i++) {
                 char ch = s.charAt(i);
                 if (ch >= 'a' && ch <= 'z') {
                     continue;
                 } else {
                     System.out.println(ch);
                 }

             }

        System.out.println();
        // Break ile continue arasındaki fark nedir.
        // Break switch in dışına cıkmak icin ve loopu kirmak icin kullanilir.
        // Continue ise loop yaparken bazi elemanları işleme sokmamak icin kullanilir.

        // Bir String i ters ceviren  kodu yaziniz

        String t ="Apex";
        String ters = " ";  // yeni bir data olusturacagimiz icin her zaman memory de yeni bir konteynir olustururuz.

        for (int i =t.length()-1; i >= 0; i--) {

            ters= ters + t.substring(i, i+1);



        }
        System.out.println(ters);// for un içine koyarsak, tum harfleri tek tek yazdirir.


        // Bir tam sayinin rakamlarini veren kodu yaziniz.

        int sum = 0;

        int n = -578;
        n = Math.abs(n);

        for(int i=n; i>0; i/=10){
            sum += i%10;
        }
        System.out.println(sum);

        













    }//main
}
