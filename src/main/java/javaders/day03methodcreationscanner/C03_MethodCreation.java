package javaders.day03methodcreationscanner;

public class C03_MethodCreation {

    public static void main(String[] args) {

    //Accces Modifier + Return Type + mothodIsmi + ( ) {}

    add(10,20);
    multiply(8,6);
    threemultiply(6,8,9);




    }//main

    public static void threemultiply(int a, int b, int c) {

        System.out.println((a*b)+c);
    }

    private static void multiply(int a, int b) {

        System.out.println("Carpim Sonuc=" +a*b);
    }

    private static void add(int a, int b) {

        System.out.println(a+b);



    }//main
}//class
