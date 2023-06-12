package javaders.day38enumsiterators;

import java.util.*;

public class Iterators01 {

    /*
    1)Iterator lar loopların yaptığı aynı isi yapar.
    2)Iterator'larda sonsuz loop olusma ihtimali yoktur.
    3)Iteratorlar ile looplar arasında performans farki yoktur.
    4)Iteratorlar bir collection'dan eleman silme ve bir collectiondaki elemani değistirme konusunda
    daha basarılıdır.
    5)İki tip iterator var; i)Iteratıor:Bu sadece eleman silmede kullanilir,
                            eleman eklemek veya elemanı değistirmek mumkun değildir
                            ii)ListIterator:Bu eleman silebilir, ekleyebilir ve degistirabeliri.
                            Note:Iterator sadece soldan sağa calisir.(ilk elemandan son elemana)
                                ListIterator ise iki yonlu calisabilir.
    Bir list'in değiştirilmesini imkansız hale getirmek istiyorsanız, Iterator kullanırız, değiştirmek istiyorsak
    ListIterator kullanırız.

     */


    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList);

        //Iterator kullanalım
        Iterator<String> myItr = myList.iterator();

        while (myItr.hasNext()) {//hasnext pointer'a senden sonra eleman var mi ? diye sorar,
                                // varsa true, yoksa false döndürür.

            myItr.next(); //next methodu pointer'ı bir sonraki elemanın önüne taşır ve üstünden atladığı elemanı return eder

            myItr.remove();//next methodunun return ettiği elemanı siler.


        }
        System.out.println(myList);


        //ListIterator
        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");
        yourList.add("Angie");
        yourList.add("Mark");
        System.out.println(yourList);

        ListIterator<String> yourListItr=yourList.listIterator();

        while(yourListItr.hasNext()) {//pointer'ı en sağa getirmeden hasprevious u kullanamayız
            
            String el=yourListItr.next();//set() methodu List'i update etmeye yarar.

            yourListItr.set(el+"!");


        }
        System.out.println("yourListItr = " + yourList);

        //hasPrevious() ve previous() nasil kullanilir?

        while(yourListItr.hasPrevious()) {//Has previous ve previous kullanmak icin pointer'ı en sona yollamalıyız.

            String el = yourListItr.previous();
            System.out.println(el);

            yourListItr.set("?" + el);
        }

            System.out.println(yourList);//Iterator List'i değiştirdiği icin List'i yazdırıyoruz.

        //En sondan en başa nasil iterate edebiliriz? //azalan sıralama, en sondan başlar.
        //En sondan en basa nasil iterate edebiliriz?
        LinkedList<String> ourList = new LinkedList<>();
        ourList.add("Tom");
        ourList.add("Jim");
        ourList.add("Clara");
        ourList.add("Angie");
        ourList.add("Mark");
        System.out.println(ourList);

        Iterator<String> ourListItr = ourList.descendingIterator();// descendingIterator() ancak LinkedList ile kulanilabilir.

        while(ourListItr.hasNext()){
            String el = ourListItr.next();
            System.out.println(el);
        }
    }
}