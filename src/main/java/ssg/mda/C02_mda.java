package mda03;

public class C02_mda {
    public static void main(String[] args) {
        /*
        soru 2) verilen bir multi-dimensional array in
        tum elementlerini yazdiran bir method olusturun
        */
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        elementYazdir(arr);
    }

    private static void elementYazdir(int[][] arr) {
        for (int[]a:arr
             ) {
            for (int w:a
                 ) {
                System.out.print(w+" ");
            }
            System.out.println("\n"+"-----------------------------");
        }

    }
}
