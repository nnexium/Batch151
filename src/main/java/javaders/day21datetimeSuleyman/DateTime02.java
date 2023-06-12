package javaders.day21datetimeSuleyman;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {

    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ldt);//2023-03-16T22:07:45.636411700

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("M/dd/yyyy - hh:mm a");
        String formattedLdt = dtf1.format(ldt);

        System.out.println(formattedLdt);// 3/16/2023 - 03:11 PM





    }
}
