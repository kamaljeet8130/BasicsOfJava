package basic.maths;

import java.util.Scanner;

public class ReverseOfANumber {
        public static int reverse(int x) {
            int reverseInteger = 0;
            while(x!=0){
                int digit = x%10;
                x/=10;
                if(reverseInteger>(Integer.MAX_VALUE/10) || reverseInteger<(Integer.MIN_VALUE/10)){
                    return 0;
                }
                reverseInteger = reverseInteger *10 + digit;
            }

            return reverseInteger;
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(reverse(number));
    }
}
