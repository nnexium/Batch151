package javaders.day27interface;

/*
            İNTERFACE deki METHODLAR
1)İnterface icine "concrete method" konulamaz.
2)interface icindeki methodlarin abstract olduğunu Java bilir,
bu yüzden interface icindeki abstract methodlarda abstract keyword kullanmaya gerek yoktur.
3)interface  icindeki abstract methodlarin tamami public'dir,
Bu yüzden interface icindeki abstract method oluştururken "acces modifier" yazmaya gerek yok.
4)Bir interface i bir class in parent'i yapmak istediğinizde extendns keyword yerine
impements keyword kullaniniz.
5)"Concrete Child Class"lar parent interfacedeki abstract methodları override etmek zorundadırlar.
6)interfaceler applicationda "concrete child class larin yapmakzorunda olduklari fonksiyonları
barindirirlar. Bu yüzdeninfterfacelere todo lislt denir.
7)Birden fazla "parent interface" icinde aynı isimli abstract methodlar oluşturabilirsiniz.
abstract methodların bodysi olmadığı icin child claslar ayni isimli methodlardan herhangi birini
override ederek kullanailirler.
8)Birden fazla parent interface icinnde aynı isimli abstract methodlar oluşturduğunuzda bu
methodlarin returntype ları aynı olmak zorundadır.
9)Normalde interface içine concretemethod konulamaz ama bazı özel durumlarda concerete method
koymamız gerekirse "default" keywordunu aşağıdaki gibi kullanarak interface icine concerete method
koyabiliriz.
        i)default void eco(){System.out.println()}
        ii)static keywordunu aşağıdaki gibi kullanarak interface icine concerete method
        koyabiliriz. static void stop(){ System.out.println("Stop securely")}
10)default veya static keywordunu kullanarak oluşturduğunuz concrete methodlarin concerete
child claslar tarafından kullanılma zorunluluğu yoktur.
11)default keywordunu kullanarak oluşturduğunuz concrete methodlara object oluşturarak ulaşabilir.
Static keywordunu kullanarak oluşturduğunuz concerete methodlara ulaşmak icin object oluşturmaya
gerek yoktur, interface ismi yeterlidir.
12)interface lerden object oluşturulmaz, interfacelerin constructor'ı yoktur.

 */
public interface Engine {
    public void start();

    void payment();

    default void eco(){
        System.out.println("Uses pas less...");
    }
    static void stop(){
        System.out.println("Stop securely");
    }
}
