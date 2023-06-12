package javaders.day15loopsarrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        // Arrayleri kısa yoldan nasıl oluşturabilirz?
        // Aplicationlarda data ile bu dataları isleyen kodlar(logic) birbbirinden ayrılır.yani logic data ya bağımlı
        // olmamalıdır. Datataya bağımlı olarak yazılan kodlara hard code denir.
        //hard code hatali kod demektir.

        //Asagıdaki grades arrayinde son elemani almak icin 4 elemanı almak icin 4 veya grades.length-1 kullanılabilir.
        // "4" kullanırsaniz arraye bir elemean eklendiğinde kodunuz, yanlış cıktı verir ama grades.lenght-1 kullanırsanız
        // hep doğru sonucu verir.

        int grades[] = {67,98,100,34,76};
        System.out.println(Arrays.toString(grades));

        //ex1: grades arrayindeki en kucuk  ve en buyuk grade in toplamini ekrana yazdıran kodu yaziniz.

        Arrays.sort(grades); // sort methodu elemanları kucukten buyuğe doğru sıralar.
        System.out.println(Arrays.toString(grades));

        System.out.println(grades[0]+grades[grades.length-1]);


        //Example 2: Size verilen bir String array'deki isimlerden 5 character'den az character icerenleriu console'a yazdiriniz

        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Kemal";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";

   /*     for (String w : stdNames) {

            if (w.length() > 5) {
                System.out.println(w);
            }
        }

        //ex size verilen bir string arraydeki isimleri alfabetik sıraya koyduktan sonra F ile başlayan,
        // isimlerden önceki isimleri console a yazdırınız.



        Arrays.sort(stdNames);

        for (String w : stdNames) {
            if (w.startsWith("F")) {
                break;
            }System.out.println(w);
        }

//ex 4 size verilen bir string arraydeki isimleri alfabetik sıraya koyduktan sonra F ile başlayan,
        // isimlerden önceki isimleri ve F ile başlayanları console a yazdırınız.



        Arrays.sort(stdNames);

        for (String w : stdNames) {
            if (w.startsWith("F")) {
                System.out.println(w);
                break;
            }
        }

*/
//ex 5 size verilen bir string arraydeki isimleri alfabetik sıraya koyduktan sonra F ile başlayan,
// isimler hariç diğer isimleri console a yazdırınız.

        Arrays.sort(stdNames);// sort() methodu numemric dataları kucukten buyuge (ascending) dizer
                                // string leri de alfabetik(alphabetically) dizer.
                                //ascending+alfabetically = natural sıralama demektir.
        Arrays.sort(stdNames);
        for (String w: stdNames){

            if (w.startsWith("F")){
                continue;
            }
            System.out.println(w);
        }




    }//main
}
