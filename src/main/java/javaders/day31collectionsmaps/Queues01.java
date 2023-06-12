package javaders.day31collectionsmaps;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {


        Queue<String> warehouse = new LinkedList<>();
        warehouse.add("Milk");
        warehouse.add("Meat");
        warehouse.add("Bread");
        warehouse.add("Egg");
        warehouse.add("Cheese");
        System.out.println(warehouse);

        warehouse.remove();
        System.out.println(warehouse);

        warehouse.peek();
        System.out.println(warehouse.peek());//Meat verir,queue boşsa peek size null verir, element hata verir.
        System.out.println(warehouse.element());//Meat,peek gibi ilk elemeanı silmeden verir.
        System.out.println(warehouse.poll());//Meat, İlk elemanı size verir ancak siler, boş da ise null verir.
        
        warehouse.clear();
        System.out.println(warehouse.poll());//null verir.
        System.out.println(warehouse.remove());//Exception verir



    }
}
