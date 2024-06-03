package Pattern;

public class Pattern15 {
    public static void main(String[] args) {
        for (int i =1;i<=4;i++){
            char startingChar = (char)('A'+i-1);
            for (int j = 1;j<=4;j++){
                System.out.print(startingChar);
                startingChar = (char) (startingChar+1);
            }
            System.out.println();
        }
    }
}
//design pattern :
//ABCD
//BCDE
//CDEF
//DEFG