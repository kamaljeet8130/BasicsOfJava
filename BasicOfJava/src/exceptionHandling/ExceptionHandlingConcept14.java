package exceptionHandling;

public class ExceptionHandlingConcept14 {
    public static void main(String[] args) {
        try{
            java.lang.NumberFormatException ex = new java.lang.NumberFormatException("Exception");
            ex.initCause(new java.lang.NullPointerException("This is actual cause of the exception"));
                    throw ex;
        }catch (java.lang.NumberFormatException exception){
            System.out.println(exception);
            System.out.println(exception.getCause());
        }
    }
}
