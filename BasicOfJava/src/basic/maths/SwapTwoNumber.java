package basic.maths;

public class SwapTwoNumber {
    public static void swapNumbers(int number1,int number2){
        System.out.println("number before swaping: ");
        System.out.println(number1);
        System.out.println(number2);
        number1 = number1-number2;
        number2 = number1 + number2;
        number1 = number2- number1;
        System.out.println("number after swaping : ");
        System.out.println(number1);
        System.out.println(number2);
    }

    public static void main(String[] args) {
        swapNumbers(12,20);
    }
}
