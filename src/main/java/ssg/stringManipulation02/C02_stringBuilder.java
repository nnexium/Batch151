package stringBuilder03;

public class C02_stringBuilder {
    public static void main(String[] args) {
        //soru 2)StringBuilder Classindaki ekleme methodlarina bakiniz
        StringBuilder sb=new StringBuilder("Java Cok");
        System.out.println(sb);
        // sb.append(" Guzeldir");
        System.out.println(sb);
        sb.insert(5,"bugun ");
        System.out.println(sb);
        String str="Hava Bugun Cok Kotu";
        sb.append(str,14,19);
        System.out.println(sb);

    }
}
