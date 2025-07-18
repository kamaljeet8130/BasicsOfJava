package basic.maths;

import java.util.Scanner;

public class BinaryToDecimal {
    public static int binaryToDecimalConvertor(int number){
        int decimalNumber = 0;
        int count = 0;
        while (number!=0){
            int digit = number%10;
            decimalNumber  = (digit*(int)Math.pow(2,count))+decimalNumber;
            count++;
            number/=10;
        }
        return decimalNumber;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(binaryToDecimalConvertor(number));

    }
}
