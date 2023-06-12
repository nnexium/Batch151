package stringBuilder03;

public class C05_stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Java bugun cok kolay.");
        System.out.println(sb.indexOf("u",7));
        sb.replace(5,10,"Havaaaaaaa");
        System.out.println(sb);
        sb.setCharAt(sb.indexOf("."),'!');
        System.out.println(sb);}
}
