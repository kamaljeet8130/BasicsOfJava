package basic.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstAndLastOccurence {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{0, 0, 1, 1, 2, 2, 2, 2};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        int k = 2;
        int[] arr1 = firstAndLastPosition(list, list.size(), k);

        System.out.println("First and Last Positions:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        int[] arr1 = new int[2];
        arr1[0] = firstPosition(arr, n, k);
        arr1[1] = lastPosition(arr, n, k);
        return arr1;
    }

    public static int firstPosition(ArrayList<Integer> arr, int n, int k) {
        int start = 0;
        int end = arr.size() - 1;
        int firstOccurrence = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid).equals(k)) {
                firstOccurrence = mid;
                end = mid - 1;
            } else if (arr.get(mid) > k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return firstOccurrence;
    }

    public static int lastPosition(ArrayList<Integer> arr, int n, int k) {
        int start = 0;
        int end = arr.size() - 1;
        int lastOccurrence = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid).equals(k)) {
                lastOccurrence = mid;
                start = mid + 1;
            } else if (arr.get(mid) > k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return lastOccurrence;
    }

}
