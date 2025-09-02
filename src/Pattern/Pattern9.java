package Pattern;

public class Pattern9 {
    public static void main(String[] args) {
        for (int row = 1;row<=5;row++){
            int number =1 ;
            for (int column = 1;column<=6;column++){
                if (column%2!=0){
                    System.out.print(row + " ");
                }
                else {
                    System.out.print(number + " ");
                    number = number + 1;
                }
            }
            System.out.println();
        }
    }

}
