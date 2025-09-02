package Pattern;

public class Pattern16 {
    public static void main(String[] args) {
        for (int i = 1;i<=5;i++){
            int startingValue = i;
            for (int j =1;j<=5;j++){
                System.out.print(startingValue + " ");
                startingValue++;
            }
            System.out.println();
        }
    }
}

//pattern design:
//1 2 3 4 5
//2 3 4 5 6
//3 4 5 6 7
//4 5 6 7 8
//5 6 7 8 9