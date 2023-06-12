package list03;

import java.util.ArrayList;
import java.util.List;

public class C01_list {
    public static void main(String[] args) {
        /*
        soru 1) bir list olusturup eleman ekleyin ve yazdirin
        */
        List<Integer>myList=new ArrayList<>();
        myList.add(11);
        myList.add(21);
        myList.add(24);
        myList.add(92);
        System.out.println(myList);
        myList.add(1,15);
        System.out.println(myList);

    }
}
