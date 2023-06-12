package operation02;

public class C02_operation {
    public static void main(String[] args) {
        int sayi1=3;
        int sayi2=7;
        System.out.println(sayi1 += 4); //sayi1=sayi1+4;//7
        System.out.println(sayi1);//7
        System.out.println(sayi1 -= sayi2);//sayi1=sayi1-sayi2;//0
        System.out.println("sayi1 : "+sayi1);//0
        System.out.println("sayi2 : "+sayi2);//7
        System.out.println(sayi1 = sayi2);//7
        System.out.println("sayi1 : "+sayi1);//7
        System.out.println(sayi2 *= sayi1);//sayi2=sayi2*sayi1;//49
        System.out.println("sayi2 : "+sayi2);//49
        System.out.println(sayi2 %= sayi1);//sayi2=sayi2%sayi1 kalan 0 oldugu icin sayi2 0 oldu
        System.out.println(sayi2);//0
        sayi2/=sayi1;//0
        System.out.println(sayi2);
        //System.out.println(sayi1 /= sayi2);//islemlerde olan hatalari dondurur
    }
}
