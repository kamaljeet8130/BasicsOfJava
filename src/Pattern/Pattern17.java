package Pattern;

public class Pattern17 {
    public static void main(String[] args) {
        for (int i = 0;i<4;i++){
            for (int j =0;j<4;j++){
                char ch = 'A';
                System.out.print((char) (ch + j) + " ");
            }
            System.out.println();
        }
    }
}

// pattern desing:
//A B C D
//A B C D
//A B C D
//A B C D
