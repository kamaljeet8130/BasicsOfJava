package Pattern;

import java.util.Scanner;

public class Pattern25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1;i<=number;i++){
            for (int j = 1;j<=number-i+1;j++){
                System.out.print(number-i+1);
            }
            System.out.println();
        }
    }
}

// pattern design:
//4
//4444
//333
//22
//1
