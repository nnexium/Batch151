package list03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02_list {
    public static void main(String[] args) {
        /*
        bir list olusturun ve bu listteki
        elemanlari alfabetik siraya gore siralayin
        */
        List<String> sehirler=new ArrayList<>();
        sehirler.add("Corum");
        sehirler.add("Yozgat");
        sehirler.add("Kirsehir");
        sehirler.add("Konya");
        sehirler.add("Mardin");
        System.out.println(sehirler);
        Collections.sort(sehirler);
        System.out.println(sehirler);


    }
}
