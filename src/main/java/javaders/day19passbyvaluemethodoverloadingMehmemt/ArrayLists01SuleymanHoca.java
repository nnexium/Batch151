package javaders.day19passbyvaluemethodoverloadingMehmemt;

/*
    1)Ayni data type'indeki coklu data'lari depolamak icin Array kullaniriz.
    2)Array'lerin bir negatif yonu var; icine koyacaginiz eleman sayisini en basta belirlemek zorundasiniz.
    3)Array'ler eleman sayisinda esnek degildirler, bu yuzden Java "ArrayList" adli yeni bir yapi olusturdu,
      bu yapi eleman sayisinda esnektir. Hic eleman koymazsaniz eleman sayisini sifir olarak ayarlar, 1000 eleman
      koyarsaniz eleman sayisini 1000 olarak ayarlar.
    4)"ArrayList" yerine sadece "List" de diyebiliriz.
    5)Java "ArrayList"leri oluşturduktan sonra Array leri iptal etmedi, cunku;
        i)Arraylar super hizlidir.
        ii)Arrayler memory de cook az yer kaplar.
    6)Arrayler "primitive data" type ları ve referencelari depolayabilir ama "Arraylist"ler "non-pirimitve" data typelarini
    depolar ve bu yuzden "Arraylist"ler Arraylerden daha çok yer kaplar.

 */


import java.util.ArrayList;

public class ArrayLists01SuleymanHoca {
    public static void main(String[] args) {
        //Arraylist nasıl oluşturulur?
        ArrayList<Integer> ages =new ArrayList<>();
        //ArrayList console a nasıl yazdirilir?
        System.out.println("ages = " + ages);
        //ArrayList e eleman nasıl eklenir?
        //1.Way
        ages.add(12);
        ages.add(24);
        ages.add(9); //add methodu elemanları giriş sırasına (insertion order) göre list'e yerleştirir.
        System.out.println("ages = " + ages);
        //2.Way
        ages.add(1,99);
        System.out.println("ages = " + ages);

        ArrayList<Integer>price = new ArrayList<>();
        price.add(23);
        price.add(33);
        //3.Way;addAll methodu bir listi diger listin icine yerleştirir
        ages.addAll(price);
        System.out.println(ages);
        //4.Way
        ages.addAll(3,price);
        System.out.println(ages);
        
        //ArrayList te eleman sayisi nasil bulunur?
        int numOfElement= ages.size();
        System.out.println("numOfElement = " + numOfElement);

        //ArrayList de specific bir eleman nasıl alinir?
        int el1 = ages.get(3);// get methodu index kullanarak istediğimiz elemanı almaya yarar.
        System.out.println("el1 = " + el1);

        //ArrayList de specific bir eleman nasıl değiştirilir/
        ages.set(6,111);
        System.out.println(ages);

        //ArrayList de içinde olup olmadığı
        boolean r1=ages.contains(919);
        System.out.println(r1);

        //ArrayList de specific bir elemanın var olup olmadığını nasıl anlarız?
        boolean a1=ages.isEmpty();
        System.out.println("a1 = " + a1);

        //ArrayList teki tum elemanları nasıl sileri?
        ages.clear();
        System.out.println(ages);

        //Example 1: Bir List'in bos olup olmadigini kontrol eden kodu yaziniz.
        ArrayList<String> names = new ArrayList<>();
        names.add("Ajda");
        names.add("Cuneyt");
        names.add("Angelina");
        names.add("Brad");

        //1.way
        if (names.size() == 0) {
            System.out.println("List Boştur");
        }else
            System.out.println("List de en az bir eleman vardir.");

        //2.Way
        if (names.isEmpty()) {
            System.out.println("List Boştur");
        }else
            System.out.println("List de en az bir eleman vardir.");



    }






}
