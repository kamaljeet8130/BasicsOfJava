package basic.maths;

import java.util.Scanner;

public class NumberOfDigitsInAnInteger {
    public static int countDigitOfAnInteger(int number){
        int count = 0;
        while (number!=0){
            number = number/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(countDigitOfAnInteger(number));
    }
}
