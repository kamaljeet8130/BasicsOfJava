package basic.array;

import java.util.Arrays;

public class MissinNumber {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
//        System.out.println(missingNumber(arr));
        System.out.println(missingNumberApproach2(arr));

    }
    public static int missingNumber(int[] arr){
        Arrays.sort(arr);
        int start  = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == mid){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return start;
    }
    public static int missingNumberApproach2(int[] arr){
        int n = arr.length;
        int sum = (n * (n+1)/2);
        int actualSum = 0;
        for (int i=0;i<arr.length;i++){
            actualSum+=arr[i];
        }
        int missingNumber = sum-actualSum;
        return missingNumber;
    }
}
