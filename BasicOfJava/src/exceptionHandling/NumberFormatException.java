package exceptionHandling;

public class NumberFormatException {
    public static void main(String[] args) {
        try{
            int i= Integer.parseInt("ten");
        }catch (java.lang.NumberFormatException e){
            int i = Integer.parseInt("10");
            System.out.println(i);
        }
    }
}
