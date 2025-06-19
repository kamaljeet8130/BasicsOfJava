package basic.array;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 1, 5, 123, 523, 123, 213, 3123};
        for (int i : sort(arr, arr.length)) {
            System.out.print(i + ",");
        }

    }

    public static int[] sort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            boolean isSorted = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = true;
                }
            }
            if (!isSorted) {
                break;
            }
        }
        return arr;
    }
}
