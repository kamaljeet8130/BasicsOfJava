package basic.maths;

import java.util.Scanner;

public class EvenOddFinder {
    public static void evenOddFinder(int number){
        if (number%2 ==0){
            System.out.println("number is even");
        }
        else
            System.out.println("number is odd");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        evenOddFinder(number);
    }
}
