package javaders.day24inheritancepolymorphism;

public class Toyota extends Car {



    public void hybrid(){
        System.out.println("Toyota is a hybrid engine...");


    }
    public Toyota() {

        System.out.println("Toyota constructor 1");

    }
    public Toyota (String s){
        this();
        System.out.println("Toyota constructor 2");

    }
}