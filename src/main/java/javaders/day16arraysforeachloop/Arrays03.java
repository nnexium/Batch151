package javaders.day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //Specific bir elemanın array de olup olmadığını anlamak icin gereken kodu yaziniz.

        String names[] = {"K", "C", "R", "A", "S"  };

        String el = "X";
//1.yol
        int counter=0;

        for(String w : names){


            if(w.equals(el)){
                counter++;
                break;
            }


        }
    if(counter>0){
     System.out.println("Array has the elements"+ el);
     }else{

         System.out.println("Array has no elements "+ el);
    }

// 2.yol
        //1)binarySearch() methodu sort() kullalnmadan kullanmayiniz.
        //2)binarySearch() MANTIĞI SİRALİ ELEMANLAR İCİN GECERLİDİR var olan elemanlar icin size o elemanın indexi verir
        //3)binarySearch methodundan aldığınız index 0 veya 0 dan büyükse bu o eleman arrayda var demektir.
        //4)binarySearch methodundan olmayan elemanlar icin negatif tamsayı degeri verir.
        //"-" isaretinin anlamı o elemean yok demektir.
        // sayi ise eleman olsaydı kacıncı eleman olurdu demektir.




        Arrays.sort(names);

        int result = Arrays.binarySearch(names, "a" );

        System.out.println(result);

        if (result == 0){
            System.out.println("Array has the elements"+ el);
        }else{
            System.out.println("Array has no elements "+ el);
        }

















    }


}
