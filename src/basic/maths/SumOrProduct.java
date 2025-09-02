package basic.maths;

public class SumOrProduct {
    public static long sumOrProduct(int n, int q) {
        long result = 1;
        if (q == 1) {
            result = n*(n+1)/2;
            return result;
        }
        else if (q == 2) {
            int i = 1;
            while (i <= n) {
                result *= i;
                result%=Math.pow(10,9)+7;
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sumOrProduct(17,1));
        System.out.println(sumOrProduct(15,2));
        System.out.println(sumOrProduct(15,1));
        System.out.println(sumOrProduct(5,2));
        System.out.println(sumOrProduct(12,1));
    }

}
