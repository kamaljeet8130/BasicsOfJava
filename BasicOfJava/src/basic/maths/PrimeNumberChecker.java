package basic.maths;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static boolean primeNumberChecker(int number){
        if (number==1)
            return false;
        for (int i = 2;i<number;i++){
            if (number%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (primeNumberChecker(number))
            System.out.println("prime number");
        else
            System.out.println(" not a  prime number");
    }

}
