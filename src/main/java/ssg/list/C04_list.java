package list03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_list {
    public static void main(String[] args) {
        /*
        bir dogal sayi listesi olusturun
        ve olusturdugunuz listedeki cift ogeleri toplayin
        */
        List<Integer> sayilar=new ArrayList<>(Arrays.asList(57,35,45,65,72,91,92,62));
        int sum=0;
        for (Integer w:sayilar
             ) {
            if (w%2==0){
                sum+=w;
            }
        }
        System.out.println(sum);


    }
}
