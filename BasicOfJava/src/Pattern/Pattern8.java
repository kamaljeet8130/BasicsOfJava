package Pattern;

public class Pattern8 {
    public static void main(String[] args) {
        for (int row = 1;row<=5;row++){
            int number=1;
            for (int column =1 ;column<=6;column++){
                if (column%2==0){
                    System.out.print(row + " ");
                }
                else{
                    System.out.print(number + " ");
                    number = number + 1;
                }
            }
            System.out.println();
        }
    }
}

//Pattern design :
//1 1 2 1 3 1
//1 2 2 2 3 2
//1 3 2 3 3 3
//1 4 2 4 3 4
//1 5 2 5 3 5
