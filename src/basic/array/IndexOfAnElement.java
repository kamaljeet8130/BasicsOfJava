package basic.array;

public class IndexOfAnElement {
    public static void main(String[] args) {
        int[] arr = {3, 52, 5, 34, 34, 123, 1241, 124123, 5421};
        int[] sortedArray =arr;
        boolean isSorted = CheckIfArrayIsSorted.isArraySortedInAscendingOrder(arr, arr.length);
        if (!isSorted) {
             sortedArray = BubbleSort.sort(arr, arr.length);
        }
        System.out.print(arrayElementIndex(sortedArray,sortedArray.length,3));
    }

    public static int arrayElementIndex(int[] sortedArray, int n, int element) {
        int start = 0;
        int end = n-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (element == sortedArray[mid]) {
                return mid;
            } else if (element > sortedArray[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
