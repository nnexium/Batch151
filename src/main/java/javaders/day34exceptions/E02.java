package javaders.day34exceptions;

public class E02 {
    public static void main(String[] args) {


    String a []= {"A", "V", "A", "J"};

        System.out.println(getElement(a, 3));
        System.out.println(getElement(a, -3));


    }

    // Bir string array den istenilen bir elemani eleman siras ile alan method olusturunuz

    public static String getElement(String a[],int numOfElements){
            String result = "";
            try{
                result=a[numOfElements-1];
            }catch (ArrayIndexOutOfBoundsException e){//ArrayInndexOutOfBoundsException array
                                            // islemlerinde olmayan index kullandığınızda atilir.

                if(numOfElements-1<0){
                    result = a[0];
                }else{
                    result = a[a.length-1];
                }
            } return result;
    }
}
