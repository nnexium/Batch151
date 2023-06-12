package javaders.day34exceptions;

public class E03 {
    public static void main(String[] args) {


        System.out.println(getNumofChars("Java"));
        System.out.println(getNumofChars(null));


    }

    //Bir stringdeki character sayisini veren method oluşturunuz.

    public static int getNumofChars(String s){
        int result = 0;

        try {
            result = s.length();
        }catch(NullPointerException e){//NullPointerException String class da null
            // ile uyumlu olmayan methodlar kullanıldığında atilir.

            System.out.println("Some String methods do not work with null...");
            System.out.println(e.getMessage());//Javanın Exception icin urettiği teknik memsaja varsa verir.
        }return result;
    }

}
