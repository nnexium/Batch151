package team8;

public class ClarahocaSorular01 {
    public static void main(String[] args) {

          /*
     Soru-1: Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz dort islemden biri ile isleme koyup sonucun yazdiriniz
     Soru-2: Kullanicidan 3 tene pozitif  tam sayi alniz. Bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	         Eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
	        INFO-->üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
		          a+b>c>a-b
		          a+c>b>a-c
	              b+c>a>b-c
		          a=b=c ise es kenar ucgen
     Soru-3: Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
	        INFO : BMI = kilo(kg) /(boy*boy)(m)
		           BMI <=20 oldukca zayifsiniz
		           20<BMI<=25 Normal sinirlardasiniz
		           25<BMI<=30 Sisman kategorisindesiniz
		           30<BMI ==> Obez grubundasiniz.
	********Soru-4: Kullanicidan IT alanini bilgisini alarak console'a  meslegi için;
	        qa ==> Quality Analyst
		    dev ==> Developer
			ba ==> Busines Analyst
			pm ==> Project Manager
		    seklinde bilgilerini yazdiriniz
    Soru-5: Kullanicidan  yasini ve kilosunu alaliniz
		    18 yasindan kucuk ise kan bagisi yapamaz
		    18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		    18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
	Soru-6: Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.
	Soru-7: Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada hatali giris seklinde code create ediniz
	Soru-8: Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya musteri karti olup olmadigini sorun.
            Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
            Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10 indirim yapan code create ediniz
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
    Soru-10:Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız
    Soru-11:Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunuz yazdırınız.(pazartesi hafta başlangıcı)
    Soru-12:Bankamatik Sorusu-->Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
    Soru-13:Seyahat Projesi-->Bulundugunuz yerden, bir yere yolculuk edeceksiniz.
            A. Köln veya Frankfurta gidebilirsiniz.
            B. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro
              İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz.
              İşlemlerde direkt bunları cağırabilirsiniz.
              todo İLK OLARAK;
             "Nereye yolculuk etmek istiyorsunuz? (Frankfurt :60KM---Köln:80 KM---(20 KM başına 5 euro bilet parası alınmaktadir..)yazısı gelsin.
       1.Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.
              todo Frankfurt girildiyse,
                 örn: girdi= Frankfurt
                 case=FRANKFURT:
                 Rota = Frankfurt yazdırın.
                 Frankfurt km hesabı işlemi yapın. son olarak konsolda: Frankfurt 15 Euro yazsın.
              todo case: KÖLN ise
                 "Rota = Köln" yazdırın. km hesabına göre işlemi yapınız.son olarak konsolda:  Köln   20 Euro yazsın.
       2.Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):" sorusunu sorsun.
             case:1 ise" 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.
             case:2 ise "2 kişilik " yazdırın.2 kişi için bilet fiyatını hesaplayın.
              todo  Son olarak yolculugunuzu check edin;
        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.
        a.Bakiyemi belirtin.
        b.Toplam Tutarı belirtin.
        c.double paraUstu oluşturun ve hesaplayın.
        d.Double para üstünü yazdırın.
    Soru-14:Kullanıcıdan üç adet sayı alarak bu sayıların bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
            (İpucu: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor bağlantısından yararlanabilirsiniz)
            Örnek Ekran Çıktısı
            birinci kenarı giriniz: 2
            ikinci kenarı giriniz 15
            üçüncü kenarı giriniz: 7
            Bu bir dik üçgen değildir/Bu bir dik üçgendir
    Soru-15:Katsayıları verilen 2 bilinmeyenli denklemin kökleriniz bulunuz.
            ax^2 + bx + c;
            Çözüm adımları-->kullanıcıdan a,b,c yi okutun.
            Delta = bb - 4ac
            Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
            Delta = 0 => 1 tane kök vardır x = -b/2a
            Delta < 0 ise kök yoktur.
    Soru-16:Kullanıcının girdiği yılın artık yıl olup olmadığını kontrol eden code create ediniz.
    Soru-17:Kullanicidan bir sayi aliniz
            Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
            10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
            Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
    Soru-18:Kullanicidan bir character girmesini isteyiniz
            Character harf ise kucuk harf olup olmadigini kontrol ediniz
            Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
            Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
            Harf degilse ekrana "Harf degil" yazdiriniz
            97:a  122:z ascii değeri
    Soru-19:Kullanıcıdan bir pozitif tamsayı girmesini isteyin, o pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
            3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
            Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.

​
		*** IPUCU--> switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		             switch() de int, byte, short, char, String kullanilir.

           */
        //Soru-20:Kullanıcıdan notunu alın ve aşağıdaki kurallara göre console'a A, B, C veya D yazdırın.
        //		    -> 0(dahil) ile 50 arasi - D
        //		    -> 50(dahil) ile 60 arası - C
        //		    -> 60(dahil) ile 80 arası - B
        //		    -> 80(dahil) ustu- A
        //		Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin


        //1.soru
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("a sayisini giriniz");
        int a = scanner.nextInt();
        System.out.println("b sayisini giriniz");
        int b = scanner.nextInt();
        System.out.println("Yapacağınız İslemi Seciniz");

        int toplam = (a) + (b);

        System.out.println("toplama"+ (a+b));


*/



        /*Soru-2: Kullanicidan 3 tene pozitif  tam sayi alniz. Bu uc sayinin ucgen olusturma durumunu kontrol ediniz
        Eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
        INFO-->üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
        a+b>c>a-b
        a+c>b>a-c
        b+c>a>b-c
        a=b=c ise es kenar ucgen
        */
  /*
        Scanner input = new Scanner(System.in);
        System.out.println("a sayisini giriniz");
        int aSayisi = input.nextInt();
        System.out.println("b sayisini giriniz");
        int bSayisi = input.nextInt();
        System.out.println("c sayisini giriniz");
        int cSayisi = input.nextInt();

*/
    /*
        Soru-3: Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
        INFO : BMI = kilo(kg) /(boy*boy)(m)
                BMI <=20 oldukca zayifsiniz
        20<BMI<=25 Normal sinirlardasiniz
        25<BMI<=30 Sisman kategorisindesiniz
        30<BMI ==> Obez grubundasiniz.
    */


        /*





    /*




    Soru-4: Kullanicidan IT alanini bilgisini alarak console'a  meslegi için;
	        qa ==> Quality Analyst
		    dev ==> Developer
			ba ==> Busines Analyst
			pm ==> Project Manager
		    seklinde bilgilerini yazdiriniz
     */
/*
        Scanner input2 = new Scanner(System.in);
        System.out.println("IT alan bilgisini giriniz \"qa, dev, ba, pm\" : ");
        String ItBilgi2 = input2.next();


        switch(ItBilgi2.toLowerCase()){
            case "qa":
                System.out.println("Quality Analyst");
                break;
            case "dev":
                System.out.println("Developer");
                break;
            case "ba":
                System.out.println("Busines Analyst");
                break;
            case "pm":
                System.out.println("Project Manager");
                break;
            default:
                System.out.println("Yanlış Bilgi girdiniz");
                break;
*/

 /*
     Soru-1: Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz dort islemden biri ile isleme koyup sonucun yazdiriniz
     Cevap:
          Scanner scan = new Scanner(System.in);//kullanıcıdan input almak için canner obj create ettik.
          System.out.println(" toplama için 1\n çikarma için 2\n bolme için 3\n çarpma için 4");
          //kullanıcıya seçim içn işlem menusu yazdırdık
          int islem = scan.nextInt();//kullanıcının islem tercihi için veriable create edildi
          System.out.println("lütfen iki tam sayı giriniz : ");//kullanıcıya bildirmde bulunuldu.
          double num1 = scan.nextDouble();//1 sayı assign edildi
          double num2 = scan.nextDouble();//2 sayı assign edildi
          if (islem == 1) {
            System.out.println("toplama işleminin sonucu :" + num1 + " + " + num2 + " = " + (num1 + num2));
          }else if (islem == 2) {
            System.out.println("cıkarma işleminin sonucu :" + num1 + " - " + num2 + " = " + (num1 - num2));
          } else if (islem == 3) {
            System.out.println("bolme işleminin sonucu :" + num1 + " / " + num2 + " = " + (num1 / num2));
          } else if (islem == 4) {
            System.out.println("carpma işleminin sonucu :" + num1 + " x " + num2 + " = " + (num1 * num2));
          } else System.out.println("hatalı secim yaptınız tekrar deneyiniz");
​
​
     Soru-2: Kullanicidan 3 tene pozitif  tam sayi alniz. Bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	         Eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
	        INFO-->üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
		          a+b>c>a-b
		          a+c>b>a-c
	              b+c>a>b-c
		          a=b=c ise es kenar ucgen
	 Cevap:
	        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 3 tam sayi giriniz");
​
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
​
        if (a + b > c && a - b < c && a + c > b && a - c < b && b + c > a && b - c < a) {
            if (a == b && a == c) {
                System.out.println("ucgen ve eskenar ucgendir");
            } else {
                System.out.println("ucgen fakat eskenar degil");
            }
        } else {
            System.out.println("ucgen degildir.");
        }
​
​
     Soru-3: Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
	        INFO : BMI = kilo(kg) /(boy*boy)(m)
		           BMI <=20 oldukca zayifsiniz
		           20<BMI<=25 Normal sinirlardasiniz
		           25<BMI<=30 Sisman kategorisindesiniz
		           30<BMI ==> Obez grubundasiniz.
	Cevap:
	       Scanner scan = new Scanner(System.in);//kullanıcıdan input almak için scanner obj create ettik.
​
        System.out.println("boyunuzu cm giriniz : ");
        double boy=scan.nextDouble();
​
        System.out.println("kilonuzu  kg giriniz : ");
        double kilo=scan.nextDouble()/100;
​
        double bmi=kilo/((boy)*(boy));
        if (bmi<=20){
            System.out.println("vucut kitle endeksiniz :"+bmi+" "+"Oldukca Zayifsiniz");
        } else if (bmi>20 & bmi<=25){
            System.out.println("vucut kitle endeksiniz :"+bmi+" "+"Normalsınız");
        } else if (bmi>25 & bmi<=30){
            System.out.println("vucut kitle endeksiniz :"+bmi+" "+"Sismansınız");
        } else if (bmi>30){
            System.out.println("vucut kitle endeksiniz :"+bmi+" "+"Obezsiniz");
        }
​
​
	Soru-4: Kullanicidan IT alanini bilgisini alarak console'a  meslegi için;
	        qa ==> Quality Analyst
		    dev ==> Developer
			ba ==> Busines Analyst
			pm ==> Project Manager
		    seklinde bilgilerini yazdiriniz
	Cevap:
          Scanner input = new Scanner(System.in);
        System.out.println("qa\ndev\nba\npm\nLutfen mesleginizi giriniz :");
        String jobTitle = input.next();
​
        String qa = "Qualty Analyst";
        String dev = "Developer";
        String ba = "Business Analyst";
        String pm = "Project Manager";
​
        if (jobTitle.equalsIgnoreCase("qa")) {
            System.out.println("Mesleginiz: " + qa);
​
        } else if (jobTitle.toLowerCase().equals("dev")) {
            System.out.println("Mesleginiz: " + dev);
        } else if (jobTitle.toLowerCase().equals("ba")) {
            System.out.println("Mesleginiz: " + ba);
        } else if (jobTitle.equalsIgnoreCase("pm")) {
            System.out.println("Mesleginiz: " + pm);
        } else {
            System.out.println("Hatali secim yaptiniz");
        }
​
​
    Soru-5: Kullanicidan  yasini ve kilosunu alaliniz
		    18 yasindan kucuk ise kan bagisi yapamaz
		    18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		    18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
	Cevap:
	      Scanner scan = new Scanner(System.in);//kullanıcıdan input almak için scanner obj create ettik.
​
        System.out.print("yasınızı giriniz : ");
        int yas = scan.nextInt();
​
        System.out.print("kilonuzu  giriniz : ");
        int kilo = scan.nextInt();
​
        if (yas > 0 && yas < 18) {//yas ve sartı kontrolu yapıldı
            System.out.println("yası 18'den kucuk olanlar kan bagısı yapamaz");
        } else if (yas >= 18) {
            if (kilo > 0 && kilo < 50) {//kilo sartı ve kontrolu yapıldı
                System.out.println("yasınız kan bagısı icin uygun ancak kilonuz yetriz");
            } else if (kilo >= 50) {
                System.out.println("sartlarınız uygun kan bagısı yapabilirsiniz");
            } else System.out.println("kilonuzu hatalı girdiniz");//hatalı kilo girişi kontrolu yapıldı
        } else System.out.println("hatalı veri girdiniz");//hatalı yas girişi kontrolu yapıldı
​
​
	Soru-6: Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.
	Cevap:
	      Scanner scan = new Scanner(System.in);//kullanıcıdan input almak için scanner obj create ettik.
​
        System.out.println("X ve Y degerleriniz giriniz : ");
        int x = scan.nextInt();
        int y = scan.nextInt();
        if (x>0 && y>0){
            System.out.println("girdiginiz degerler 1. bölgeye ait");
        }else if (x<0 && y>0){
            System.out.println("girdiginiz degerler 2. bölgeye ait");
        }else if (x<0 && y<0){
            System.out.println("girdiginiz degerler 3. bölgeye ait");
        }else if (x>0 && y<0){
            System.out.println("girdiginiz degerler 4. bölgeye ait");
        }else if (x!=0 && y==0){
            System.out.println("girdiginiz degerler x ekseni uzerinde");
        }else if (x==0 && y!=0){
            System.out.println("girdiginiz degerler y ekseni uzerinde");
        }else System.out.println("girdiginiz degerler orjin'dedir");
​
​
	Soru-7: Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada hatali giris seklinde code create ediniz
	Cevap:
	      Scanner sc = new Scanner(System.in);
         System.out.println("Lutfen bir karakter giriniz");
         char ch = sc.next().charAt(0);
         if (ch >= 'a' && ch <= 'z') {
            System.out.println("Kucuk harf");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Buyuk harf");
        } else {
            System.out.println("Hatali giris yaptiniz.");
        }
​
​
	Soru-8: Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya musteri karti olup olmadigini sorun.
            Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
            Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10 indirim yapan code create ediniz
    Cevap:
          Scanner scan = new Scanner(System.in);
​
        System.out.println("Lutfen aldiginiz urunun adedini giriniz");
        int quantity = scan.nextInt();
​
       0
​
        System.out.println("Musteri kartiniz var mi? Varsa Y yoksa N tusuna basiniz");
        char card = scan.next().toLowerCase().charAt(0);
​
        if (card == 'y') {
            if (quantity > 10) {
                price *= 0.8; // price = price*0.8
                totalPrice = price * quantity;
                System.out.println("%20 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: "
                                + totalPrice);
            } else {
                price *= 0.85;
                totalPrice = price * quantity;
                System.out.println("%15 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: "
                                + totalPrice);
            }
        } else if (card == 'n') {
            if (quantity > 10) {
                price *= 0.85;
                totalPrice = price * quantity;
                System.out.println("%15 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: " + totalPrice);
​
            } else {
                price = price - price * 10 / 100;
                totalPrice = price * quantity;
                System.out.println("%10 indirim hakki kazandiniz. Toplam odemeniz gereken miktar: " + totalPrice);
            }
        } else {
            System.out.println("Yanlis giris yaptiniz. Lutfen tekrar deneyiniz");
        }
​
​
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
    Cevap:
          Scanner scan = new Scanner(System.in);//kullanıcıdan input almak için scanner obj create ettik.
​
        System.out.print("ehliyetiniz var ise -> 1 yok ise -> 0 yazınız : ");
        int ehliyetiniz = scan.nextInt();
        if (ehliyetiniz == 0 || ehliyetiniz == 1) {//ehlivetin varlık yokluk sartına göre diger kosullar çalışacak
            if (ehliyetiniz == 0) {
                System.out.println("hızınızı sormadan kafadan bir 200$ kitledim size");
            }
            System.out.print("hızınızı giriniz : ");
            int hızınız = scan.nextInt();
​
            if (ehliyetiniz == 1) {
                if (hızınız < 0) {
                    System.out.println(" negatif hız olmaz hatalı veri girdiniz");
                } else if (hızınız >= 55 && hızınız < 75) {
                    System.out.println(" Ceza 100 $'dır.");
                } else if (hızınız >= 75 && hızınız < 84) {
                    System.out.println("  Ceza 150 $'dır.");
                } else if (hızınız >= 84 && hızınız <= 94) {
                    System.out.println(" Ceza 320 $'dır.");
                } else if (hızınız > 94) {
                    System.out.prin...

  */
    }//main

}//class
