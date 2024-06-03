package basic;

import java.util.Scanner;

public class BinaryToDecimal {
    public static int powerOfANumberRaiseToN(int number,int raisingUnit){
        int power =1;
        for (int i = 1;i<=raisingUnit;i++){
            power = power*number;
        }
        return power;
    }
    public static int binaryToDecimalConvertor(int number) {
        int binaryNumber =0;
        int digitCount = 0;
        while (number!=0){
            int digit = number%10;
            if ((digit%10==1 || digit%10==0)&&number>0){
                binaryNumber = binaryNumber+(digit*powerOfANumberRaiseToN(2,digitCount));
                digitCount++;
                number/=10;
            }
            else
                return -1;
        }
        return binaryNumber;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(binaryToDecimalConvertor(number));

    }
}
