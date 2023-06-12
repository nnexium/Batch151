package javaders.day27interface;

public class CarRunner {

    public static void main(String[] args) {

        Engine.stop();// stop methodu static olduğundan interface ismi ile ulaştım.

        Honda h = new Honda();
        h.eco();// eco() methodu static ollmadığından(olmadığından) "object" static olmadığından "object" ile ulaştım,




    }
}
