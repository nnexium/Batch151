package javaders.day12switchloops;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {

        //Example : Kullanıcıdan iki sayı ile yapılacak işlemi alan ve toplama, çıkarma, çarpma bölme ve % işlemini
        //yaptıran kodu yaziniz


        Scanner input= new Scanner(System.in);

        System.out.println("Lutfen iki sayi giriniz");
        double a = input.nextDouble();
        double b = input.nextDouble();

        System.out.println("Yapılacak işlemi giriniz, + - * / %");
        char opr = input.next().charAt(0);

        switch (opr) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a/b);
            case '%':
                System.out.println(a%b);
                break;
            default:





        }

    }
}
