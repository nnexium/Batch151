package scope03;

public class C01_scope {
    int yas=20;
    static String isim="Ali";

    public static void main(String[] args) {
       // String isim="AliCan";
        int yas=15;
        C01_scope obj1=new C01_scope();
        System.out.println(obj1.yas);
        System.out.println(yas);
        System.out.println(isim);
        System.out.println(isim);

    }
}
