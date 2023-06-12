package practice.day_02_pratice;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {



 /*

Bir restoranda, müşteriler menüden yemeklerini seçerler.
Restoran, müşterilerin seçtiği yemeği pişirmek için bir
program yazilmasini ister. Örneğin, müşteriler menuden hangi yemegi
secerse  o menunun musteriye hazirlanip sunuldugu ve ucretin
belirlendigi bir program yaziniz

*/

        String yemek = "Pizza";

        switch(yemek) {
            case "Hamburger":
                System.out.println("Hamburger 200TL");
                break;
            case "Pizza":
                System.out.println("Pizza 500TL");
                break;
            case "Tavuk":
                System.out.println("tavuk 700TL");
                break;
            default:
                System.out.println("Gecersiz yemek");
        }


/*
Bir arac kiralama sitesinde secilen araba markasına göre değisen kiralama ucretine göre toplam ödenecek fiyatı gösteren kodu yaziniz

    Suv = 500
    Sedan =400
    Hatcback = 300


 */


        String arabaModel = "Suv";
        int kiralanacakGunSayisi=5;
        double kiralamaUcreti;

        switch (arabaModel){
            case "Suv":
                kiralamaUcreti=500;
                break;
            case "Sedan":
                kiralamaUcreti =400;
                break;
            case "Hatcback":
                kiralamaUcreti =300;
                break;
            default:

        }
  //      System.out.println("ToplamUcret=" + kiralananacakGunSayisi*arabaModel);




        /*
        Hayvanat bahçesinde ziyaretçilere yemek vermek için bir robot kullanılıyor.
        Ziyaretciler hangi hayvani beslemek istiyorsa onun ismini yazsin  ve Robotta
        gidip o hayvani beslesin.Örneğin, ziyaretçilerin "fil" hayvanını beslemek
        istediklerini söylediklerinde, robot fil hayvanının yanına gider ve
        onlara yemek verir.Ziyaretçilerin hangi hayvanları beslemek istediklerini
        kontrol eden bir program yaziniz, elephants, leon, giraffe,
 */







    }//main
}
