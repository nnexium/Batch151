package javaders.day39lambda;
//Functional Programming ve Lambda aynı anlama gelir, Interview de sorulabilir.
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {


    public static void main(String[] args) {

        List<String> myList = new ArrayList<String>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Clara");
        myList.add("Tom");
        myList.add("Angelina");

        prnitElements(myList);
        System.out.println();
        printEl(myList);
        System.out.println();
        prnitElExceptStartsWitht(myList);
        System.out.println();
        printEllengthLessThanThree(myList);
        System.out.println();
        printElLengthMoreThanFourWithUpper(myList);
        System.out.println();
        printElLenthMoreThanFourUniqueLowerCase(myList);
        System.out.println();
        printElUniqueToUpperCaseSorted(myList);
        System.out.println();
        printElUniqueLowerCaseWithLength(myList);


    }
    //Example 1: Bir Listteki elemanları console'a yazdiran method'u olusturunuz.

    public static void prnitElements(List<String> myList) {

        for (String w : myList) {
            System.out.println("w = " + w);
        }
        //2.Yo

    }

    public static void printEl(List<String> myList) {

        myList.
                stream().//akışa sunar
                forEach(t -> System.out.print(t + " "));//yazdırma

    }


    //Example 2: Bir Listteki t ile başlayanlar hariç  tüm elemanlari consola yazdiran methodu oluşturunuz.

    public static void prnitElExceptStartsWitht(List<String> myList) {
        myList.
                stream().
                filter(t -> !t.startsWith("T")).//filtreleme elemek demek.
                forEach(t -> System.out.print(t + " "));
    }

    //Example 3:Bir Listte character sayisi 4 den az olan tum elemanlari console'a yazdiriniz.

    public static void printEllengthLessThanThree(List<String> myList) {
        myList.
                stream().
                filter(t->t.length()<4).//azaltma aralarından bir şeyi seçme varsa filter methodu kullanılır.
                forEach(t-> System.out.print(t+" "));



    }

    //Example 4:Bir Listtekicharacter sayisi 4 ten cok olan tum elemanlari buyuk harflerle console'e yazdiran methodu olusturunuz.

    public static void printElLengthMoreThanFourWithUpper(List<String> myList){
        myList.
                stream().
                filter(t->t.length()>4).
                map(t ->t.toUpperCase()).//yapısını değiştirme, elindeki listeyi değiştirme varsa kullanılır.
                forEach(t-> System.out.print(t));


        }
    //example 5:Bir Listteki character sayisi 4 den cok olan tum elemanlari tekrarsiz olarak kucuk harflerle console'a yazdiran methodu yazdirin.

    public static void printElLenthMoreThanFourUniqueLowerCase(List<String> myList){
        myList.stream().
                filter(t->t.length()>4).//eleme yapar, filtreleme yapar
                distinct().//tekrarsız
                map(t->t.toLowerCase()).//yapısını değiştirir
                forEach(t-> System.out.print(t+" "));

    }
    //Example 6:Bir Listteki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada console'a yazdiran method'u oluşturunuz

    public static void printElUniqueToUpperCaseSorted(List<String>myList){
        myList.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted().//natural order'a göre sıralama yapar, alfabetik,
                forEach(t-> System.out.print(t+" "));


    }
    //Example7: Bir Listteki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarine kucukten buyuğe siralayarak consola yazdiran methodu yazın

    public static void printElUniqueLowerCaseWithLength(List<String>myList){
        myList.
                stream().
                distinct().//Tekrarsız yapar,
                map(t->t.toLowerCase()).
                sorted(Comparator.comparing(t->t.length())). //Comparator.comparing karşılaştırıcı karşılaştırma şartını ben yazacaksam kullanilir.
                forEach(t-> System.out.print(t+" "));


    }

    }
