package basic.array;

import java.util.Arrays;

public class LinearAndBinarySearchFunction {
    static int linersSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    static int binarySearch(int[] arr, int key) {
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(linersSearch(new int[]{10, 12, 18, 22, 6, 5, 11}, 22));
        System.out.println(binarySearch(new int[]{10, 12, 18, 22, 6, 5, 11}, 22));


    }
}
