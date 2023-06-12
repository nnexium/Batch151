package javaders.day35exceptions;

public class E03 {
    public static void main(String[] args) {
        System.out.println(convertStringToIntDivideByLength1("6"));
        System.out.println(convertStringToIntDivideByLength2("6"));
        System.out.println(convertStringToIntDivideByLength3("6"));
    }
    //Example 1 : Bir String'i Integer'a ceviren ve bu Integer'i String'in length'inin 1 eksigine bolen method'u  olusturunuz
    public static int convertStringToIntDivideByLength1(String str) {
        int result = 0;
        try {
            int a = Integer.valueOf(str);
            result = a / (str.length() - 1);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Non-digit character can not be used in valueOf()");
        }
        return result;
    }
    public static int convertStringToIntDivideByLength2(String str) {
        int result = 0;
        try {
            int a = Integer.valueOf(str);
            result = a / (str.length() - 1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
    public static int convertStringToIntDivideByLength3(String str) {
        int result = 0;
        try {
            int a = Integer.valueOf(str);
            result = a / (str.length() - 1);
        }catch (ArithmeticException e){
            System.out.println("Jump");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
}
/*
//valueOf() bos String'de de NumberFormatException hatasi verir
//Bir method'dan 2 farkli exception alma ihtimalimiz var. Ikisini birden handle etmemiz gerekir.
//valueOf() method'una sayi olmayan bir deger atanirsa "NumberFormatException" hatasi alinir.
//"Exception" tum exception'lari kapsayan genel bir exception turudur. 911 gibi...
//Excaption'a ozel durumlarda farkli "catch block"lar kullanmamiz gerekebilir
 */