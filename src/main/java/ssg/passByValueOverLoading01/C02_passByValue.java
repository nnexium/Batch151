package passByValueOverLoading01;

import java.util.Arrays;
import java.util.Random;

public class C02_passByValue {
    public static void main(String[] args) {
        /*
      4 elemanli bir array olusturalim
      bu array'in 2. ve 4. elemanlarini
      100'den kucuk rastgele bir sayi ile degistirelim
      sonra ayri bir method'da ve yeni halini yazdiralim
       */
        int arr[]={3,5,7,9};
        System.out.println(Arrays.toString(arr));//{3,5,7,9}
        arrayElemanDegistir(arr);;//method icinde array [3, 77, 7, 80]
        System.out.println(Arrays.toString(arr));//[3, 77, 7, 80]
       /*
     verilen 4 elemanli bir array'i method'a gonderelim method'da yeni 3 elemanli
     bir array atayip bu yeni array'e rastgele
     100'den kucuk 3 sayi atayalim method da arrray'i yazdiralim
     main method'da da method call'dan sonra yeniden method'u yazdiralim
    */
        arrayDegistir(arr);//[12, 35, 37]
        System.out.println(Arrays.toString(arr));//[3, 77, 7, 80]
        arrayIsimDegistir(arr);//[3, 54, 7, 30]
        System.out.println(Arrays.toString(arr));

    }

    private static void arrayIsimDegistir(int[] arr) {
        int array[]=arr;
        array[0]=56;
        System.out.println(Arrays.toString(array));
    }

    private static void arrayDegistir(int[] arr) {

        arr=new int[3];
        Random rnd=new Random();
        arr[0]= rnd.nextInt(100);
        arr[1]= rnd.nextInt(100);
        arr[2]= rnd.nextInt(100);
        System.out.println(Arrays.toString(arr));

    }

    private static void arrayElemanDegistir(int[] arr) {
        Random rnd=new Random();
        arr[1]= rnd.nextInt(100);
        arr[3]= rnd.nextInt(100);
        System.out.println("method icinde array "+ Arrays.toString(arr));

    }
}
