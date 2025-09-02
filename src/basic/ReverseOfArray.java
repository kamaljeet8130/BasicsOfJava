package basic;

import java.util.Arrays;

public class ReverseOfArray {
    public static void main(String[] args) {
        int[] arr =  {1, 2, 3, 2, 1};
        System.out.println("Array before reverse");
        for (int i : arr){
            System.out.print(i+" ");
        }
        System.out.println("array after reverse using get new array");
        for (int i : getReversedArray(arr)){
            System.out.print(i+ " ");
        }
        System.out.println("array after using reverse method");
        for (int i : reverseArray(arr)){
            System.out.print(i+ " ");
        }
        boolean flag = isPerfect(5,arr);
        System.out.println(flag);

    }
    public static int[] getReversedArray(int[] arr){
        int[] reverseArr = new int[arr.length];
        int i = 0;
        int k = reverseArr.length-1;
        while (i<arr.length){
            reverseArr[k] = arr[i];
            i++;
            k--;
        }
        return reverseArr;
    }
    public static int[] reverseArray(int[] arr){
        int low  = 0;
        int high = arr.length-1;
        while (low!=high){
            int temp;
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;

        }
        return arr;
    }
    public static boolean isPerfect(int n, int[] arr) {
        int[] reverseArray = new int[n];
        int k = n-1;
        for(int i= 0;i<n;i++){
            reverseArray[i] = arr[k];
            k--;
        }
        if(Arrays.equals(reverseArray, arr))
            return true;

        return false;
    }


}
