package Pattern;

public class Pattern10 {
    public static void main(String[] args) {
        for (int i =1;i<=4;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

// pattern design:

//1
//2 2
//3 3 3
//4 4 4 4