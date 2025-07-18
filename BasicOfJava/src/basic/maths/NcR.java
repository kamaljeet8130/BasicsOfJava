package basic.maths;

import java.util.Scanner;

public class NcR {
    public  static int factorialFinder(int x ){
        int fact = 1;
        for (int i = 1;i<=x;i++)
            fact = fact * i;
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int choiceNumber = scanner.nextInt();
        int numberFactorial = factorialFinder(number);
        int den1 = factorialFinder(choiceNumber);
        int den2 = factorialFinder(number-choiceNumber);

        int factorial = numberFactorial/(den1*den2);
        System.out.println(factorial);

    }
}
