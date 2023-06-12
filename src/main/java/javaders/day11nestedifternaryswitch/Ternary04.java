package javaders.day11nestedifternaryswitch;

import java.util.Scanner;
public class Ternary04 {
    /*
    kullanıcıdan aldıgınız çift ise iki katını ekrana yazdırın, tek ise "bu sayı artırılmaz" yaziniz.
     */
    /*
    1-Ternary de true ve false durumları için size verilen data tipleri farklı ise oluşturduğunuz
    data type ı Object yapın.
    2-Object Java da bir class'dır
    3-Object Java daki butun class ların "Parent"i dir.yani Hz.Adem gibi.
    4-Object Class ın "Parnet" ı yoktur.
    5-Java da parnet i olmayan tek Class "Object Class" dır.
     */

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Please enter an integer: ");
    int num= input.nextInt();

    Object result= num%2==0 ? num/2 : "Bu sayi ikiye bolunmez";
    System.out.println(result);










    }//main


}//class
