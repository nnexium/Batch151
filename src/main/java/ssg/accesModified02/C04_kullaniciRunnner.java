package accesModifier02;

import accesModified01.C01_kullanici;

public class C04_kullaniciRunnner extends C01_kullanici {
    static String kullaniciAdi="ahmet";
    static int kullaniciId=112233;
    public static void main(String[] args) {
        C01_kullanici k1=new C04_kullaniciRunnner();
        System.out.println(k1.kullaniciAdi);
        System.out.println(k1.kullaniciId);
        System.out.println(kullaniciId);
    }
}
