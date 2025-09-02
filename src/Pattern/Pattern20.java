package Pattern;

import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        char startingChar = (char)(64+number);
        for (int i = 1;i<=number;i++){
            for (int j = 0;j<i;j++){
                System.out.print((char) (startingChar + j));
            }
            System.out.println();
            startingChar--;
        }
    }
}

// design pattern:
//8
//H
//GH
//FGH
//EFGH
//DEFGH
//CDEFGH
//BCDEFGH
//ABCDEFGH