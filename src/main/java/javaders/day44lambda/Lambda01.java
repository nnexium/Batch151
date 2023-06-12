package javaders.day44lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) throws IOException {

    //Example 1:Verilen text file icindeki text'i console'a yazdiran code'u yaziniz.
        Files.lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).
                forEach(System.out::println);

        //Example 2:Verilen textfile icindeki text'i buyuk harflerle console'a yazdiran code'u yaziniz.

        Files.lines(Paths.get("src/main/java/javaders/day44lambda/myTextFile.txt")).
                map(String::toUpperCase).
                forEach(System.out::println);

        //Example 3:Ver text file icindeki textlerde Java kelimesinin olup olmadgını kontrol eden kodu yaziniz.

        boolean r1 = Files.lines(Paths.get("\"src/main/java/javaders/day44lambda/myTextFile.txt\"")).
                anyMatch(t->t.contains("Java"));

        System.out.println(r1);

        //Example 4: Verilen text file icindeki textlerde kullanilan farkli kelimeleri bir list icinde return ediniz.

        List<String> words = Files.
                lines(Paths.get("src/day44lambda/myTextFile.txt")).
                map(t->t.replaceAll("\\p{Punct}","").
                        split(" ")).
                flatMap(Arrays::stream).
                distinct().
                collect(Collectors.toList());
        System.out.println(words);

        //Example 5: Verilen text file icindeki textde toplam kaç harf kullanıldığını gösteren kodu yaziniz.
        long numOfLetters = Files.
                lines(Paths.get("src/main/java/day44lambda/myTextFile.txt")).
                map(t->t.replaceAll("[^a-zA-Z]", "")).
                map(t->t.split("")).
                flatMap(Arrays::stream).
                count();
        System.out.println(numOfLetters);

        //Example 6: Verilen text file icindeki text'de kullanilan tum harfleri alfabetik olarak ters sirada bir listin
        //           icinde return eden kodu yaziniz.
        List<String> letters =   Files.
                lines(Paths.get("src/main/java/day44lambda/myTextFile.txt")).
                map(t->t.replaceAll("[^A-Za-z]","")).
                map(t->t.split("")).
                flatMap(Arrays::stream).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println(letters);








    }


}
