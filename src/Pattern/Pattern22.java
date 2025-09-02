package Pattern;

import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1;i<=n;i++){
            for (int j = 0;j<i;j++){
                System.out.print((char) ('A'+n-j-1));
            }
            System.out.println();
        }
    }
}
// pattern design :
//7
//G
//GF
//GFE
//GFED
//GFEDC
//GFEDCB
//GFEDCBA