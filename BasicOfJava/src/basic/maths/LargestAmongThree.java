package basic.maths;

import java.util.Scanner;

public class LargestAmongThree {
    public static int largestNumber(int number1,int number2,int number3){
        if (number1>=number2){
            if (number1>=number3)
                return number1;
        }
        else if (number2>=number3)
            return number2;
        return number3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        System.out.println(largestNumber(number1,number2,number3));

    }
}
