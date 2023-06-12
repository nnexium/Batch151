package javaders.day18constructorsstattickeyword;

public class Student {
    /*
    1)"Static" class memberlar(variable+method+constructor+code blocks) tüm object ler tarafından paylaşılır
    2)static class memberlardaki değişiklikler tum objectler tarafından otomatik olarak görülür
    3)static class member lar gökteki ayın dünyaya bağlı olduğu gibi class a bağlıdırlar.
        Bu yüzden static variable'lara "Class variable" da denir.
    4) "static" "class member"larin nasil calistigini anlamak icin cizim yapip static olanlari class'a olmayanlari object'e
    baglayarak dusunmek bu konuyu kolaylastirir.
    5) "static" "class member"ları cağırmak icin object oluşturmak gerekmez v e tavsiye edilmez, non static class
    memberlari cagırmak icin object olusturmak sarttır.

     */
    public static int numOfRegisteredStd = 0;
    public int num = 0;


    public Student() {
        numOfRegisteredStd++;
        num++;
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        Student s2 = new Student();

        Student s3 = new Student();

        System.out.println(numOfRegisteredStd);
        System.out.println(s1.num);
    }
}
