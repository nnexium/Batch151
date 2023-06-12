package javaders.day29collections;

import java.util.LinkedList;

/*
ArrayListler eleman silme ve eklemede yavastirlar. Cunku tekrar indexlemeye ihtiyac duyarlar.
LinkedListler ise elaman silmede basarilidirlar. LinkedListlerde her eleman bir sonrakini gosteriyor
ve en sondakinin sonrasi olmasa da null gosterir. LinkedListeler index kullanmazlar.

LinkedListlerde en bastaki elemandan daha once Head eleman vardir. Son eleman'a Tail denir en sonda
oldugu icin. Elemanlarin yapisi farkli olup bunlara Node denir. Yapinin bir yuzune point, on yuzune
ornegimize gore harf olan kismina Data denir. Node, Data ve Point'den olusuyor.
Bir eleman sildigimizde eleman sildik demiyoruz, node sildigimizi soyluyoruz.

NOTE:ArrayList'ler eleman bulmada cok basarilidir , LinkedList'ler ise node bulmada basarisizdir ekleme
ve cikarmada ise LinkedList'ler daha basarilidir.
1)LinkedListler node silme ve eklemede cok başarılı oldukları icin, silme ve ekleme islemlerini coklukla yapacagınız zaman
LinkedList kullaniniz.
2)ArrayList'ler indexleri adres gibi kullanir, bu yuzden ArrayListler ^search^islemlerinde cok basarılıdırlar.
Note= İhtiyacınız olan collection cogunlukla silme ve ekleme islmeleri yapacaksa(muze ziyaretcileri gibi) LinkedList,
^seacrch" islemleri yapacaksa (amerika eyaletler gibi) ArrayList kullanilir.
 */
public class LinkedList01 {
    public static void main(String[] args) {

        LinkedList<String> s = new LinkedList<>();

        s.add("Steve");
        s.add("Ajda");
        s.add("Muge");
        s.add("Cuneyt");
        s.add("Esra");
        s.add(2,"Esen");
        s.addFirst("Ajdar");
        s.add("Esra");
        s.addLast("Mahmut");
        System.out.println("s = " + s);
        
        s.remove(2);
        System.out.println("s = " + s);
        
        s.remove("Ajdar");
        System.out.println("s = " + s);

     //   s.remove();// ilk elemanı siler default olarak.

        s.removeFirstOccurrence("Esra");//ilk esra gider

        System.out.println("s = " + s);
        
     //   s.removeLastOccurrence("Esra");// son esra gider
        System.out.println("s = " + s);

        String r1 = s.peek();//ilk elemanı silmedensize verir. Copy Paste yapar sadece.
        System.out.println("r1 = " + r1);

        String r2=s.poll();//ilk elemanı size verir ve o elemanı Listden siler, Cut Paste yapar.
        System.out.println("r2 = " + r2);

        /*
        Retrieves, but does not remove, the head (first element) of this list.
        Returns:the head of this list
        Throws: NoSuchElementException – if this list is empty
        Note: peek ile element ikisi de ilk elemanı silmeden size verir.
        ama peek list boş olduğunda size null verir, element size hata verir.
         */
        s.element();// ilk elemanı silmeden size verir.(Copy+paste)
        /*
        Note:poll() ile pop() ikisi de ilk elemani silmeden size verir
        Ama poll() list bos oldugunda size null verir, pop() ise "hata" verir
         */
        s.pop();//removeFirst ile tamamen aynı olarak calisir.İlk elemanı siler.

        
    }
}
