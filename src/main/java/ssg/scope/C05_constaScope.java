package scope03;

public class C05_constaScope {

     int a=5;
     int b=10;
     int c=15;

    C05_constaScope(int a){
        System.out.println(a);
        System.out.println(this.a);
    }
    C05_constaScope(int a,int b){
        this(7);
        System.out.println(a+b);
        System.out.println(this.b);
    }


    public static void main(String[] args) {
        //C05_constaScope obje=new C05_constaScope(1);
        int x=5;
        int y=7;

        C05_constaScope obje1=new C05_constaScope(x,y);
    }


}
