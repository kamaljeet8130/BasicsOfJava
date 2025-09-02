package basic.binarysearch;

public class SearchInARotatedSortedArray {
    public static void main(String[] args) {
        int [] arr = {13,14,15,16,17,18,19,20,1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println(search(arr,20));
    }
    public static int search(int[] arr , int target){
        int pivot = pivotIndex(arr);
        int start;
        int end;
        if(target>=arr[0]){
            end = pivot-1;
            start=0;
        }
        else {
            start = pivot;
            end = arr.length-1;
        }
        while (start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid] ==target){
                return mid;
            }
            if(target>arr[mid]){
                start=mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static int pivotIndex(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int mid = start + (end-start)/2;
            if (arr[mid] > arr[end]){
                start = mid+1;
            }
            else {
                end = mid;
            }
        }
        return start;
    }


}
