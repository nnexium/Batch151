package javaders.day37exceptionsenums;

public class IllegalAgeException extends RuntimeException {

    /*
        1)Eger Runtime Custom Exception uretmek isterseniz RuntimeException Class'a exend etmelisiniz.
        2)




     */
    public IllegalAgeException() {
        super();
    }

    public IllegalAgeException(String message) {
        super(message);

    }

}
