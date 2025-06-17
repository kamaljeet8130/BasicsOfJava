//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] arr = {3,2,1,2,2,3};
//        System.out.println(arr.length);
//        System.out.println(duplicateValue(arr,arr.length));
////        System.out.println(peakIndexInMountainArray(arr,100));
//    }
//    public static int duplicateValue(int[] arr,int n){
//        for (int i =0;i<n-1;i++){
//            if(arr[Math.abs(arr[i])]<0){
//                return i;
//            }
////            else arr[arr[i]]= - arr[arr[i]];
//        }
//        return -1;
//    }
//    public static int peakIndexInMountainArray(int[] arr,int target) {
//        Arrays.sort(arr);
//        int low = 0;
//        int high =arr.length-1;
//        while(low<high){
//            int mid = low +((target-arr[low])*(high-low))/(arr[high]-arr[low]);
//            if(target==arr[mid])
//                return mid;
//            else if(target>arr[mid])
//                low = mid+1;
//            else
//                high=mid-1;
//        }
//        return -1;
//    }
//}