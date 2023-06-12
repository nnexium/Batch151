package javaders.day13incrementdecrementloops;

public class Loops01SULEYMANHOCA {
    public static void main(String[] args) {
        //21 den 180 e kadar hem 4 hem 6 ile bolunebilen tam sayilari console yazdiriniz

        for (int i = 21; i <= 180; i++) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.println(i);
            }

        }

        //size verilen kucuk harfle yazilmiş stringin indeks i cift sayi olan characterlerini buyuk harfe dönuşturunuz
/*
        String s = "miami";
        for (int i = 0; i < s.length(); i++) {
            String ch = s.substring(i, i+1);
              if (i %2==0){
                  System.out.print(ch.toUpperCase());
            }
              else{
                  System.out.println(ch);
            }
        }
        System.out.println();

 */
    // verilen bir string de ilk a harfinden öneki tum characterleri console yazdirin


        String a = "Tokaci";
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);

            if (ch == 'a') {
                break;// Loop u herhangi bir şarta göre kirmek icin break keyword kullanilabilir
            } else {
                System.out.print(ch);
            }

        }


    // Verilen bir String de son 'a' dan sonraki tum characterlerx ters sirada yazdiriniz.

        String b="Tokatci";
                for (int i = b.length()-1; i >= 0; i--) {
                    char ch = b.charAt(i);

                    if (ch == 'a') {
                        break;// Loop u herhangi bir şarta göre kirmek icin break keyword kullanilabilir
                    } else {
                        System.out.print(ch);
                    }

                }
        System.out.println();



    }//main


}
