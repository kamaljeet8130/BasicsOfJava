package exceptionHandling;

public class ExceptionHandlingConcept9 {
    public static void main(String[] args) {
        String[] s = {"abc","123",null,"xyz"};
        for (int i =0;i<s.length;i++){
            try {
                int a = s[i].length()+ Integer.parseInt(s[i]);
            }catch (java.lang.NullPointerException | java.lang.NumberFormatException | ArrayIndexOutOfBoundsException exception){
                exception.printStackTrace();

            }
        }
    }

}
