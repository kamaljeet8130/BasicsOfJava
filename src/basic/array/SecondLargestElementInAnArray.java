package basic.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondLargestElementInAnArray {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(findSecondLargestElement(arr));
    }
    public static int findSecondLargestElement(int[] arr){
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements " + Arrays.toString(arr));
        }
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0;i<arr.length;i++){
            if (arr[i]>firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            else if(arr[i]<firstLargest && arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        if (secondLargest==Integer.MIN_VALUE){
            throw new IllegalArgumentException("value in array are same " + Arrays.toString(arr));
        }
        return secondLargest;
    }
}
