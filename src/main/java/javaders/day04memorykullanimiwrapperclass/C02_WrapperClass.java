package javaders.day04memorykullanimiwrapperclass;

public class C02_WrapperClass {

    public static void main(String[] args) {

        byte primitiveByte = 12;
        Byte wrapperByte = 12;
        //byte data type'inin en buyuk ve en kucuk degerini yazdirin
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        //Ex : int data type'inin maximum degeri ile byte data type nin degerinin toplamını
        //hesaplatan methodu olusturunuz

        int intMax = Integer.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;

        System.out.println("intMax + byteMin= " + (intMax+byteMin));

        float primitiveFloat = 12.33f;
        Float wrapperFloat =primitiveFloat;




        String a= "K";
        int b=3, c=5, d=2;

        System.out.println(a+b*c/d);


    }//main
}//class
