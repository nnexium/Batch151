package list03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_list {
    public static void main(String[] args) {
        // verilen bir listede tekrar eden sayilari sadece 1 tane yapan
        // bir method olusturun
        // orn : [1, 5, 3, 5, 6, 1, 7]  bu listi
        //       [1, 3, 5, 6, 7] bu hale donusturun

        List<Integer>sayilar=new ArrayList<>(Arrays.asList(1, 5, 3, 5, 6, 1, 7));
        tekrarsizListOlustur(sayilar);
    }

    public static void tekrarsizListOlustur(List<Integer> sayilar) {
        List<Integer>yeniList=new ArrayList<>();
        for (int i = 0; i < sayilar.size(); i++) {
           if (!yeniList.contains(sayilar.get(i))){
               yeniList.add(sayilar.get(i));
           }

        }
        System.out.println(yeniList);

    }
}
