package Pattern;

import java.util.Scanner;

public class Pattern27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for(int i = 1;i<=number;i++){
            for(int j = 1;j<=number-i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            int p = i-1;
            for (int j = 1;j<=p;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}


