package Pattern;

public class Pattern14 {
    public static void main(String[] args) {
        for (int i =1;i<=4;i++){
            int n=i;
            for (int j = 1;j<=4;j++){
                System.out.print(n);
                n++;
            }
            System.out.println();
        }
    }
}
//pattern design:
//1234
//2345
//3456
//4567