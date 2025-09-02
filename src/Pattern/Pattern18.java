package Pattern;

public class Pattern18 {
    public static void main(String[] args) {
        char k = 'A';
        for (int i = 0;i<4;i++){
            for (int j = 0;j<4;j++){
                System.out.print((char) (k + j) + " ");
            }
            System.out.println();
            k++;
        }
    }
}

// pattern design:
//A B C D
//B C D E
//C D E F
//D E F G
