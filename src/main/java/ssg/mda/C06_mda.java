package mda03;

import java.util.Arrays;

public class C06_mda {
    public static void main(String[] args) {
         /*
        soru 6) bir multi-dimensional array olusturun ve
        outer indexlerin inner indexlerini tek tek kontrol edip
        en buyuk degerlerini yazdırın
         */
        int sayilar[][]={{32,45,64,77,22},{90,8,14,12,53},{33,42,61,83,24}};
        for (int i = 0; i < sayilar.length; i++) {
            Arrays.sort(sayilar[i]);
            System.out.print(sayilar[i][sayilar[i].length-1]+" ");
        }
        System.out.println("\n"+Arrays.deepToString(sayilar));



    }
}
