package stringBuilder03;

public class C04_stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hava bugun cok cok cok soguk");
        System.out.println(sb);
        sb.delete(11,14);
        System.out.println(sb);

        sb.deleteCharAt(sb.indexOf("o",sb.indexOf("o")+1));
        System.out.println(sb);

    }
}
