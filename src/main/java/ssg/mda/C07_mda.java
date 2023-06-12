package mda03;

public class C07_mda {
    public static void main(String[] args) {
        /*
        soru 7) Verilen bir multi dimensional array'in
        inner indexindeki elementlerinin ortalamasından
        büyük elementleri yazdıran bir kod yazınız.
        */
        int sayilar[][]={{32,45,64,77,22},{90,8,14,12,53},{33,42,61,83,24}};
        double ort=0;
        double sum=0;
        for (int []a:sayilar
             ) {
            for (int w:a
                 ) {
                sum+=w;
            }ort=sum/a.length;
            System.out.println(ort);
            for (int w:a
                 ) {
                if (w>ort){
                    System.out.print(w+" ");

                }

            }
            ort=0;
            sum=0;
            System.out.println("\n ----------------------------------");


        }

    }
}
