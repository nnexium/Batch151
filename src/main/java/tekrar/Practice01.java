package tekrar;


import java.util.Arrays;
import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {







        //Kullanıcıdan aldığınız bir  şekil ile aşağıdaki şekli oluşturan kodu yazınız. ucgen piramit


        Scanner input = new Scanner(System.in);
/*
        System.out.println("Lutfen bir karakter giriniz");

        char ch = input.next().charAt(0);

        System.out.println(" " + " " + ch + " " + " ");
        System.out.println(" " + ch + " " + ch + " ");
        System.out.println(ch + " " + ch + " " + ch);

        // lUTFEN İKİ SAYI GİRİNİZ VE DÖRT İŞLEM YAPARAK HESAP MAKİNESİ OLUŞTURUNUZ

        System.out.println("Lutfen ilk sayıyı giriniz");
        Double sayi1 = input.nextDouble();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        Double sayi2 = input.nextDouble();

        System.out.println("Toplama"+(sayi1+ sayi2));
        System.out.println("Çıkarma"+(sayi1- sayi2));
        System.out.println("Çarpma"+ sayi1 * sayi2);
        System.out.println("Bolme"+(sayi1 / sayi2));

        //Ex Kullanıcıdan alacığınız beş basamaklı bir yasının ilk iki ve son iki rakamları toplamını bulan kodu yaziniz

        System.out.println("Lutfen bir sayi giriniz");
        int number = input.nextInt();
        
        int ilkIkirakam = number/1000;
        System.out.println(ilkIkirakam);

        int İlkIkitoplam = (ilkIkirakam%10)+(ilkIkirakam/10);
        System.out.println("İlkIkitoplam = " + İlkIkitoplam);
        
        int sonIkirakam = number%100;
        System.out.println("sonIkirakam = " + sonIkirakam);

        int sonIkitoplam = (sonIkirakam%10)+(sonIkirakam/10);

        System.out.println(İlkIkitoplam + sonIkitoplam);

        //2.yol
        System.out.println("Lutfen sayı giriniz");
        int numb = input.nextInt();

        int first = numb%10;
        int second =number/10%10;
        int third =number%10;
        int fourth =number/10%10;
        int fifth =number/10%10;

        //Ex:Muslumanlardan bir gün alın eger cuma ise muslumanlar icin kutsal gün,
        //cumartesi ise yahudiler icin, pazar ise hristiyanlar icin kutsal gün yazın

        System.out.println("Lutfen gün ismi giriniz");
        String gunIsmi = input.next().toLowerCase();

        if (gunIsmi.equals("cuma")){
            System.out.println("Muslumanlar icin kutsa gün");



        } else if (gunIsmi.equals("cumartesi")) {
            System.out.println("Yahudiler icin kutsal gün");
        } else if (gunIsmi.equals("pazar")) {
            System.out.println("Hristiyanlar icin kutsal gün");
        }else{
            System.out.println("Kutsal bir gün degil");
        }


    //Kullanıcıdan 3 karakter daha uzun bir kelime isteyiniz. eger karakter sayısı 3 ve 3 karakterden kucuk ise
    //    3 karakterden daha uzun bir kelime girmelisiniz yazdırınız, degil ise kelimenin son uc harfini ekleyerekyazdır

        System.out.println("Lutfen bir kelime giriniz");
        String kelime = input.next();



        if (kelime.length()<=3){
            System.out.println("3 karakterten uzun bir kelime giriniz");
        }else{
            String sonUcharf = kelime.substring(kelime.length()-3);
            System.out.println(sonUcharf+kelime+sonUcharf);
        }



    /*
    Kullanıcıdan ayrı ayrı iki kelime sisteme girmesini isteyin, eger ilk kelimenin karakter sayısı cift ise,
    ikinci kelimeyi birinci kelimenin ortasına koyun. ilk kelimenin karakter sayısı tek ise konsola
    "ilk kelimenin ortasına ikinci kelimeyi koyamazsın cunku ilk kelime tek karakterli"yazdirin.

     */
        /*
        System.out.println("Lutfen ilk kelimeyi giriniz");
        String kelime1 = input.next();
        System.out.println("Lutfen ikinci kelimeyi giriniz");
        String kelime2 = input.next();

        if (kelime1.length()%2==0){
            String ilkYarisi=kelime1.substring(0,kelime1.length()/2);
            String Ikinciyarisi=kelime1.substring(kelime1.length()/2);
            System.out.println(ilkYarisi+kelime2+Ikinciyarisi);

        }else
            System.out.println("İlk kelime tek karakterli, ikinci kelimeyi koyamazsın");
        */


        /*
        Bir restoranda musteriler menuden yemeklerini secerler restoran musterilerin sectiği yemegi pisirmek icin bir
        program yazilmasini ister örnegin musteriler menuden hangi yemegi secerse o menunun musteriye hazirlanip
        sunulduğu ve ucretin belirlendigi bir program yazar



         */
        /*
        String yemek = "Hamburger";

        switch (yemek) {
            case "Hamburger":
                System.out.println("Hamburger menusu 200");
                break;

            case "Pizza":
                System.out.println("Pizza menusu 300");
                break;
            case "Tavuk":
                System.out.println("Tavuk menusu 500");
                break;
            default:
                System.out.println("Yemek listede yok");
        }
        */

        /*
        Bir arac kiralama sitesinde secilen araba markasına göre, degisen kiralama ucretine göre toplam odenecek
        fiyatı gösteren kodu yaziniz.
        Suv=500
        Sedan=400
        Hatchback=350
        geriye kalanlar=300
        double toplamUcret = kiralamaUcreti *kiralanacakGunSayisi;

         */
        /*
        String aracTuru = "Suv";

        int kiralanacakGunSayisi=5;

        double kiralamaUcreti;

        switch (aracTuru){
            case "Suv":
                kiralamaUcreti=500.0;
                break;
            case "Sedan":
                kiralamaUcreti=400.0;
                break;
            case "Hatchback":
                kiralamaUcreti=350.0;
                break;
            default:
                kiralamaUcreti=300.0;
                break;

        } double toplamUcret = kiralamaUcreti *kiralanacakGunSayisi;
        System.out.println("toplamUcret = " + toplamUcret);

        */

        /*
        Hayvanat bahcesinde ziyaretcilere yemek vermek icin bir robot kullanılıyor.
        Ziyaretciler hangi hayvani beslemek istiyorsa onun ismini yazsin ve Robotta gidip o hayvani
        beslesin.Ornegin ziyaretcilerin "fil" hayvanı beslemek istediklerini söylediklerinde fil hayvanın yanına gider
        ve onlara yemek verir, elephant, leon, giraffe, belirtilen hayvan bulunamadı.

         */
/*
        String hayvanTuru = "leon";

        switch (hayvanTuru) {
            case "leon":
                System.out.println("Leon'u besleyiniz");
                break;
            case "giraffe":
                System.out.println("Giraffe'yi besleyiniz");
                break;
            case "elephant":
                System.out.println("Elepahnt'ı besleyiniz");
                break;
            default:
                System.out.println("Baska hayvan yok");
        }

*/
        /*
        Asagıdak! seçenekler dogrultusunda gereken kodu yazınız.
        a) B!r üçgen!n !k! kenarının uzunlugu es!tse "Ik!zkenar Üçgen".
                b) B!r üçgen!n tüm kenarlarının uzunlugu es!tse "Eskenar Üçgen".
                c) a ve b kosulları saglanmıyorsa "Çes!t Kenar Üçgen"
   int a = 5;
        int b = 3;
        int c = 4;

        if (a==b);



*/

        //verilen bir string de kucuk harfleri console yazmayiniz

        String t = "Java Learning";

        String ters = "";

        for (int i =t.length()-1; i >=0 ; i--) {
            ters=ters+t.substring(i,i+1);

        }
        System.out.println(ters);


     int arr[] = new int [5];
        System.out.println(Arrays.toString(arr));
        
        arr[0] = 12;
        arr[1] = 23;
        arr[2] = 9;
        arr[3] = 38;
        arr[4] = 27;
        
        int sum = 0;

        for ( int w : arr  ) {
            sum=sum+w;
        }
        System.out.println("sum = " + sum);



        char ch [] = new char [3];
        
        ch [0] ='J';
        ch [1] ='P';
        ch [2] ='A';
        
        int carpim =1;

        for ( char w :ch   ) {
            carpim=carpim*w;
        }

        System.out.println("carpim = " + carpim);
        
        int grades []  = {67, 98, 100, 34, 76};
        System.out.println(Arrays.toString(grades));

        Arrays.sort(grades);
        System.out.println(Arrays.toString(grades));

        System.out.println(grades[0]+grades[grades.length-1]);


        }
}
