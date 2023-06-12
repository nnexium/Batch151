package javaders.day15loopsarrays;

import java.util.Arrays;

public class Arrays01 {

    /*

    1) Array, Javanın çoklo data depolamak icin oluşturduğu bir yapıdır.
    2) Array ler "primitive" data type lari ve "referance" ile çalışır.
    3) Arraylar "super fast" dir ve memory de çok az yer kaplarlar.


     */
    public static void main(String[] args) {


        //Array nasıl oluşturulur?
        String stdNames[] = new String[5];

        // Array nasıl yazdirilir?

        System.out.println(Arrays.toString(stdNames)); //null, null, null, null, null, ==>nullar Stringdeki default değerdir

        //Array'e nasıl eleman eklenir?
        stdNames[0] = "Ahmet";
        stdNames[3] = "Cuneyt";
        stdNames[4] = "Ibrahim";
        stdNames[2] = "Filiz";
        stdNames[1] = "Ayhan";

        System.out.println(Arrays.toString(stdNames));

        //Arraydeki specific bir elemani nasıl alabiliriz?

        System.out.println(stdNames[1]);

        //Example-1: stdNames arrayindeki her ismin sonuna yildiz koyarak console a yazdiriniz.
        // lenght Stringlerde parantezli, Arraylerde parantezsiz kullanılabilir

        for (int i=0; i< stdNames.length; i++){
            System.out.println(stdNames[i] + "*");

        }
        System.out.println();
        //2.way: for-each loop ==> Enhanced(Zenginleştirilmiş) Loop mümkünse hep for-each loop kullanın, değilse
        // diğerlerini kullanın.

        for (String w : stdNames) {
            System.out.println(w +"*");
        }


//Example-2:Bir İnteger Array oluşturunuz, 5 eleman ekleyiniz, elemanların toplamını bulup, console a yazdırınız.

       int ages[]= new int[5];


        ages[0] = 20;
        ages[1] = 30;
        ages[2] = 40;
        ages[3] = 50;
        ages[4] = 60;


        int sum = 0;
        for (int w : ages) {
            sum = sum + w;
        }

        System.out.println(sum);

        System.out.println();
//Example-3: Bir char Array oluşturunuz, 3 eleman ekleyiniz, elemanların çarpımını bulup console yazdiriniz.

        char genders[] = new char[3];

        genders[0] = 'M';
        genders[1] = 'A';
        genders[2] = 'F';
        for (char w : genders) {

        }
        System.out.println('M'*'F'*'A');












    }//main
}
