package javaders.day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {
        //Example 1: Verilen cumledeki kelimelerin gorunum sayisini veren kodu yaziniz.
        //"I like you, like like!"  => I=1, like=3, you=1

        String s = "I like you you, like like!";
        System.out.println(s);// I like you, like like!

        s=s.replaceAll("\\p{Punct}","");
        System.out.println(s);

        String words[]=s.split(" ");

        System.out.println(Arrays.toString(words));

        HashMap<String,Integer>occ=new HashMap<String,Integer>();
        //Words arrayindeki kelimeler birer birer Map'da var mı diye konrol edilecek.
        //words arrayindeki kelimelerMap'de yoksa Map'e value'su 1 olarak yerleştirilecek.
        //words arrayindeki kelimeler map'de varsa map'e varolan value'u 1 artırılarak yerleştirilecek.
        for ( String w : words            ) {
            Integer numofOCC=occ.get(w);

            if (numofOCC==null){
                occ.put(w,1);
            }else{
                occ.replace(w, numofOCC+1);
            }
        }
        System.out.println(occ);

    }

}