package javaders.day15loopsarrays;

import java.util.Scanner;

public class NestedLoop01 {

    /*
    1.Example:Type code to get the output like
                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
                        Week: 3
                          Day: 1
                          Day: 2
                          Day: 3
                          ....

     */




    public static void main(String[] args) {
//nestedforloop la yazılan
        for (int i = 1; i <5; i++) {

            System.out.println(" week: " + i);
            for (int j = 1; j <8; j++) {
                System.out.println("Day: " + j  );
            }
        }


//nested while loop ile yazılan

        int i = 1;

        while (i <3) {
            System.out.println(" week: " + i);

            int k=1;
            while (k <3) {
                System.out.println("Day: " + k);
                k++;
            }

            i++;
        }


// 2.Example: Write a Java Program to Print Rectangle Star Pattern using For Loop
//                        ****
//                        ****
//                        ****
//            Note: Get the number of the rows and the columns from user

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();

        for (int r = 1 ; r <= rows; r++) {

            for (int c = 0; c <=columns ; c++) {
                System.out.print("*");

            }
            System.out.println();


        }


    /*   3.Example: Type code to get the output like
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
   */

        System.out.println("Please enter row number");
        int row = input.nextInt();

        for (int m = 0; m <=row ; m++) {

            for (int n = 1; n <=m; n++) {
                System.out.print(" "+ n);
            }
            System.out.println();
        }










    }  //main

}
