package ifStementsTernary01;

public class C04_ternary {
    public static void main(String[] args) {
        //   verilen sayi 100'den buyukse sayi'nin karesini  alip yazdiran
        //   100'den kucukse " sayi 100'den buyuk olmali" yazdiran
        //   bir ternary olusturalim
        int sayi=100;
        //Ternary'de sonuc iki farkli data turunden cikabilir
        System.out.println(sayi>= 100 ? sayi * sayi : "sayi 100'den buyuk olmali");


    }
}
