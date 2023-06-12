package nestedForLoop;

public class C05_nestedForLoop {
    public static void main(String[] args) {
        /*
        * * * * .
        * * * . .
        * * . . .
        * . . . .
        . . . . .
        */
        int satir=5;
        for (int bulsatir = 1; bulsatir <=satir ; bulsatir++) {
            for (int j = 1; j <=satir-bulsatir; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <=bulsatir ; j++) {
                System.out.print(". ");
            }
            System.out.println();



        }




    }
}
