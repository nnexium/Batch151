package javaders.day37exceptionsenums;

public class IllegalGradeException extends Exception {

    /*
    1)Custom Exception cLASS OLUŞTURMAK İCİN eXCEPTİON cLASS'A EXTEND ETMELİYİZ.
    Exception Class'a extend ederek olusturduğunuz Cumtom Exception "Compile Time Exception" olur.
    2)Custom Exception Class olustururken "constructor" olusturmalisiniz.
        Bu "constructor" parnet'taki constructor'i cagırmalidir.
        Bu "constructor" mesaj verecek veya vermeyecek sekilde olusturulabilixr.
    3)Custom Exception Class olusturduğunuzda ismin sonunda "Exception" kelimesini kullanmalisiniz.
        IllegalGradeEXception da olduğu gibi.



     */

    public IllegalGradeException(String message){
        super(message);

    }
    public IllegalGradeException(){
        super();
    }
}
