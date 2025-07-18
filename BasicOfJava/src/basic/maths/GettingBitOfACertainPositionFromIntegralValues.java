package basic.maths;

import java.util.Scanner;

public class GettingBitOfACertainPositionFromIntegralValues {
    public  static boolean isBitSet(int number,int position){
        int bitMask =1<<position;
        return (bitMask & number)>=1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int position = scanner.nextInt();
        if (isBitSet(number,position))
            System.out.println("bit at " + position + " position is 1");
        else
            System.out.println("bit at " + position + " position is 0");
    }
}
