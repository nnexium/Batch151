package javaders.day40Lambda01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {
    public  static void main(String[] args) {

        List<String> iller=new ArrayList<String>(Arrays.asList("Van","MUS","Gumushane","Kutahya","Ankara","Ordu","Mus","Gaziantep","Hatay","Edirne"));
        bykHrfLenghtArtanDistinc(iller);
        System.out.println();
        bykHrfSonHarfArtanDistinc(iller);
        System.out.println();
        bykHrfLenghtArtanDistincLenghtAlfabetikSira(iller);
        System.out.println();
        System.out.println(krkSysBesFzl(iller));
        System.out.println();
        System.out.println(hIleBaslayanOrRIleBitenElSil(iller));
        System.out.println();
        System.out.println(ciftKarakter(iller));
        System.out.println();

    }//main

    // 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore, artan sirada ,tekrarsiz olarak yazdiriniz

    public static void bykHrfLenghtArtanDistinc(List<String>iller) {
        System.out.println(1);
        iller.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t->System.out.print(t+" "));

    }


    // 2) Tum list elemanlarini buyuk harfle, son harflerine gore, artan sirada ,tekrarsiz olarak yazdiriniz

    public static void bykHrfSonHarfArtanDistinc(List<String>iller) {
        System.out.println("2)");
        iller.
                stream().
                distinct().
                map(t->t.toUpperCase()).//Lambda Expression
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                forEach(t->System.out.print(t+" "));
    }



    // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar

    public static void bykHrfLenghtArtanDistincLenghtAlfabetikSira(List<String>iller) {
        System.out.println("3)");
        iller.
                stream().
                distinct().
                map(String::toUpperCase).//Method referance yöntemi, eğer bu yöntem varsa bu yöntem kullanmak mantıklı
                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).
                //Once uzunluklarina gore siraladik.thenComparing() ile natural order'a gore siraladik
                forEach(System.out::println);//forEach(t -> System.out.print(t + " "));


    }


    // 4) Karakter sayisi 5 ten fazla olanelemanlari siliniz

    public static List<String> krkSysBesFzl(List<String>iller) {
        System.out.println("4)");
        iller.removeIf(t -> t.length()>5);

        return iller;
        //Note:Bazi durumlarda stream methodu aradigimiz methodlari vermez bu nedenle akisa sunmadan
        // "iller." dedikten sonra removeIf() kullandik
        //  Note 2: removeIf() methodu silme islemi bir sarta bagli ise kullaniriz
    }

    // 5)"H" ile baslayan veya "r" ile biten elemanlari siliniz
    public static List<String> hIleBaslayanOrRIleBitenElSil(List<String>iller) {
        System.out.println("5)");
        iller.removeIf(t -> t.startsWith("H") || t.endsWith("r"));

        return iller;

    }



    // 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin




    //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.

    public static List<String> ciftKarakter(List<String> iller){
        System.out.println("7)");
        iller.stream().filter(t->t.length()%2==0).collect(Collectors.toList());

        return iller;
    }



    }



