package exceptionHandling;

public class ExceptionHandlingConcept6 {
    public static void main(String[] args) {
        String[] s = {"abc","123","xyz","456"};
        for (int i = 0;i<s.length;i++){
            try{
                int intValue = Integer.parseInt(s[i]);
                System.out.println(intValue);
            }catch (java.lang.NumberFormatException e){
                System.out.println("The thrown NumberFormatException will be caught here" + " for intValue " + s[i]);
            }
        }
    }
}
