package deneme;

public class loops {
    public static void main(String[] args) {
        // 21 den 180 e kadar hem 4 hem de 6 ile bolunabilen tam sayilari ekrana yazdiriniz

        for ( int i=21; i<181; i++ ) {

            if( i%4 == 0 && i%6==0) {
                System.out.print(" "+ i);
            }
        }
        System.out.println();
        // size verilen kucuk harfle yazilmis string in indexi cift sayi olan characterleri buyuk yazdir.
/*
        String s ="ankara";

        for ( int i=0 ; i<s.length() ; i++ ) {
            String ch =s.substring(i, i+1);
            if( i%2==0) {
                System.out.println(ch.toUpperCase());


            }
        }

        System.out.println();

 */
        // verilen bir string de ilk a harfinnden önceki tum karakterleri konsola yazdiriniz
/*
        String s="I Love Java";

        for ( int i = 0; i<s.length(); i++)
        { if(s.charAt(i)=='a') {
            break;
        }
            System.out.println(s.charAt(i));
        }


        System.out.println(" ");

       //ex verilen bir string de son a dan sonraki tüm karakterleri ters sırada yazdiniz

        String t  = "Germany";
        for (int i =t.length()-1 ; i >=0 ;   i-- ) {
            char ch = t.charAt(i);
            if(ch=='a'){
                break;
            }
            System.out.print(ch);
        }

*/

        // ex : 11 den 14 e kadar olan sayilari ekrana yazdiriniz

        for ( int i = 11; i<15; i++ ) {
            System.out.print(i+ " ");
        }
        // ex : 40 dan 23 e kadar tum cift sayiları ekrana yazdiran kodu yaziniz

        for (int i = 41; i>22 ; i--){
            if(i%2==0){

            }
            System.out.println(i);

        }
        System.out.println();
        // ex : 18 den 56 ya kadar olan tum tek sayiları ekrana yazdiniz

        for (int i = 18 ; i<57 ; i++){
            if(i%2!=0){
                System.out.println(" " + i);
            }
            
        }


        for (int i = 21; i <181 ; i++) {
            if(i%4==0 && i%6==0){
                System.out.print(i + " ");
            }
        }

        System.out.println();
        String s = "miami";


        for (int i = 0; i <s.length() ; i++) {
            String ch = s.substring(i, i + 1);
            if (i % 2 == 0) {
                System.out.print(ch.toUpperCase());
            } else {
                System.out.print(ch);
            }
        }
        System.out.println();
    // verilen bir stringde ilk a harfinden onceki tum characterleri yazdiriniz

        String str = "Yusuf Eymen Defne Meva";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a') {
                break;
            } else {

                System.out.print(ch);
            }
        }

        System.out.println();
// verilen bir string de son a dan sonraki tum characterleri ters sirada yazdiriniz

    String c = "Tokatci";

        for (int i = c.length()-1; i>=0 ; i--) {
            char ch = c.charAt(i);
            if (ch == 'a') {
                break;

            } else {
                System.out.print(ch);
            }
        }
        System.out.println();


    // verilen bir string de kucuk harfleri consone yazmayiniz

    String m = "Pwd12?A";

        for (int i = 0; i <m.length() ; i++) {

            char ch = m.charAt(i);
        if (ch>='a' && ch <= 'z'){
            continue;

        }else {
            System.out.print(" " + ch);
        }

        }

        System.out.println();


// bir string i ters ceviren kodu yaziniz.
      String t ="Apex";
      String ters = "";

        for (int i =t.length()-1; i >=0 ; i--) {
            ters =ters + t.substring(i, i+1);
        }
        System.out.println(ters);



// Bir tam sayinin rakamlarinin toplamini veren kodu yaziniz
        //578 == 5+7+8 X= 20
        int sum=0;
        for (int i =578; i>0 ; i=i/10) {
            sum=sum+i%10;

        }
        System.out.println(sum);
















    }//main
}
