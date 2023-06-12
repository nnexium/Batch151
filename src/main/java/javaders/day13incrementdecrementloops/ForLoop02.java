package javaders.day13incrementdecrementloops;

public class ForLoop02 {
    public static void main(String[] args) {


    // Example1: verilen bir string de ilk a harfinden onceki tum characterleri konsola yazdiriniz.

        String str = "I Love Java";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                break;
            }
            System.out.print(str.charAt(i));
        }
         System.out.println();
    // Example2: Verilen bir string de son 'a' dan sonraki tum characterleri ters siradan yazdiriniz
        String str2 = "Germany";

        for (int i = str2.length()-1; i>=0; i--) {
            char c = str2.charAt(i);
            if (c == 'a') {
                break;
            }
            System.out.print(c);
        }

        //












    }// main
}
