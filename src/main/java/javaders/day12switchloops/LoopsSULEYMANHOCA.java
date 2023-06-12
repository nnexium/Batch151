package javaders.day12switchloops;

public class LoopsSULEYMANHOCA {
    public static void main(String[] args) {

    //4 tane loop yapisi vardir, i) fon-loop, ii) while-loop, 3) do-while-loop. iv) for each loop
/*
        // for loop
            //Starting Value             Loop Condition         Increment/Decrement
        for ( int i=1              ;     i<60                 ;    i=i+1          ){
            System.out.println("Hİ");

        }

    //4 den 24 e kadar tum tam sayıları aynı satırda aralarına bosluk bırakarak konsola yazdıran kodu yazdırın

        for ( int i=4    ; i<7; i++ ){
            System.out.print(i+ " ");
        }

    // 33 den 11 e kadar tum cift tamsayilari aynı satirda aralarında bosluk bırakarak yazdırınız.
*/
        for ( int i=33 ; i>10; i-- ) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }


    // 20 den 74 e kadar tum tek tamsayilari aralarında boşluk bırakarak yaziniz.

        for ( int i=20 ; i<75; i++ ) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }


    // Massachusetts kelimesindeki tum sesli harfleri consola yazdiriniz.
        String a = "Massachusetts";
        for ( int i=0; i<a.length(); i++ ) {
            char b = a.charAt(i);
            if (b =='a'|| b=='e' || b=='i' || b=='o' || b=='u' || b=='A' || b=='E' || b=='I' || b=='O'  || b=='U'  )
                System.out.print( b+ " " );
        }


    }//main




}//class
