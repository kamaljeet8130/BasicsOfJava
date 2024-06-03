package exceptionHandling;

public class ExceptionHandlingConcept2{
    public static void main(String[] args) {
        doStuff();
    }
    public static void doStuff(){
        doMoreStuff();
        System.out.println(10/0);
    }
    public static void doMoreStuff(){

    }
}


// RuntimeException: Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at exceptionHandling.ExceptionHandlingConcept2.doStuff(ExceptionHandlingConcept2.java:9)
//	at exceptionHandling.ExceptionHandlingConcept2.main(ExceptionHandlingConcept2.java:5)