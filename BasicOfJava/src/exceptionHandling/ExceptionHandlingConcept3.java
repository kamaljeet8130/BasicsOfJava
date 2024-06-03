package exceptionHandling;

public class ExceptionHandlingConcept3 {
    public static void main(String[] args) {
        doStuff();
        System.out.println(10/0);
    }
    public static void doStuff(){
        doMoreStuff();
    }
    public static void doMoreStuff(){

    }
}


//RuntimeException: Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at exceptionHandling.ExceptionHandlingConcept3.main(ExceptionHandlingConcept3.java:6)