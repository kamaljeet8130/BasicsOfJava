package exceptionHandling;

public class ExceptionHandlingConcept10 {
    public static void main(String[] args) {
        String[] s = {"abc","123",null,"xyz"};
        for (int i = 0;i<s.length;i++){
            try {
                int a = s[i].length();
                try {
                    int intValue = Integer.parseInt(s[i]);
                }catch (java.lang.NumberFormatException exception){
                    System.err.println("Number Foramte exception caught at position " + i + " for " + s[i]);
                }
            }catch (java.lang.NullPointerException exception){
                System.err.println("NullPointerException caught at position " + i + " for " + s[i]);
            }
        }
    }
}
