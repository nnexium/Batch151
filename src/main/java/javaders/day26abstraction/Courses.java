package javaders.day26abstraction;
/*
1)Parent class daki methodun body'si hicbir child tarafından kullanilmaz.
Bu durumda parent'daki method'a body yazmak hic kullanilmadiığı icin mantıklı degildir,
Biz de o method'a yazmayiz
2)Body'si yazilmayan method'a "Abstract Method" denir.Abstract ingilizcede vücutsuz veya soyut anlamındadır.
3)Methodun  body'sini yazmayınca java hata verir biz de Abstract keyword'unu kullanarak Java'ya bu methodun
bodysi olmayacak deriz.
4)"abstract" keywordunu kullanınca elde ettiğimiz abstract method normal claslara konulamaz, o yüzden classi da abstract
yapariz.
5)Parent'taki method abstract ise butun child class'lar o method'u override etmek zorundadir.
Bu yüzden tum child'lar icin mecburi olmasını istediğimiz fonksiyonları abstract yapmak mantikli bir secimdir.
6)Body'si olan method'lar(concrete Method) abstract class'larin icine yazilabilir.
abstract method'lar concrete class'larin icine yazilamazlar.
7)"abstract" keyword ile "methodbody" bir method'da ayni anda kullanilamaz.
8)"abstract" class'larin icinde "abstract" methodlar olur, "abstract methodlar" bodysi olmadığından "eksik method"lar
gibi düşünülebilir.
Yani abstract class icinde eksik bir yapi barindirir, siz abstract class'dan obje üretirseniz abstract class icindeki eksiklik
object'e yansır ve object eksiği olan bir object olmuş olur.Java bunu istemez cünkü ekik object eksik iş yapar.
Java application'i korumak icin "abstract class"lardan object uretilmesini engellemiştir.
9)"abstract" classlarin constructor'i vardir ama object oluşturamazlar.
10)final methodlar abstract olamazlar.
11)"private" methodlar abstract olamazlar
12)"abstract" class'ın abstract childi veya concrete child'i  olabilir.


 */
/*
    final keyword java da ne anlama gelir?
    "Final" keyword i) variable'larda ii) method'larda iii)classlarda kullanilixr
    i)variable'larda kullanildiğinda a)O variable'a kesinlikle deger atamasi yapilmalidir.
                                     b)İlk atanan deger degiştirilemez.

    ii)methodlarda kullanildiğinda a)o methodun body'si degiştirilemez
                                   b)O method override edilemez.
    iii)class'larda kullanildiğinda a)O class'in child class'i olamaz ama final class'in kendisi child olabilir.

 */
public abstract class Courses {
    public abstract void math();
}
