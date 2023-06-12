package javaders.day36exceptions;

public class E03 {

    /*
    throws ile throw arasindaki farklar nelerdir?
    1)"throws method signature satirinda kullanilir, thorowise method body icinde kullanilabilir.
    2)throws method signature satirinde bir veya birden fazla EXCEPTİON İLE BİRKERE KULLANİLİR.
       throw ise method body icinde birtane Exception ile tekrar tekrar kullanilabilir.
    3)throws dan sonra EXception Class isimleri yazilir.
       throw dan sonra Exception Classdan object olusturulur.

     */
    public static void main(String[] args) {
        printAge(23);
        try {
            printAge(-12);
        } catch (IllegalArgumentException e) {
            System.out.println("Nagetive ages are not valid");
        }
        printAge(-9);//IllegalArgumentException
    }
    //Example 1 : Kullanicidan alinan yasi console'a yazdiran methodu olusturunuz.
    public static void printAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Used negative integers for ages");
        }
        System.out.println(age);
    }
}