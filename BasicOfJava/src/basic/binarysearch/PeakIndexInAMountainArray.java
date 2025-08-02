package basic.binarysearch;

public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
    int[] arr = {6,5,4,3,2,3,2};
        System.out.println(peakIndex(arr));
    }
    public static int peakIndex(int[] arr){
        int start = 1;
        int end = arr.length-1;
        while (start < end){
            int mid = start+ (end-start)/2;
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid+1]>arr[mid]){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return -1;
    }

}
