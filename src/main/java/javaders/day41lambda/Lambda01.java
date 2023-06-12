package javaders.day41lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(8);
        nums.add(9);
        nums.add(7);
        nums.add(-4);
        nums.add(9);
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(15);

        System.out.println(getTheSumOfSquareOfOdds1(nums));
        System.out.println(getTheSumOfSquareOfOdds2(nums));
        System.out.println(getTheSumOfSquareOfOdds3(nums));

        System.out.println(getMultiplicationOfSquareOfEvens(nums));
        System.out.println(getTheSumOfEvenMaxAndOddMin(nums));//15

        System.out.println(getTheSumOfEvenLessThanSevenMaxAndOddMinGreaterThanEight(nums));//6+9=15

    }

    //Example 1: Verilen bir list'teki tek sayi olan elemanlarin kareleri toplamini hesaplayan method olusturunuz.
    public static int getTheSumOfSquareOfOdds1(List<Integer> nums){
        return nums.
                stream().
                filter(t->t%2!=0).
                map(t->t*t).
                reduce(0, (t,u)->t+u);
    }

    public static int getTheSumOfSquareOfOdds2(List<Integer> nums){
        return nums.
                stream().
                filter(Utils::isOdd).
                map(Utils::getSquare).//Ihtiyaciniz olan method Java Class'larinda yoksa Utils Class olusturup icinde
                //ihtiyaciniz olan method'u olusturunuz ve method reference kullaniniz.
                reduce(0, Math::addExact);//Class Ismi :: Method Ismi ==> Method Reference
    }

    public static int getTheSumOfSquareOfOdds3(List<Integer> nums){
        return nums.
                stream().
                filter(Utils::isOdd).
                map(Utils::getSquare).
                reduce(Math::addExact).
                get();// get() method'u Optional<Integer> i Integer'a cevirir.
    }

    //Example 2: Verilen bir list'teki cift sayi olan elemanlarin tekrarsiz olarak kareleri carpimini hesaplayan method olusturunuz.
    public static int getMultiplicationOfSquareOfEvens(List<Integer> nums){
        return nums.
                stream().
                filter(t->t%2==0).
                map(t->t*t).
                distinct().
                reduce(1, (t,u)->t*u); //147456
    }

    //Example 3: Verilen bir list'teki cift sayi olan elemanlarin maximum degeri ile tek sayi olan elemanlarin minimum degerinin
    //           toplamini hesaplayan method'u olusturunuz.
    public static int getTheSumOfEvenMaxAndOddMin(List<Integer> nums){
        int maxEven = nums.stream().distinct().filter(t->t%2==0).reduce((t,u)->t>u ? t : u).get();
        //Normalde 3 farklı döndüren reduce methodu var, bizim kullandığımız optional Integer döndürüyor, biz de kendi
        //methodumuzu oluştururken int döndürmesini istedik, bu yüzden hata verir, get() methodu ile bu hatayı giderriz.
        int minOdd = nums.stream().distinct().filter(t->t%2!=0).reduce((t, u)->t<u ? t : u).get();
        return maxEven + minOdd;
    }

    //Example 4: Verilen bir list'teki cift sayi olan elemanlarin 7 den kucuk maximum degeri ile tek sayi olan elemanlarin
    //           8 den buyuk minimum degerinin toplamini hesaplayan method'u olusturunuz.
    public static int getTheSumOfEvenLessThanSevenMaxAndOddMinGreaterThanEight(List<Integer> nums){
        int max = nums.stream().distinct().filter(t->t%2==0 && t<7).reduce((t,u)->t>u ? t : u).get();
        int min = nums.stream().distinct().filter(t->t%2!=0 && t>8).reduce((t,u)->t<u ? t : u).get();
        return max + min;
    }

    //Example 4: Bir List'teki character sayisi 4 den cok olan tum elemanlari buyuk harflerle console'a yazdiran method'u olusturunuz.
    public static void karakSaysDorttenCokBykHrfYazdir(List<String >iller) {
        System.out.print("4) ");
        iller.
                stream().//akisa alindi
                filter(t ->t.length()>4).//karakter sayisi 4 ten fazzla olanlar filtrelendi
                map(t->t.toUpperCase()).//datalarin yapisini degistirir
                forEach(t-> System.out.print(t+" "));

    }

    //Example 5: Bir List'teki character sayisi 4 den cok olan tum elemanlari tekrarsiz olarak kucuk harflerle console'a yazdiran method'u olusturunuz.

    public static void karakSaysDorttenCokTkrszKucukHrfYazdir(List<String >iller) {
        System.out.print("5) ");
        iller.
                stream().
                distinct().//Benzersiz tekrarsiz yapar
                filter(t->t.length()>4).//karakter sayisi 4 ten fazla olanlari aldi
                map(t->t.toLowerCase()).//datanin yapisini degistirdi hepsini kucuk harfe donusturdu
                forEach(t-> System.out.print(t+" "));

    }

    //Example 6: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada console'a yazdiran method'u olusturunuz.

    public static void tkrszBuyukHrfAlfabetikSiraYazdir(List<String >iller) {
        System.out.print("6) ");
        iller.
                stream().
                distinct().//tekrarsiz
                map(t->t.toUpperCase()).//yapisi gegisir buyuk harfe cevirdi
                sorted().//siralama yapar
                forEach(t-> System.out.print(t+" "));

/*
     sorted()==> 2 turlu kullanimi vardir.
     i) Icerisine arguman verilmezse,burada oldugu gibi
        sorted()natural order'a gore kucukten buyuge dogal siralaam yapar
     ii) sorted(Comparator) icerisine arguman verilirse bizim belirledigimiz parametreye gore siralama yapar
 */
    }
    //Example 7: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.
    public static void tkrszKucukHrfUzunluklarinaGoreKcktnBygeYazdir(List<String >iller) {
        System.out.print("7) ");
        iller.
                stream().
                distinct().
                map(t -> t.toLowerCase()).
                sorted(Comparator.comparing(t -> t.length())).// Comparator Karsilastirici comparing karsilastir uzunluklarina gore
                forEach(t -> System.out.print(t + " "));
        // sorted(Comparator.comparing(t->t.length())) karsilastirma sartlarini biz belirliyorsak
        // sorted() icerisine Comparator ile sartimizi belirtiriz
        //Eger listede kiyas sirasinda ayni sartlar varsa listeye once eklenen once yazdirilir

    }
    // Example 8: Tum elemanlarin ilk harfini buyuk digerlerini kucuk yazdiran methodu olusturunuz

    public static List<String> ilkHarfBykDigerKucukYazdir(List<String >iller) {
        System.out.print("8) ");
        iller.
                stream().
                map(t->t.substring(0,1).toUpperCase()+t.substring(1).toLowerCase()).
                forEach(t-> System.out.print(t+" "));
        return iller;
    }
    // Example 9: Ilk Harfi "E" veya "S" olanlari bir liste icerisinde yazdiran methodu olusturunuz

    public static List<String> ilkHarfEveyaSOlanlariYazdir(List<String >iller) {
        System.out.print("9) ");
        return     iller.
                stream().
                filter(t->t.startsWith("E") || t.startsWith("S")).
                collect(Collectors.toList());// bir akisin sonuclarini bir listin icinde toparlamak icin kullanilir
    }
}