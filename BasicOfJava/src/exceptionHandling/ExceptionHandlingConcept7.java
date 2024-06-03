package exceptionHandling;

public class ExceptionHandlingConcept7 {
    public static void main(String[] args) {
        System.out.println("you can keep any number of Statement here");
        try {
            int i = 10 / 0;
            System.out.println("This statement won't be executed");
        } catch (ArithmeticException e) {
            System.out.println("This block is executed immediately after an exception is Occur");
        }
        // can't keep any statement here
        finally {
            System.out.println("This block is always executed");
        }
        System.out.println("can keep any number of statement here");
    }
}
