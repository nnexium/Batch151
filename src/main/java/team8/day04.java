package team8;

public class day04 {
    public static void main(String[] args) {


        //Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz
//miami ==> MiAmI

        String s = "miami";

        for (int i = 0; i <s.length() ; i++) {
            String ch = s.substring(i,i+1);

            if (i%2==0){
                System.out.print(ch.toUpperCase());
            }else
                System.out.print(ch);
        }

        System.out.println("//////////////////");
        //Verilen bir string de ilk a harfinden önceki tum characterler console yazdırınız.

        String a = "Tokaci";
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);

            if (ch == 'a') {
                break;// Loop u herhangi bir şarta göre kirmek icin break keyword kullanilabilir
            } else {
                System.out.print(ch);
            }

        }

        System.out.println("//////////////////");
        //Verilen bir String de son 'a' dan sonraki tum characterleri ters sirada yazdiriniz
//"Tokatci ==> ict


        String s1 = "Tokatci";

        for (int i = s1.length()-1; i >= 0 ; i--) {

            char ch1 = s1.charAt(i);
            if (ch1 == 'a') {
                break;

            }else
                System.out.print(ch1);

        }












    }
}
