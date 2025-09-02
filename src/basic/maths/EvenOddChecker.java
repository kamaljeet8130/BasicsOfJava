package basic.maths;

import java.util.Scanner;

public class EvenOddChecker {
    public static boolean isEven(int number1){
        return number1 % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (isEven(number))
            System.out.println("number is even");

        else
            System.out.println("number is odd");
    }
}
