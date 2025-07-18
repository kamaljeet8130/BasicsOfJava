package basic.maths;

public class CheckNumberPositiveOrNegative {
    public static boolean isPositive(int number){
        if (number == 0)
            return false;
        return number>0;
    }

    public static void main(String[] args) {
        System.out.println(isPositive(0));
    }
}
