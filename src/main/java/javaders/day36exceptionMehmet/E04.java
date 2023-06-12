package javaders.day36exceptionMehmet;

public class E04 {
    /*
    throw keyword bir method bodysiicinde istedigimiz yerde, istediğimiz kosullar icin istedigimiz

     */
    public static void main(String[] args) {

        printAge(160);

    }
    public static void printAge(int age) {

        if (age<0){
            throw new IllegalArgumentException("Age cannot be negative");
        }else if (age>150){
            throw new IllegalArgumentException("Age cannot be greater than 150");
        }else {
            System.out.println("age = " + age);
        }


    }
}
