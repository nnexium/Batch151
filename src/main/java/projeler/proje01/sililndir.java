package projeler.proje01;

import java.util.Scanner;

public class sililndir {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Silindirin yarıçap ve uzun kenarın uzunluğunu giriniz");
        Double yarıCapSil = input.nextDouble();
        Double uzunSil = input.nextDouble();


        double silindirHacim = Math.PI*yarıCapSil*yarıCapSil*uzunSil;

        double silindirAlan= 2*Math.PI*yarıCapSil*(yarıCapSil+uzunSil);

        System.out.println("Silindirin hacmi:" + silindirHacim + " Silindirin  yüzey alanı:" + silindirAlan);





    }
}
