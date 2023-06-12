package javaders.day24inheritancepolymorphism;

public class Car {
    /*
    1) Inheritance da object oluştururken constructorlar yukarıdan(Parent) aşagıya(Child) doğru calışır.
    2)Parent ve super eş anlamlidir,Child ve Sub eş anlamlildir.
    3)super() her constructorin ilk satirinda göronmez olarak bulunur,
    isterseniz görünüz şekilde de yazabilirsiniz.
    4)super() sizi parent class daki constructora taşır.
    5)this sizi aynı class icindeki constructorlar arasında gezdirir
    6)this icinde bulunduğunuz classdaki variableları cagırmaya yarar
    super parent classdaki variableları cagırmaya yarar
    7)Eger daha typeları arasında "IS-A" ve "Has A" ilişkisi varsa bu data typelerine "COVARİANT" denir.
     */


    /*
    1)Polymomrpism ===> Coklu şekil
    Yani bir methodun farklı şekillerde karşımıza çıkması demektir.
    Polymorphism=Overloading + Overriding
    2)Overriding parent classdaki methodu child classın ihtiyaçlarına göre özelleştirerek kullanmak demektir.
    3)Overriding de methodun bodysisni değiştirilir.
    4)Overriding de method signature a dokunulmaz.Dokunursaniz Java kızar


     */



    public void move() {
        System.out.println("Cars move");
    }

    public void getbreak() {
        System.out.println("Cars break");
    }

    public void engine() {
        System.out.println("Cars have engine");
    }

    public String model ="Car";
    public int price=0;

    public Car(){
        System.out.println("Car constructor 1");
    }

    public Car(int i){
        this();
        System.out.println("Car constructor 2");
    }

}