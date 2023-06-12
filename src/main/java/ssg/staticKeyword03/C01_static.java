package staticKeyword03;

public class C01_static {
      /*
      soru 1)bir static birde non-static(instance) variable olusturun
      ve arasindaki farklari inceleyin
      */
    static int sayi=15;
    int rakam=8;

    public static void main(String[] args) {
        System.out.println(sayi);//15
        C01_static obj1=new C01_static();
        System.out.println(obj1.rakam);//8
        obj1.rakam=3;
        obj1.sayi=28;
        System.out.println(obj1.rakam);//3
        System.out.println(obj1.sayi);//28
        C01_static obj2=new C01_static();
        System.out.println(obj2.rakam);//8
        System.out.println(obj2.sayi);//28

    }

}
