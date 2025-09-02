package basic.maths;

public class PrimeNumberBetweenTwoToN {
    public static boolean isPrime(int n){
        int d = 2;
        while (d<n){
            if (n%d ==0)
                return false;
            d++;
        }
        return true;
    }
    public static void PrimeNumberFinder(int n){
        for (int i = 2;i<=n;i++){
            boolean IsIprime = isPrime(i);
            if (IsIprime){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int n =  20;
        PrimeNumberFinder(n);
    }
}
