package javaders.day19passbyvaluemethodoverloadingMehmemt;

import java.util.ArrayList;
import java.util.List;
        //Bir methodu öğrenirken aşağıdaki şekilde öğrenin
//     1)O method ne iş yapar?
//     2)O method nasıl kullanılır?
//     3)O method size neyi verir?

public class ArrayList02Suleymanhoca {
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
        System.out.println(cities);

        //ArrayList te bir elemanın ilk görünümü nasıl silinir?
        System.out.println(cities.remove("Miami"));
        System.out.println(cities);

        //ArrayList te bir elemanın index kullanılarak nasıl silinir.
        System.out.println(cities.remove(2));
        System.out.println(cities);

        //ArrayList oluştururken en başa ArrayList yerine List de yazabilirsiniz.
        List<Integer> ages = new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

        //Ex:1 12 elemanını List den siliniz
        //ages.remove(12);//primitive int olur primitive int remove method icinde kullanılınca Java onu index zanneder.
        //Java ya 12 nin index olmadığını soylemek icin primitive int yerne wrapper class integer kullanmalıyız

        ages.remove((Integer)12);
        System.out.println(ages);
        
        //Bir ArrayList teki bir elemanın tum görünümlerini nasil sileriz?
        List<String> citiesToRemove = new ArrayList<>();
        citiesToRemove.add("Giresun");
        citiesToRemove.add("Yozgat");
        
        cities.removeAll(citiesToRemove);
        System.out.println(cities);
        //Kısa yoldan bir list oluşturmak icin aşagıdaki list.of() methodu kullanilabilir.
        List<Character> initials = List.of('a', 'k', 'c', 'd', 'k');
        System.out.println("initials = " + initials);

        List<Character> letters= List.of('a', 'c', 'k', 'd', 'k');
        System.out.println(letters);

        //İki ArrayList in birbirine eşit olup olmadığını nasıl anlarız
        //equals() methodu aynı elemanlar aynı index de olduğu surece true verir.
        boolean r1 = initials.equals(letters);
        System.out.println("r1 = " + r1);

        //İndexof ilk görünüm indexi verir
        int r2 = initials.indexOf('k');
        System.out.println(r2);
        //Lastİndexof son görünüm indexi verir
        int r3 =initials.lastIndexOf('k');
        System.out.println("r3 = " + r3);

        //Ex bir listteki tekrarsız elemanları console a yazdiran kodu yaziniz.
        List<Double> prices = List.of(2.5, 1.25, 2.5, 3.75, 1.25, 4.0);

        for (Double w : prices ) {
            if (prices.indexOf(w)== prices.lastIndexOf(w)){
                System.out.print(w + " ");
            }
        }

        //Ex: Bir List te tekrarlı eleman olup olmadığını gösteren kodu yaziniz.
        System.out.println("********");
        List<Double> heights = List.of(2.5, 1.25, 3.75, 2.5, 4.0);
        int counter = 0;
        for ( Double w: heights ) {

            if (heights.indexOf(w)!=heights.lastIndexOf(w)){
                counter++;
            }
        }
        if (counter==0){
            System.out.println("All elements are uniqe in the list");
        }else
            System.out.println("At least one elements is not unique in the list");


    }
}
