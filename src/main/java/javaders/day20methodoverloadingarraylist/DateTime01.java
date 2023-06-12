package javaders.day20methodoverloadingarraylist;



import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {
        //icinde bulundugumuz zaman dilimindeki tarihi nasil aliriz?
        LocalDate myCurrentDate = LocalDate.now();
        System.out.println("myCurrentDate = " + myCurrentDate);
        //tarihten istediğimiz bileseni nasıl aliriz
        int montValue=myCurrentDate.getMonthValue();
        System.out.println(montValue);

        int dayValue =myCurrentDate.getDayOfMonth();
        System.out.println("dayValue = " + dayValue);
        //Aşağıdaki Month bir Enum dır, Enum java da sabit degerleri depolamak icin kullanılır.
        //Enum Java da sabit degerleri (Ay isimleri, Gun isimleri Ulkedeki sehir isimleri) depolamak icin kullanılır.


        Month monthName = myCurrentDate.getMonth();
        System.out.println("monthName = " + monthName);
        //asagidaki DayofWeek bir Enum dir.
        DayOfWeek dayName = myCurrentDate.getDayOfWeek();
        System.out.println("dayName = " + dayName);

        //ileriki tarihe nasıl gidilir.
        System.out.println(myCurrentDate.plusDays(5).plusMonths(2).plusYears(4));

        //geri bir tarihe nasil gidilir?
        System.out.println(myCurrentDate.minusYears(30).plusMonths(2).plusDays(18));
        //Bir tarih objesi nasıl oluşturulur
        LocalDate gokhanDob = LocalDate.of(1986,6,10);
        LocalDate fatihDob= LocalDate.of(1985,2,25);
        //bir tarihin bir tairhten sonra olup olmadığı nasıl kontrol edilir
        boolean r1 = gokhanDob.isAfter(fatihDob);
        //bilr tarihin bir tarihten önce olup olmadığı nasıl kontrol edilir
        boolean r2 = fatihDob.isBefore(gokhanDob);
        //eşit olup olmadığı nasıl kontrol edilir
        boolean r3 =gokhanDob.isEqual(fatihDob);


        System.out.println("r1 = " + r1);

        //Ex:Kullanıcıdan aldıgınız tarih gecmise ait ise "Gecersiz tarih girdiniz" mesajı veriniz
        //kullanıcıdan aldgınız tarih gelecege ait ise zamanı girebilirsiniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter year, mont, and day numbers in the given order");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        LocalDate givenDate= LocalDate.of(year, month, day);

        if (givenDate.isBefore(LocalDate.now())){
            System.out.println("İnvalid date");
        }else{
            System.out.println("Enter time for the ticket");
        }

        int lengthOfMonth = myCurrentDate.lengthOfMonth();
        System.out.println(lengthOfMonth);

//Ex kullanıcinin girdiği tarihin gun ismini bulan kodu yaziniz
        System.out.println("Please enter year, mont, and day numbers in the given order");
        int y = input.nextInt();
        int m = input.nextInt();
        int d = input.nextInt();

        LocalDate date = LocalDate.of(y, m, d);

        System.out.println(date.getDayOfWeek());
    }
}
