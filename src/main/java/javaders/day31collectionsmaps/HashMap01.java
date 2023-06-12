package javaders.day31collectionsmaps;

/*
        MY NOTES:
            Map'lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir.
            "key" kismi tekrarsiz, "value" tekrarli olabilir.
            Map'ler "key" ve "value" structure'ini kullanir.
            Map'lerdeki elemanlara "Entry" denir.
            Elemanlarin tamanina ise "EntrySet" denilir.
            "Entry"ler tekrarsiz oldugu icin "EntrySet"denilir.
            "Key" ve "Value" lar ayri ayri data type'larinda olabilirler.
            "Map"'ler Collection degildir, farkli bir yapidir.

            HashMap'ler "entry"leri rastgele siralar, bu yuzden en hizli map'dir.
     */

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {

    public static void main(String[] args) {

        //Map nasil olusturulur?
        HashMap<String, Integer> countryPopulation = new HashMap<>();

        //Map'e entry nasil eklenir?
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("Albania", 3000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkiye", 83000000);
        countryPopulation.put("Netherland", 18000000);
        System.out.println(countryPopulation);//{Turkiye=83000000, Netherland=18000000, USA=400000000, Germany=83000000, Albania=3000000}

        countryPopulation.get("USA");
        //get() methodu key in anlamını verir.
        int usaPopulation = countryPopulation.get("USA");
        System.out.println("usaPopulation = " + usaPopulation);

        //Butun key'leri nasıl alabiliriz
        Set<String> keys = countryPopulation.keySet();
        System.out.println(keys);

        //Butun valueleri nasil alaribiriz.
        Collection<Integer> values = countryPopulation.values();
        System.out.println("values = " + values);

        //Ex1:CountryPopulation mapindeki ulkelerin nufuslarinin ortalamsı nedir?
        Collection<Integer> value = countryPopulation.values();

        double sum = 0;
        for ( Integer w : value  ) {
            sum += w;
        }
        System.out.println(sum/ value.size());
        //entryleri alır keyvalue olarak key'in içine koyarkalıp olarak.
        //Hiç bir loop maplerle kullanilamaz.ENTRYSET kullanarak looplarla kullanılır.
        //Sadece entryler arasında gezmek istediğimizde loop kullanabiliriz.
        Set<Map.Entry<String,Integer>>entries= countryPopulation.entrySet();
        System.out.println(entries);

        //Ex:countryPopulation Mapindeki ulkelerin isimlerinin character sayisi ile nufuslarinin toplamini bulunuz?

        int toplam = 0;
        for ( Map.Entry<String,Integer> w : entries   ) {
            toplam = toplam +w.getKey().length()+w.getValue();
        }
        System.out.println("toplam = " + toplam);

    }
}
