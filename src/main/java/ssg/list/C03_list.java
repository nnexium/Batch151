package list03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_list {
    public static void main(String[] args) {
         /*
        bir dogal sayi listesi olusturun
        ve olusturdugunuz listedeki tum ogeleri toplayın
        */
        List<Integer>sayilar=new ArrayList<>(Arrays.asList(57,35,45,65,72,91));
        System.out.println(sayilar);
        int sum=0;
        for (Integer w:sayilar
             ) {
            sum+=w;
        }
        System.out.println(sum);




    }
}
