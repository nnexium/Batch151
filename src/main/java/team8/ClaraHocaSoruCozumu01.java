package team8;


import java.util.Scanner;

public class ClaraHocaSoruCozumu01 {
    public static void main(String[] args) {

        // Soru-1: Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz dort islemden biri ile isleme koyup sonucun yazdiriniz
        // Cevap:

        Scanner input = new Scanner(System.in);
        /*
        System.out.println(" toplama için 1\n çikarma için 2\n bolme için 3\n çarpma için 4");
        int islem= input.nextInt();
        System.out.println("Lutfen iki sayı giriniz");
        int IlkSayi= input.nextInt();
        int IkinciSayi= input.nextInt();

        if (islem==1) {
            System.out.println("Toplama =" + IlkSayi + IkinciSayi);
        } else if (islem==2) {
            System.out.println("Cıkarma" + (IlkSayi - IkinciSayi));
        }else if (islem==3) {
            System.out.println("Bolme" + (IlkSayi / IkinciSayi));
        } else if (islem==4) {
            System.out.println("Carpma" + (IlkSayi * IkinciSayi));
        } else
            System.out.println("Hatalı secim yaptınız");

*/
        /*
        Soru-2: Kullanicidan 3 tene pozitif  tam sayi alniz. Bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	         Eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
	        INFO-->üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
	        a+b>c>a-b
		          a+c>b>a-c
	              b+c>a>b-c
		          a=b=c ise es kenar ucgen
         */
/*
        System.out.println("Lutfen uc tam sayı giriniz");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a + b > c && a - b < c && a + c > b && a - c < b && b + c > a && b - c < a){
            if(a==b&& b==c){
                System.out.println("Eskenar Ucgen ");
            }else
                System.out.println("Ucgen ama eskenar ucgen degil");
        }else
            System.out.println("Ucgen degil");
/*

Soru-3: Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
	        INFO : BMI = kilo(kg) /(boy*boy)(m)
		           BMI <=20 oldukca zayifsiniz
		           20<BMI<=25 Normal sinirlardasiniz
		           25<BMI<=30 Sisman kategorisindesiniz
		           30<BMI ==> Obez grubundasiniz


        System.out.println("Lutfen boy verisi giriniz");
        double boy = input.nextDouble();
        System.out.println("Lutfen kilo verisi giriniz");
        double kilo = input.nextDouble()/100;

        Double BMI = (kilo/(boy*boy));

        if (BMI <=20 ){
            System.out.println("Oldukca Zayifsiniz" + "BMI=" +BMI);
            } else if (20<BMI && BMI<=25) {
            System.out.println("Normal sinirlardasiniz" + "BMI="+BMI);
        } else if (25<BMI && BMI<=30) {
            System.out.println("Sisman kategorisindesiniz" + "BMI="+ BMI );
        } else if (30<BMI) {
            System.out.println("Obez grubundasiniz" + "BMI=" +BMI);

        }

 */
/*
        Soru-4: Kullanicidan IT alanini bilgisini alarak console'a  meslegi için;
        qa ==> Quality Analyst
        dev ==> Developer
        ba ==> Busines Analyst
        pm ==> Project Manager
        seklinde bilgilerini yazdiriniz


        System.out.println("qa\ndev\nba\npm\nLutfen mesleginizi giriniz :");
        String job = input.next();

        String qa = "Quality Analyst";
        String dev = "Developer ";
        String ba = "Busines Analyst";
        String pm = "Project Manager";

        if (job.equals("qa")){
            System.out.println("Quality Analyst");
        } else if (job.toLowerCase().equals("dev")) {
            System.out.println("Developer");
        } else if (job.toLowerCase().equals("ba")) {
            System.out.println("Busines Analyst");
        } else if (job.toLowerCase().equals("pm")) {
            System.out.println("Project Manager");
        }else
            System.out.println("Hatalı Seçim Yaptınız");
*/

/*  (   Soru-5: Kullanicidan  yasini ve kilosunu alaliniz
		    18 yasindan kucuk ise kan bagisi yapamaz
		    18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		    18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.)





        System.out.println("Lutfen yas bilgisini giriniz");
        int yas = input.nextInt();
        System.out.println("Lutfen kilo bilgisini giriniz");
        Double kilo = input.nextDouble();

        if (yas<18){
            System.out.println("Yaşınız yetersiz Kan bagısı yapamazsınız");

        } else if (yas>18 && kilo<50) {
            System.out.println("Yaşınız yeterli ancak kilonuz yetersiz bu yüzden Kan bagısı yapamazsınız");
        }else if (yas>18 && kilo>50){
            System.out.println("Kan bagısı yapabilirsiniz");
        }else
            System.out.println("Hatalı Kilo girdiniz");
*/

/*
    Soru-6: Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.


        System.out.println("Lutfen X ve Y degerlerini giriniz");
        int x = input.nextInt();
        int y = input.nextInt();

        if (x>0 && y>0){
            System.out.println("Girdiginiz degerler 1.bölgeye ait");
        }else if (x<0 && y>0){
            System.out.println("Girdiğiniz degerler 2.bölgeye ait");
        } else if (x<0 && y<0) {
            System.out.println("Girdiğiniz degerler 3.bölgeye ait");
        } else if (x>0 && y>0) {
            System.out.println("Girdiğiniz degerler 4.bölgeye ait");
        } else if (x!=0 && y==0) {
            System.out.println("Girdiğiniz degerler X düzlemindedir");
        } else if(x==0 && y!=0){
            System.out.println("Girdiğiniz degerler Y düzlemindedir");
        }else
            System.out.println("Girdiğiniz degerler orjindedir.");
*/

/*
Soru-7: Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada hatali giris seklinde code create ediniz
	Cevap:

        System.out.println("Lutfen bir karakter giriniz");
        char ch= input.next().charAt(0);

        if (ch>='a' && ch<='z'){
            System.out.println("Kucuk harf girdiniz");
        }else if (ch>='A' && ch<='Z'){
            System.out.println("Buyuk harf girdiniz");
        }else
            System.out.println("Hatalı giriş yaptınız");

 */

/*
Soru-8: Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya musteri karti olup olmadigini sorun.
            Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
            Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10 indirim yapan code
 */
/*
        System.out.println("Lutfen aldgınız ürün adedini giriniz");
        int urun = input.nextInt();
        System.out.println("Lutfen müşteri kartınız varsa Y , yoksa N giriniz");
        char card = input.next().toLowerCase().charAt(0);

        if (card == 'y') {

            if (urun > 10) {
                System.out.println("%20 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: "
                        + (urun * 0.80));
            {else (urun < 10) {
                    System.out.println("%15 indirim hakkı kazandiniz.Toplam odemeniz gereken miktar" + (urun * 0.85));
                }



        } else if (card == 'n') {
                if (urun > 10) {
                    System.out.println("%15 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: "
                            + (urun * 0.85));
                {else (urun < 10) {
                        System.out.println("%10 indirim hakkı kazandiniz.Toplam odemeniz gereken miktar" + (urun * 0.90));
                    }

                    }

        } else
                System.out.println("Yanlış giriş yaptınız tekrar deneyiniz");
        }
*/
        /*
        Soru-9: Kulanıcıdan aracının hızını alınız.Trafik cezasının değerini hesaplayın. 54 hız sınırıdır.
        Eğer hızınız 55-74 arasında ise:Ceza 100 $'dır.
        Eğer hızınız 75 - 84 arasında ise:Ceza 150 $'dır.
        Eğer hızınız 85 -94 arasında ise:Ceza 320 $'dır.
        Eğer hızınız 94'den daha fazla ise: Ceza 500 $'dır.
                ve ayrıca,
        Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.
        Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.
        Örn;
        currentSpeed(Hızınız) 87
        ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;  sonuç 320 olmalıdır.
                currentSpeed(Hızınız) 65
        ve isDriverLicenceAvailable(Ehliyeti var mı?) = false; sonuç 300 olmalıdır.

        */

        System.out.println("Lutfen ehliyetiniz var ise 1, yok ise 2 yi giriniz");
        int ehliyet = input.nextInt();
        System.out.println("Lutfen hızınızı giriniz");
        int hız =input.nextInt();

        if (ehliyet==1 || ehliyet==2) {
            if (ehliyet == 2) {
                System.out.println("Ehliyetiniz olmadığı icin ekstra 200$ ödeyeceksiniz");
                if (hız < 55) {
                    System.out.println("Herhangi cezanız olmamaktadır");
                } else if (hız >= 55 && hız < 75) {
                    System.out.println("Cezanız 300$");
                } else if (hız >= 75 && hız < 84) {
                    System.out.println("Cezanız 450$");
                } else if (hız >= 84 && hız <= 94) {
                    System.out.println("Cezanız 520$");
                } else if (hız > 94) {
                    System.out.println("Cezanız 700$");
                } else
                    System.out.println("Yanlış deger giriniz");

            }else if (ehliyet == 1) {
                if (hız < 55) {
                    System.out.println("Herhangi cezanız olmamaktadır");
                } else if (hız >= 55 && hız < 75) {
                    System.out.println("Cezanız 100$");
                } else if (hız >= 75 && hız < 84) {
                    System.out.println("Cezanız 150$");
                } else if (hız >= 84 && hız <= 94) {
                    System.out.println("Cezanız 320$");
                } else if (hız > 94) {
                    System.out.println("Cezanız 500$");
                } else
                    System.out.println("Yanlış deger giriniz");


            }
        }




































    }
}