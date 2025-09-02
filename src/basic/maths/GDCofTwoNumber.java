package basic.maths;

import java.util.Scanner;

public class GDCofTwoNumber {
    public static int gcdFinder(int number1,int number2){
        int minimum = Math.min(number1,number2);
        int gcd = 1;
        for (int i = 2;i<minimum;i++){
            if (number1%i ==0 && number2%i==0)
                gcd = i;
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println(gcdFinder(number1,number2));
    }
}
