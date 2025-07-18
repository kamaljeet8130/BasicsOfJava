package basic.maths;

import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isNumberPalindrome(int number){
        int newNumber = number;
        int reverseNumber = 0;
        while (newNumber!=0){
            int digit = newNumber%10;
            newNumber/=10;
            reverseNumber = reverseNumber * 10 + digit;
        }
        return  reverseNumber == number;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (isNumberPalindrome(number))
            System.out.println("number is palindrome " + number);
        else
            System.out.println("number is not a palindrome number " + number);

    }
}
