package exceptionHandling;

public class ClassCastException {
    public static void main(String[] args) {
        Object o = new Object();
        try {
            ClassCastException classCastException = (ClassCastException) o;
        }catch (java.lang.ClassCastException e){
            e.printStackTrace();
            System.out.println("Exception caught");
        }
        System.out.println("this statement will executed");
    }
}
