package switchCase02;

import java.util.Scanner;

public class C04_switch {
    public static void main(String[] args) {
        //Ayakkabi Boyutu kontrol etmek için Java Programı yaziniz
        //switch...case ifadesini kullanarak
        //Boyutu icin size ler: small -Medium- Large- Extra -Large-

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 35~54 arasi bir ayakkabi numarasi giriniz");
        int ayakkabiNo= scan.nextInt();
      switch (ayakkabiNo){
          case 35:
          case 36:
          case 37:
          case 38:
          case 39:
              System.out.println("Small");
              break;
          case 40:
          case 41:
          case 42:
          case 43:
          case 44:
              System.out.println("medium");
              break;
          case 45:
          case 46:
          case 47:
          case 48:
          case 49:
              System.out.println("Large");
              break;
          case 50:
          case 51:
          case 52:
          case 53:
          case 54:
              System.out.println("Extra large");
              break;
          default:
              System.out.println("lutfen gecerli bir ayak numarasi giriniz");


      }
        if (ayakkabiNo<35||ayakkabiNo>54){
            System.out.println("lutfen gecerli bir ayak giriniz");
        } else if (ayakkabiNo<40) {
            System.out.println("Small");
        } else if (ayakkabiNo<45) {
            System.out.println("medium");
        } else if (ayakkabiNo<50) {
            System.out.println("large");
        } else System.out.println("Extra Large");

        }


    }

