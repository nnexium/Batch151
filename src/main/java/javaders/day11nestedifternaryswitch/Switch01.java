package javaders.day11nestedifternaryswitch;

/*
    gun isimlerini aliniz, o gunun kacinci gün olduğunu ekrana yazdiriniz.
    Sunday ==>1 Monday ==>2 Tuesday ==>3 Wednesday ==>4 Thursday ==>5
    Friday ==>6 Saturday ==>7

 */


import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

        java.util.Scanner input = new Scanner(System.in);
        System.out.println("Please enter day name...");
        String dayname = input.next();
/*
        //1.yol
        if(dayname.equalsIgnoreCase("Sunday")){
            System.out.println("Sunday is the first day");
        } else if(dayname.equalsIgnoreCase("Monday")){
            System.out.println("Monday is the second day");
        } else if(dayname.equalsIgnoreCase("Tuesday")){
            System.out.println("Tuesday is the second day");
        }else if(dayname.equalsIgnoreCase("Wensday")){
            System.out.println("Wensdday is the second day");
        }else if(dayname.equalsIgnoreCase("Thursday")){
            System.out.println("Thursday is the second day");
        }else if(dayname.equalsIgnoreCase("Friday")){
            System.out.println("Friday is the second day");
        }else if(dayname.equalsIgnoreCase("Saturday")){
            System.out.println("Saturday is the second day");
        }else
            System.out.println("İnvalid name day");
*/
        //2.yol

        switch (dayname.toLowerCase()){

            case "Sunday":
                System.out.println("Sunday is the first day");
                break;
            case "Monday":
                System.out.println("Monday is the second day");
                break;
            case "Tuesday":
                System.out.println("Tuesday is the second day");
                break;
            case "Wensday":
                System.out.println("Wensday is the second day");
                break;
            case "Thursday":
                System.out.println("Thursday is the second day");
                break;
            case "Friday":
                System.out.println("Friday is the second day");
                break;
            case "Saturday":
                System.out.println("Saturday is the second day");
                break;
            default:
                System.out.println("invalid day name");
                break;

        }






    }//main
}//
