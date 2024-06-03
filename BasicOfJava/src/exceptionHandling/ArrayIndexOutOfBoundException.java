package exceptionHandling;

public class ArrayIndexOutOfBoundException {
    public static void main(String[] args) {
        try {
            System.out.println(args[1]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught");
        }
        System.out.println("This statement will executed");
    }
}