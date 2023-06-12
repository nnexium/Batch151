package javaders.day24inheritancepolymorphism;

public class Volvo extends Car {

    public void secure(){

        System.out.println("Volvo is the most securecar in the world.");


    }



    @Override//Bu bir "annotation"dır.@override annotation'ı Override kurallarını kontrol eder.
    public void move() {
        System.out.println("Volvo moves...");
    }
}
