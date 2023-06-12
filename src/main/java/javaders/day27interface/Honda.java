package javaders.day27interface;

public class Honda implements Engine, Break {


    @Override
    public void start() {
        System.out.println("Start...");
    }

    @Override
    public void payment() {

    }

    @Override
    public void slow() {

    }
}
