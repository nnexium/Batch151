package javaders.lambda.ŞuleHocaLambdaPractice;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        elemanlariYazdir(nums);
        System.out.println();
        elemanlariYazdir2(nums);
        System.out.println();
        ciftElYazdir(nums);
        System.out.println();
        ciftElyazdir2(nums);
        System.out.println();
        tekSayiKareBosluk(nums);
        System.out.println();
        tekSayiKupBosluk(nums);
        System.out.println();
        System.out.println(ciftSayiKare(nums));
        System.out.println();
        benzersizCiftElKareCarpimiYazdır(nums);
        System.out.println();


    }

    //1)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)

    public static void elemanlariYazdir(List<Integer> nums) {

        //1.yol
        for (Integer w : nums) {
            System.out.print(w + " ");
        }

    }


    //2.yol
    public static void elemanlariYazdir2(List<Integer> nums) {

        nums.stream().forEach(t -> System.out.print(t + " "));

    }


    //2)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    //3)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
    public static void ciftElYazdir(List<Integer> nums) {
        for (Integer w : nums) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }

    }


    //4)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void ciftElyazdir2(List<Integer> nums) {

        nums.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));

    }


    //5)  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void tekSayiKareBosluk(List<Integer> nums) {

        nums.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));

    }


    //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)

    public static void tekSayiKupBosluk(List<Integer> nums) {

        nums.stream().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));

    }


    //7) Benzersiz cift sayilarin karelerinin toplamini hesaplamak icin bir method olusturunuz

    public static Integer ciftSayiKare(List<Integer> nums) {

        return nums.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).reduce(Math::addExact).get();


    }



    //8)Benzersiz cift sayilarin karelerinin carpimini hesaplamak icin bir method olusturunuz

    public static void benzersizCiftElKareCarpimiYazdır(List<Integer> nums) {
        Integer benzersizCiftKareCarpim =
                nums.
                        stream().
                        distinct().
                        filter(t->t%2 ==0).
                        map(t->t*t).
                        reduce(Math::multiplyExact).
                        get();//45158400


    }


    //9)Liste ogelerinden max degeri veren bir method olusturunuz

    public static void listedenMaxYazdir(List<Integer> nums) {

      Integer max= nums.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)->t>u ? t:u);

        System.out.println(max);
    }

    //10)Liste ogelerinden minumum degeri veren method olusturunuz




}