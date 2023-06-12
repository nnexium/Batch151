package nestedForLoop;

public class C06_nestedForLoop {
    public static void main(String[] args) {
            /*
            a
            a b
            a b c
            a b c d
            a b c d e
            şeklini yazdırınız.
            */

        char input='z';
        System.out.println(input+11);//
        System.out.println(input+"ehra");//

        for (char i = 'a'; i <=input ; i++) {
            for (char j = 'a'; j <=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }


    }
}
