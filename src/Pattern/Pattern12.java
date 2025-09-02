package Pattern;

public class Pattern12 {
    public static void main(String[] args) {
        int t;
        for (int i =1;i<=4;i++){
            t = i;
            for (int j=1;j<=i;j++){
                System.out.print(t + " ");
                t = t +1;
            }
            System.out.println();
        }
    }
}

//pattern design:
//1
//2 3
//3 4 5
//4 5 6 7
