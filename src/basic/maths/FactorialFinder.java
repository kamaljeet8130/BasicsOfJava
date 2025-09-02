package basic.maths;

public class FactorialFinder {
    public static int findFactorial(long number){
        int factorial = 1;
        if(number == 1)
            return 1;
        for (int i = 1;i<=number;i++){
            factorial*=i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println(findFactorial(16));
    }
}
