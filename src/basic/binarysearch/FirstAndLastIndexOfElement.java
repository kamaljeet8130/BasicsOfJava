package basic.binarysearch;

public class FirstAndLastIndexOfElement {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 10};
        for (int i : searchRange(arr, 8)) {
            System.out.println(i);
        }
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
//        arr[0] = firstOccurence(nums, target);
//        arr[1] = lastOccurence(nums, target);
        arr[0] = findOccurrence(nums,target,true);
        arr[1] = findOccurrence(nums,target,false);
        return arr;
    }

//    public static int firstOccurence(int[] arr, int target) {
//        int start = 0;
//        int end = arr.length;
//        while (start < end) {
//            int mid = start + (end - start) / 2;
//            if (arr[mid] == target) {
//                end = mid - 1;
//
//            }
//            else {
//                start = mid+1;
//            }
//        }
//        return -1;
//    }
//
//    public static int lastOccurence(int[] arr, int target) {
//        for (int i = arr.length - 1; i >= 0; i--) {
//            if (arr[i] == target) {
//                return i;
//            }
//        }
//        return -1;
//    }

//    public  static  int firstOccurence(int[] arr, int target){
//        int start  = 0;
//        int end = arr.length-1;
//        int firstOccurence = -1;
//        while(start<=end){
//            int mid = start + (end-start)/2;
//            if (arr[mid] ==target){
//                firstOccurence= mid;
//                end = mid-1;
//            }
//            else if(arr[mid]<target){
//                start = mid+1;
//            }
//            else if(arr[mid]>target){
//                end = mid-1;
//            }
//        }
//        return firstOccurence;
//    }
//    public static int lastOccurence(int[] arr, int target){
//        int start = 0;
//        int end = arr.length-1;
//        int lastOccurence = -1;
//        while (start<=end){
//            int mid = start+ (end-start)/2;
//            if(arr[mid]==target){
//                lastOccurence = mid;
//                start = mid+1;
//            }
//            else if(arr[mid]<target){
//                start = mid+1;
//            }
//            else if(arr[mid] >target){
//                end = mid-1;
//            }
//        }
//        return lastOccurence;
//    }
    public static int findOccurrence(int[] arr , int target, boolean findFirst){
        int start = 0;
        int end = arr.length-1;
        int result = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                result = mid;
                if(findFirst){
                    end = mid-1;
                }
                else{
                    start =mid+1;
                }
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return  result;
    }
}

