package scope03;

public class C02_scope {
    static int i;
    static int x=20;
    public static void main(String[] args) {
        int a=15;
        for (i = 0; i < 3; i++) {
            int b;
            System.out.println(i);
        }
        System.out.println(i);

        {

            System.out.println(a);
            System.out.println(i);
            int z=0;
        }

    }
}
