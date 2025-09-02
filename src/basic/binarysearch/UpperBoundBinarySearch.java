package basic.binarysearch;

public class UpperBoundBinarySearch {

    public static void main(String[] args) {
       int[] arr = {-50, -10, -10, 0, 0, 0, 1, 2, 2, 2, 5, 7, 7, 9, 12, 12, 15, 18, 20, 25, 30};
       int target = 0;
        System.out.println(upperBound(arr,target));

    }
    public static int upperBound(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        int result = -1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]>target){
                result = mid;
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return  result;
    }
}


/*
Description:
Given a sorted array, find the index of the first element that is strictly greater than a given target.
This is called an upper bound search.
If no such element exists (all elements ≤ target), return -1 or the size of the array depending on the problem's convention.
arr = [2, 4, 6, 8, 10, 12]
target = 6
Index = 3
Element = 8
 */