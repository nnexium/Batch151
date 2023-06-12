package javaders.day17multidimensionalArray01;


/*
Method oluşturmak icin aşağıdaki 5 adımı takip ediniz
1-Access modifier yazılacak
2-Return Type yazılacak
3-Method ismi yazılacak
4-Methed parantez
5-{} parantezleri yazılacak

note= main methoun icindeki tum methodlar static olmalıdır.
Bir methodu static yapmak

pas by value
1-Java  Pass by Value kullanır
2-Yani Java methodların orjinal degeri degistirmesine musaade etmez
3-Java methodlara deger yollarken orjinal degerin kopyasını olusturur ve o kopyayı methoda yollar,
Method kopya deger uzerinde degisiklik yapar, boylece orjinal deger korunmus olur
4-Java esnek bir dildir. ıstersek yazdıgımız kod ile orjinal degerin degismesini de temin edebiliriz.

Pass by reference
1-Pass by Reference da method a reference yollanir.
2-Reference adres demektir. Adres yollanince method adresi kullanarak orjinal degere ulası ve
orjinal degeri degistirir.
Bu yüzden "C#" gibi Pass by Reference kullanan dillerde method variable nin orjinal degeri degistirir

 */
public class PassByValue01 {
    public static void main(String[] args) {

        int shirtPrice = 200;
        System.out.println(discount("Student", shirtPrice));

        System.out.println(shirtPrice);

    }

    //Discount Methodu oluşturunuz.

    public static int discount(String type, int price) {

        switch (type) {
            case "Student":
                price = price - 20;
                break;
            case "Veteran":
                price = price - 40;
                break;
            case "Senior":
                price = price - 30;
                break;
            default:
                price=price;
        }

        return price;
    }


}
