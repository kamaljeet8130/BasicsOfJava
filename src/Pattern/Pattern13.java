package Pattern;

public class Pattern13 {
    public static void main(String[] args) {
        for (int i = 1;i<=4;i++){
            for (int j = 1;j<=4;j++){
                System.out.print((char)('A'+j-1));
            }
            System.out.println();
        }

        System.out.println('\n');
        samePattern();
    }

    public static void samePattern(){
        for (int i = 1 ;i<=4;i++){
            char ch = 'A';
            for (int j = 1 ;j<=4;j++){
                System.out.print(ch);
                int n = ch +1;
                ch = (char)n;
            }
            System.out.println();
        }
    }
}

//pattern design:
//ABCD
//ABCD
//ABCD
//ABCD
