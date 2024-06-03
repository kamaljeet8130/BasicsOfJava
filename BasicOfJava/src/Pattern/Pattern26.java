package Pattern;

import java.util.Scanner;

public class Pattern26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            int p = i-1;
            for (int j = 1;j<=i-1;j++){
                System.out.print(p);
                p--;
            }
            System.out.println();
        }

    }
}

// pattern design:
//4
//   1
//  121
// 12321
//1234321
