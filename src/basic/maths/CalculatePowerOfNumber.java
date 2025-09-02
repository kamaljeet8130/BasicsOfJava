package basic.maths;

public class CalculatePowerOfNumber {
    public static int powerOfNumber(int number,int power){
        int numberRaiseToPower = 1;
        for (int i = 1;i<=power;i++){
            numberRaiseToPower*= number;
        }
        return numberRaiseToPower;
    }

    public static void main(String[] args) {
        System.out.println(powerOfNumber(3,4));
    }
}
