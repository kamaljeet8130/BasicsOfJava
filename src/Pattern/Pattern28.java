package Pattern;

public class Pattern28 {
    public static void main(String[] args) {
//        int n = 4;
//        for (int i =1;i<=n;i++){
//            for (int j = 1;j<=n-i;j++){
//                System.out.print("*");
//            }
//            int p =i;
//            for (int j = 1;j<=i;j++){
//                System.out.print(p);
//                p++;
//            }
//            for (int j = i-1;j>=1;j--){
//                System.out.print(j);
//            }
//            System.out.println();
//        }



        for (int i = 1; i <= 4; i++) {
            // Print leading spaces
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            // Print increasing numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print decreasing numbers from i down to 1 (exclusive)
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            // Add a new line after each row
            System.out.println();
        }
    }
}
