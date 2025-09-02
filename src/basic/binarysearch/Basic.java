package basic.binarysearch;

public class Basic {
    public static void main(String[] args) {
        int[] arr = {3,4,6,9,12,16,17};
        int start = 0;
        int end = arr.length-1;
//        int target = (int)(Math.random()*arr.length);
        int target = 3;
        System.out.println("target is : " + target);
        while(start<end){
            int mid = start+ (end-start)/2;
            if(arr[mid] == target){
                System.out.println("target : " + target + " is found at index : " + mid);
                break;
            }
             else if(arr[mid]>target){
                end = mid-1;
            }
            else start=mid+1;
        }


    }

}
