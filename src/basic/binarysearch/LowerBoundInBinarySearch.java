package basic.binarysearch;

public class LowerBoundInBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3};
        int x = 0;
        //o/p = 1  Explanation: Index '0' is the smallest index such that 'arr[0]' is not less than 'x'.
        System.out.println(lowerBound(arr,arr.length,0));
    }
    public static int lowerBound(int[] arr , int n , int x){
        int start =  0;
        int end = n-1;
        int ans = n;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>=x){
                ans = mid;
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return ans;
    }
}

