package Pattern;

public class Pattern21 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1;i<=n;i++){
            for (int j = 0;j<i;j++){
                System.out.print(n-j);
            }
            System.out.println();
        }
    }
}

//design pattern:
//5
//54
//543
//5432
//54321