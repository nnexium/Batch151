package javaders.day14loops;

import java.util.Scanner;

public class Loops04 {
    public static void main(String[] args) {

        //kullanıcı username ve password u 3 kereden fazla yanlış girerse "Your account was blocked"
        //3 kereye kadar yanlış girerse "Invalid username or password, try again" mesajı alsın
        // Doğru girerse "Welcome to your account" mesajı alsın.


        Scanner input = new Scanner(System.in);
        int counter = 0;
        String validUsername = "techpro123";
        String validPassword = "Education12?";


        do {
            if(counter==3){
                System.out.println("Your account was blocked");
                break;
            }


            System.out.println("Please enter your Username: ");
            String username = input.next();

            System.out.println("Please enter your Password: ");
            String password = input.next();

            counter++;

            if (username.equals(validUsername) && password.equals(validPassword) ) {
                System.out.println("Welcome to your account");
                break;
            } else {
                System.out.println("Invalid username or password, try again");
                System.out.println((3-counter) +" right left");// kaç hak kaldığını belirtmek için ekledik
            }

        }while( counter<3);















    }//main

}//class
