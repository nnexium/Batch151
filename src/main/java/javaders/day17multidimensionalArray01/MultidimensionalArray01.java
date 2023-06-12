package javaders.day17multidimensionalArray01;

import java.util.Arrays;

public class MultidimensionalArray01 {
    public static void main(String[] args) {
    /*
    1) bir array in elemanları da array olursa bu tarz arraylere "MultidimensionalArray" denir.



     */


        //MultidimensionalArray nasıl oluşturulur.

        String names [][] = new String[3][2];

        names[1][0] = "P";
        names[2][1] = "Z";
        names[0][0] = "A";
        names[0][1] = "K";
        names[1][1] = "M";
        names[2][0] = "C";

        //MultidimensionalArray de yazdırmak icin tostring değil deepTostring methodu kullanılır.

        System.out.println(Arrays.deepToString(names));

        System.out.println(names[1][1]);//M

        // Multidimensional Array icindeki bir array i yazdirmak
        System.out.println(Arrays.toString(names[0])); // PM

        //Kısa yoldan multidimensionalarray nasıl oluşturulur.

        String students[][]={ {"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan","Seyhan"}, {"Ceyhan","Kayahan"} };

        //Examples1 : Yukarıdaki students arrayinde toplam kac isim olduğunu bulunuz.

        int sum =0;
        for(String[] w : students){

            sum = sum + w.length;

        }
        System.out.println(sum);

        //Examples2 : Yukarıdaki students arrayinde icinde "m" olan isimleri console a yazdiriniz.

            // NESTED LOOP İLE ÇÖZÜLÜR

        for(String[] w : students) {
            for (String k : w) {
                if (k.contains("m")) {
                    System.out.println(k);
                }

            }
        }


        //Bir integer multidimensional array oluşturunuz, tum elemanlarin carpımını hesaplayınız.

        int numbers [][] = {{5,4},{2,3,2}};
        int carpim =1;

        for(int[] w : numbers){
            for(int k : w){
                carpim = carpim * k;
            }

        }
        System.out.println(carpim);
        //Example 4: Iki boyutlu bir array'i tek boyutlu bir array'e ceviriniz
        int number[][] = { {5, 4}, {2, 3, 2} }; // ==> { 5, 4, 2, 3, 2 }

        //1.Step: Iki boyutlu array'de kac eleman oldugunu bulan kodu yazmaliyiz
        int toplamElemanSayisi = 0;

        for(int[] w : number){
            toplamElemanSayisi = toplamElemanSayisi + w.length;
        }
        //2.Step: Tek boyutlu array'i iki boyutlu array'in eleman sayisini kullanarak olusturmaliyiz
        int newArr[] = new int[toplamElemanSayisi];

        //3.Step: Iki boyutlu array'deki elemanlari tek boyutlu array'e transfer etmeliyim
        int idx = 0;


        for(int[] w : numbers){
            for(int k : w){
                newArr[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newArr));

        //Example 5: Bir integer multidimensional array'deki en kucuk ve en buyuk elemanin toplamini bulunuz.

        int ages[][] = { {15, 4}, {12, 43, 21}};

        int small = ages[0][0];
        int big = ages[0][0];

        for(int[] w : ages){
            for(int k : w){
                small = Math.min(small, k);
                big=Math.max(big, k);
            }
            System.out.println(small);
            System.out.println(big);
            System.out.println(small+big);
        }
    }//main
}
