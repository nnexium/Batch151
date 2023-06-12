package introduction.day01varuables;

import java.util.Scanner;

public class dene {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your age...");
        int age = input.nextInt();

        System.out.print("Please enter your gender...");
        String gender = input.next();

        if (gender.equals("male")) {
            if (age >65) {
                System.out.println("Can be retired");
            } else {
                System.out.println("Should be working");
            }

        }else if (gender.equals("female")) {
            if (age >60) {
                System.out.println("Can be retired");
            } else {
                System.out.println("Should be working");
            }
        } else {
            System.out.println("Invalid gender");
        }






    }
}
