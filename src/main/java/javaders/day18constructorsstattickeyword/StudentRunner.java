package javaders.day18constructorsstattickeyword;

public class StudentRunner {
    public static void main(String[] args) {


        // Static olan "numOfRegisteredStd" variable ini çağırmak
        // icin sadece class ismini kullandık object oluşturmadık

        System.out.println(Student.numOfRegisteredStd);
        //static olmayan "num" variable ini çağırmak icin object oluşturduk.
        Student s1 = new Student();
        System.out.println(s1.num);


        //static olan "numOfRegistered" variable ini object uzerinden de ulasabilirsiniz ama bu hatadır.
        System.out.println(s1.numOfRegisteredStd);





    }
}
