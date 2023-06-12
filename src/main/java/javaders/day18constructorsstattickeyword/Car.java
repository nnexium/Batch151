package javaders.day18constructorsstattickeyword;

/*
1-Constructtor nasıl oluşturulur.
Access Modifier+Class ismi+()+{}
2-"Method" ile Constructor lar arasındaki farklar nelerdir?
    i)"Method"larda return type olur, "Constructtor" larda olmaz.
    ii)Method lar yaptıkları işe göre isimlendirilirler.Constructtor lar ise her zaman Class ismi ile isimlendirilirler.
    iii)Methodlar bir aksiyon yapmak icin oluşturulur.Constructtor lar ise Object oluşturmak icindir.
    iv)Method isimleri kucuk harfle baslar.Constructtor isimleri class ismi ile aynı olduğu icin buyuk harfle baslar.
3-Parametreli Constructtorlar oluşturarak aynı class dan farklı özelliklere sahip object ler oluşturulur.


 */



public class Car {

    String make ="Honda";
    String model ="Accord";
    int year =2021;
    int price =18000;

    //Default Constructtor
    //Default Constructor lar parametre kullanmazlar,
    //Default Construct ların body si boştur.
    //Default Constructor elle yazdığımızda  java object class icinndeki default constructor ı kullandırtmaz
    public Car(String bmw) {


    }
    public Car(String make, String model, int year, int price){

        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }


}
