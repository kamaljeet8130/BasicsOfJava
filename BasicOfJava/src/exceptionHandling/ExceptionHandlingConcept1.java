package exceptionHandling;

public class ExceptionHandlingConcept1 {
    public static void main(String[] args) {
        doStuff();
    }
    public static void doStuff(){
        doMoreStuff();
    }
    public static void doMoreStuff(){
        System.out.println(10/0);
    }
}


// Runtime Error : Excetpion in thread "main" : ArithmeticException : / by zero
// at ExceptionHandlingConcetp1.doMoreStuff();
// at ExceptionHandlingConcetp1.doStuff();
// at ExceptionHandlingConcetp1.main();
