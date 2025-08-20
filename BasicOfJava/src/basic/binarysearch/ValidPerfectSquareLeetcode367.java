package basic.binarysearch;

public class ValidPerfectSquareLeetcode367 {
    public static void main(String[] args) {
        int[] nonPerfectSquares = {
                2,
                3,
                5,
                6,
                8,
                10,
                15,
                26,
                50,
                145,
                1025,
                2499,
                999999999,
                2147395601,
                2147483647
        };

        for (int i : nonPerfectSquares){
            System.out.println(isPerfectSquare(i) + ": " + i );
        }

    }

    public static  boolean isPerfectSquare(int num) {
        int start = 0;
        int end = num;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == num / mid) {
                return true;
            } else if (mid > num / mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}
