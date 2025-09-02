package basic.maths;

public class FibonacciSeries {
    public static int fib(int number){
        int firstElement = 0 , secondElement = 1 , nextElement;
        if (number == 0)
            return 0;
        for (int i =1;i<number;i++){
            nextElement = firstElement + secondElement;
            firstElement = secondElement;
            secondElement = nextElement;
        }
        return secondElement;
    }
    public static void main(String[] args) {
     int number = 9;
        System.out.println(fib(number));
    }
}
