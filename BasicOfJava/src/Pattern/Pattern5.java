package Pattern;

public class Pattern5 {
    public static void main(String[] args) {

        int number =1 ;
        for(int i = 1;i<=5;i++){
            for (int j = 1;j<=5;j++){
                System.out.print(number + " ");
                number = number + 1;
            }
            System.out.println();
        }
    }

}

//pattern design :
//1 2 3 4 5
//6 7 8 9 10
//11 12 13 14 15
//16 17 18 19 20
//21 22 23 24 25
