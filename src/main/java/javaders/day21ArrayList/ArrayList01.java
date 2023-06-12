package javaders.day21ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Giresun");
        cities.add("Yozgat");
        System.out.println(cities);//[Miami, Giresun, Yozgat, Barcelona, Miami, Giresun, Giresun, Yozgat]

        //ArrayList'te bir elemanin ilk gorunumu nasil silinir?
        //remove() methodu bir elemanın ilk görümünü siler
        System.out.println(cities.remove("Miami"));//true
        System.out.println(cities);//[Giresun,Yozgat,Barcelona,Miami,Giresun,Yozgat]

        //ArrayList'te bir eleman indexi kullanarak nasil silinir?
        System.out.println(cities.remove(2));//Barcelona
        System.out.println(cities);//[Giresun, Yozgat, Miami, Giresun, Giresun, Yozgat]

        //remove() methodu eleman ile kullanılırsa ilk görünümü siler.
        //remove() methodu eleman ile kullanılırsa size o elemanı silip silmediğini ifade eden true yada false verir.

        //Example 1: Bir Integer list oluşturun ve 12 elemanını siliniz.
        //Arraylist oluştururken sağ tarafa (constructor) Arraylist yazmak zorundasınız.
        //Ama sol tarafa ister Arraylist yazın ister List yazın ikiside çalışır.
        //Detayları Collections konusunda göreceğiz.

        List<Integer> ages = new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

        //        ages.remove(12);
        //        System.out.println(ages);
        //1 yol
        //        Integer nonPrimitive = 12;
        //        ages.remove(nonPrimitive);
        //        System.out.println(ages);

        //2 yol Recommended
        ages.remove((Integer) 12);
        System.out.println(ages);
        //3 yol
        //        ages.remove(ages.indexOf(12));
        //        System.out.println(ages);

        //Kısa yoldan bir list oluşturmak için lis.of() methodunu kullanabiliriz.
        //List.of methodu değiştirilemez ve bir liste oluşturmak için kullanılır.
        //Bu method ile oluşturulan list değiştirmeye yönelik methodları kullanmaz.
        List<Character> initials =List.of('a','b','c','d');
        System.out.println(initials);//[a, b, c, d]
        //initials.add('e');
        //initials.remove('0');
        //initials.set(0,'u');
        System.out.println(initials);//[a, b, c, d]

        //indexOf(aranan karakter) methodu aranan karakterin ilk görünümünün indexini verir.
        int r1= initials.indexOf('c');
        System.out.println(r1);// 2

        //lastIndexOf() methodu aranan karakterin son görünümünün indexini verir.
        int r2 = initials.lastIndexOf('a');
        System.out.println(r2);

        //Example 2: Bir listteki tekrarsız elemanları console'a yazdırınız.

        List<Integer> heights = List.of(3,13,3);
        for ( int w: heights) {
            if ( heights.indexOf(w)!= heights.lastIndexOf(w)){
                System.out.println(w);
            }

        }








    }
}
