package passByValueOverLoading01;

public class C03_passByValue {
    public static void main(String[] args) {
        int [] b={1,5};
        sayiyiDegistir(b);
        System.out.println(b[0]);
    }

    public static void sayiyiDegistir(int[] a) {
        a[0]=8;

    }
}
