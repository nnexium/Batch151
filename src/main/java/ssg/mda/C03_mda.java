package mda03;

public class C03_mda {
    public static void main(String[] args) {
        /*
        soru 3) Verilen 2 katli bir multi-dimensional array'de
        outer index'i ve inner index'i ayni olan sayilarin toplamini bulunuz
        */
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i==j){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println(sum);

    }
}
