package exceptionHandling;

public class NullPointerException {
   static String s = null;

    public static void main(String[] args) {
        try {
            System.out.println(s.length());
        }catch (java.lang.NullPointerException e){
            e.printStackTrace();
            System.out.println("NullPointerExceptin caught");
        }
        System.out.println("this statement will executed");

    }
}
