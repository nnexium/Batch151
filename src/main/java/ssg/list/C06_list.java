package list03;

import java.util.List;

public class C06_list {
    public static void main(String[] args) {
        // bir listede ortalamanin ustunde olan element sayisini bulunuz
        List<Integer>sayilar=List.of(5,10,15,25,30,35,45);
        double ort=0;
        double sum=0;
        int counter=0;
        for (Integer w:sayilar
             ) {
            sum+=w;
            }


        ort=sum/sayilar.size();

        for (Integer w:sayilar
             ) {
        if (w>ort){
            System.out.println(w);
            counter++;

        }
            }System.out.println("ortalamadan buyuk sayi sayisi : "+counter);
    }
}
