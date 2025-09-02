package basic.array;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        System.out.println(isArraySortedInAscendingOrder(arr, arr.length));
    }
    public static boolean isArraySortedInAscendingOrder(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
