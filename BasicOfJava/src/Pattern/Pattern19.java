package Pattern;

public class Pattern19 {
    public static void main(String[] args) {
        char startingChar = 'A';
        for (int i = 1;i<=3;i++){

            for (int j = 0;j<i;j++){
                System.out.print(startingChar + " ");
            }
            startingChar++;
            System.out.println();
        }
    }
}

//design pattern:
//A
//B B
//C C C
