package basic.maths;

public class FibonacciSeriesPrinter {
    public static void fibonacciSeries(int number){
        int firstTerm = 0,secondTerm = 1,nextTerm;
        for (int i = 1;i<=number;i++){
            System.out.print(firstTerm+ ",");
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }
    }

    public static void main(String[] args) {
        fibonacciSeries(10);
    }

}
