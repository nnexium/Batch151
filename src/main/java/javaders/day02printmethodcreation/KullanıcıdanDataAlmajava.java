package javaders.day02printmethodcreation;

import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.System.out;

public class KullanıcıdanDataAlmajava {


    public static void main(String[] args) {

       Scanner input= new Scanner(System.in);
       out.println("Lutfen bir character veriniz");
       char ch = input.next().charAt(0);
       System.out.println("  "+ch+"  ");
       System.out.println(" "+ch+"  "+ch+" ");
       System.out.println(ch+"  "+ch+"  "+ch);


       System.out.println("\t\t"+ch+"\t\t\n\t"+ch+"\t" +
                "\t"+ch+"\t\n"+ch+"\t\t"+ch+"\t\t"+ch);



















    }//main
}//class
