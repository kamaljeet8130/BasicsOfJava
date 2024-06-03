package exceptionHandling;

public class ExceptionHandlingConcept11 {
    public static void main(String[] args)  {
        nestedTry();
    }
    static  void nestedTry(){
        try {
            int i = Integer.parseInt("abc");
        }catch (java.lang.NumberFormatException e){
            System.out.println("NumberForamteExceptin caught");
        }
    }
}
