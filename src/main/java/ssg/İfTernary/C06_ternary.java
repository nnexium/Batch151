package ifStementsTernary01;

public class C06_ternary {
    public static void main(String[] args) {
        /* 2 tam sayınız var;
        Her iki tamsayı da pozitifse çarpma işlemi yapın
        Biri negatifse diğeri pozitif ise "çarpma nasıl yapılır bilmiyorum"
        */

        int sayi1=12;
        int sayi2=7;

        System.out.println(sayi1 > 0 && sayi2 > 0 ? sayi1 * sayi2 : "carpma nasıl yapılır bilmiyorum");



    }
}
