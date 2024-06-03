package exceptionHandling;

public class ExceptionHandlingConcept13 {
   static boolean aBoolean = false;

    public ExceptionHandlingConcept13() {
        if (ExcplicitException.class.isAssignableFrom(Throwable.class)) {
            aBoolean = true;
        }
    }

    public static void main(String[] args) {
        System.out.println(ExceptionHandlingConcept13.aBoolean);
    }

}

class ExcplicitException extends Throwable {

}
