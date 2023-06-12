package practice.day_01;

public class C03_Ascii {
    public static void main(String[] args) {

        //Cem isminin icerisinde bulunan harfleri kullanmadan yaziniz.

        /* ASCİİ

          B ==> 66           C ==> 67
          D ==> 68           E ==> 69
          L ==> 76           M ==> 77

        */

        char ilkKarakter = 'B'+1;    // C

        char ikinciKarakter = 'D'+1;   // E

        char ucuncuKarakter = 'L'+1;    // M

        System.out.println("" + ilkKarakter + ikinciKarakter + ucuncuKarakter);


    }

}
