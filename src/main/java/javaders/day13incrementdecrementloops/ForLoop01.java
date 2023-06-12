package javaders.day13incrementdecrementloops;

public class ForLoop01 {
    public static void main(String[] args) {

        // Example 21den 180 e kadar hem 4 hem de 6 ile bolunebilen tam sayiları ekrana yazdiriniz

        for (int i = 21; i <= 181; i++ ) {
            if (i%4==0 & i%6 == 0)
            System.out.print(" "+i);
        }

        System.out.println();
    // example size verilen kucuk harfle yazilmiş Stringin index i citf sayi olan characterlerehe buyuk harfle yazdiran
        // kodu yazdirin
        // ankara ==AKR
        //Yazdığınız kod belli senaryolar icin çalışıyor ancak tüm senanryolar icin calışmıyorsa bu tarz koda
        // hard code denir, ve mutlaka duzeltilmelidir

        String s = "ankara";
        for (int i = 0; i < s.length(); i++) {

            String ch = s.substring(i, i+1);
            if (i%2==0){
                System.out.print(ch.toUpperCase());
            }
        }


        //








    }//main
}
