package basic.maths;

public class SumOfNaturalNumber {
    public static int calculateSumOfNaturalNumberMethodOne(int number){
        int sum = 0;
        for (int i = 1;i<=number;i++){
            sum+=i;
        }
        return sum;
    }
    public static int calculateSumOfNaturalNumberMethodTwo(int number){
        return ( (number*number) + number) /2;
    }

    public static void main(String[] args) {
        System.out.println(calculateSumOfNaturalNumberMethodOne(35));
        System.out.println(calculateSumOfNaturalNumberMethodTwo(35));
    }
}
